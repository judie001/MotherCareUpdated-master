package com.example.mothercarereminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Help extends AppCompatActivity {

    EditText mailto,mailsub,mailmes;
    Button reply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        mailto = findViewById(R.id.mailto);
        mailsub = findViewById(R.id.mailsub);
        mailmes = findViewById(R.id.mailmes);
        reply = findViewById(R.id.reply);
        reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = mailmes.getText().toString();
                String to = mailto.getText().toString();
                String sub = mailsub.getText().toString();
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, sub);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Send Message Via "));
            }
        });
    }
}
