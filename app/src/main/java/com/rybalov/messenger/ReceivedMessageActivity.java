package com.rybalov.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViewRecivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewRecivedMsg = findViewById(R.id.textViewRecivedMessage);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewRecivedMsg.setText(msg);
    }
}