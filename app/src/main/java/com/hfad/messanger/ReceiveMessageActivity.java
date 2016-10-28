package com.hfad.messanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {
    TextView textViewMessage;
    TextView textViewSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        textViewMessage = (TextView) findViewById(R.id.message);
        textViewSubject = (TextView) findViewById(R.id.subject);
        if (intent != null) {
            String text = intent.getStringExtra(Intent.EXTRA_TEXT);
            String subject = intent.getStringExtra(Intent.EXTRA_SUBJECT);
            textViewMessage.setText(text);
            textViewSubject.setText(subject);
        }
    }
}
