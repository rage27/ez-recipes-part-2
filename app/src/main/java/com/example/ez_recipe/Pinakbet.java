package com.example.ez_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pinakbet extends AppCompatActivity {
    Button cook_now;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinakbet);

        cook_now = findViewById(R.id.cook_now);
        cook_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Pinakbet.this, "Make sure your vegetables are fresh!", Toast.LENGTH_SHORT).show();
                intent = new Intent(Pinakbet.this,Pinakbet_Procedure.class);
                startActivity(intent);
            }
        });
    }
}
