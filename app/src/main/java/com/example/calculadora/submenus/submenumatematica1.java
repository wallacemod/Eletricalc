package com.example.calculadora.submenus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;
import com.example.calculadora.zmatematicajuroscompostos;
import com.example.calculadora.zmatematicajurossimples;

public class submenumatematica1 extends AppCompatActivity {
    private CardView buttonsubmatmenu1a, buttonsubmatmenu1b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenumatematica1);

        buttonsubmatmenu1a = findViewById(R.id.buttonsubmatmenu1a);
        buttonsubmatmenu1b = findViewById(R.id.buttonsubmatmenu1b);

        ////////--------
        buttonsubmatmenu1a.setOnClickListener(view -> openActivity_zmatematicajurossimples());
        buttonsubmatmenu1b.setOnClickListener(view -> openActivity_zmatematicajuroscompostos());
        ////////--------
    }

    public void openActivity_zmatematicajurossimples() {
        Intent intent = new Intent(this, zmatematicajurossimples.class);
        startActivity(intent);
    }

    public void openActivity_zmatematicajuroscompostos() {
        Intent intent = new Intent(this, zmatematicajuroscompostos.class);
        startActivity(intent);
    }
}