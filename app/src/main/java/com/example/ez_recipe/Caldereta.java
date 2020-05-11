package com.example.ez_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Caldereta extends AppCompatActivity {
    Button cook_now;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caldereta);
     cook_now = findViewById(R.id.cook_now);
     cook_now.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(Caldereta.this, "COOK WITH HEART", Toast.LENGTH_SHORT).show();
             intent = new Intent(Caldereta.this, Caldereta_Procedure.class);
             startActivity(intent);
         }
     });
    }
}
