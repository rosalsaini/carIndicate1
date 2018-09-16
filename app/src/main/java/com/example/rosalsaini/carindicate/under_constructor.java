package com.example.rosalsaini.carindicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class under_constructor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_constructor);
        Button backButton = findViewById(R.id.backbutton);

        backButton.setOnClickListener((View v)->{
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        });

    }
}
