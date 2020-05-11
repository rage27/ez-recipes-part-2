package com.example.ez_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Categories extends AppCompatActivity {
    Button adobo;
    Button caldereta;
    Button nilagang_baka;
    Button bicol_express;
    Button pinakbet;
    Intent intent;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    Intent intent5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        adobo = findViewById(R.id.adobo);
        adobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Categories.this, "Let's Prepare!", Toast.LENGTH_SHORT).show();
                intent = new Intent(Categories.this,Adobo.class);
                startActivity(intent);

            }
        });
        caldereta = findViewById(R.id.caldereta);
        caldereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Categories.this, "CALDERETA TIME!", Toast.LENGTH_SHORT).show();
                intent2 = new Intent(Categories.this,Caldereta.class);
                startActivity(intent2);

            }
        });
        nilagang_baka = findViewById(R.id.nilagang_baka);
        nilagang_baka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Categories.this, "Don't forget to cook rice with this!", Toast.LENGTH_SHORT).show();
                intent3 = new Intent(Categories.this,Nilagang_Baka.class);
                startActivity(intent3);
            }
        });
        pinakbet = findViewById(R.id.pinakbet);
        pinakbet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Categories.this, "Healthy for living!", Toast.LENGTH_SHORT).show();
                intent4 = new Intent(Categories.this,Pinakbet.class);
                startActivity(intent4);
            }
        });
        bicol_express = findViewById(R.id.bicol_express);
        bicol_express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Categories.this, "BICOL EXPRESS!", Toast.LENGTH_SHORT).show();
                intent5 = new Intent(Categories.this,Bicol_Express.class);
                startActivity(intent5);
            }
        });
    }
}
