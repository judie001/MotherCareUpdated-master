package com.example.mothercarereminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /////////////////NALUBEGA JUDITH///////////////////
        ////////2017/BIT/171....................
        start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startButton(view);
            }
        });

    }
    public void startButton(View view)
    {
        Intent intent = new Intent(this,HomePageClass.class);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ACTIVITY HAS STARTED", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "ACTIVITY STOPPED", Toast.LENGTH_SHORT).show();
    }
}
