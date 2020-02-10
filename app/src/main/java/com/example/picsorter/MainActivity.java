package com.example.picsorter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sortTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sortTaskButton = (Button) findViewById(R.id.sortTaskButton);

        sortTaskButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                        Intent myintent = new Intent(MainActivity.this, SortPicActivity.class);
                        startActivity(myintent);
            }
        });
    }
}