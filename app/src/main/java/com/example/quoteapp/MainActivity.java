package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button share;
    TextView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        share = findViewById(R.id.shares);
        quote = findViewById(R.id.quotes);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newquote = quote.getText().toString();
                Intent sendintent = new Intent();
                sendintent.setAction(Intent.ACTION_SEND);
                sendintent.setType("text/plain");
                sendintent.putExtra(Intent.EXTRA_TEXT , newquote);
                startActivity(sendintent);

            }
        });
    }
}