package com.example.rosalsaini.carindicate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button leftButton = findViewById(R.id.leftDoor);
        Button rightButton = findViewById(R.id.rightDoor);
        Button parkingButton = findViewById(R.id.parkingdoor);

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            newWindow(v);
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            newWindow(v);
            }
        });
        parkingButton.setOnClickListener((View v) -> {
            newWindow(v);
            });

    }
    public void newWindow(View v){
        Intent intent = new Intent(this,under_constructor.class);
        startActivity(intent);
    }
}
