package com.hfad.messanger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {
    private EditText textViewMessage;
    private EditText textViewSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        textViewMessage = (EditText) findViewById(R.id.message);
        textViewSubject = (EditText) findViewById(R.id.subject);
    }

    public void onSendMessage(View view) {
        String message = textViewMessage.getText().toString();
        String subject = textViewSubject.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent = Intent.createChooser(intent, getString(R.string.chooser));
        startActivity(intent);
    }
}
