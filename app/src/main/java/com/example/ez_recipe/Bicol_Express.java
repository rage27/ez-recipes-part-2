package com.example.ez_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bicol_Express extends AppCompatActivity {

    Button cook_now;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicol__express);
        cook_now = findViewById(R.id.cook_now);
        cook_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Bicol_Express.this, "Smile and cook!", Toast.LENGTH_SHORT).show();
                intent = new Intent(Bicol_Express.this,BicolExpress_Procedure.class);
                startActivity(intent);
            }
        });
    }
}
