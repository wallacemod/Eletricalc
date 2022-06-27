package com.example.calculadora.submenus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;


public class submenumatematica2 extends AppCompatActivity {
    private CardView buttonsubmatmenu2a, buttonsubmatmenu2b, buttonsubmatmenu2c, buttonsubmatmenu2d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenumatematica2);

        buttonsubmatmenu2a = findViewById(R.id.buttonsubmatmenu2a);
        buttonsubmatmenu2b = findViewById(R.id.buttonsubmatmenu2b);
        buttonsubmatmenu2c = findViewById(R.id.buttonsubmatmenu2c);
        buttonsubmatmenu2d = findViewById(R.id.buttonsubmatmenu2d);

        }
}