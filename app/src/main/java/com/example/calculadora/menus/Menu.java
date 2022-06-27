package com.example.calculadora.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;

public class Menu extends AppCompatActivity {
    private CardView d1, d2, d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);

        d1.setOnClickListener(view -> openActivity_Menumatematica());
        d2.setOnClickListener(view -> openActivity_Menufisica());
        d3.setOnClickListener(view -> openActivity_Menueletronica());

    }

    public void openActivity_Menumatematica() {
        Intent intent = new Intent(this, Menumatematica.class);
        startActivity(intent);
    }

    public void openActivity_Menufisica() {
        Intent intent = new Intent(this, Menufisica.class);
        startActivity(intent);
    }

    public void openActivity_Menueletronica() {
        Intent intent = new Intent(this, Menueletronica.class);
        startActivity(intent);
    }
}