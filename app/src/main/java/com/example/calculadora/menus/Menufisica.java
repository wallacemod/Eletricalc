package com.example.calculadora.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;
import com.example.calculadora.submenus.submenufisica1;
import com.example.calculadora.submenus.submenumatematica2;
import com.example.calculadora.zfisicadensidade;
import com.example.calculadora.zfisicaforcapeso;

public class Menufisica extends AppCompatActivity {
    private CardView buttonfismenu1, buttonfismenu2, buttonfismenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menufisica);

        buttonfismenu1 = findViewById(R.id.buttonfismenu1);
        buttonfismenu2 = findViewById(R.id.buttonfismenu2);
        buttonfismenu3 = findViewById(R.id.buttonfismenu3);


        buttonfismenu1.setOnClickListener(view -> openActivity_zfisicadensidade());
        buttonfismenu2.setOnClickListener(view -> openActivity_zfisicaforcapeso());
        buttonfismenu3.setOnClickListener(view -> openActivity_submenufisica1());


    }

    public void openActivity_zfisicadensidade() {
        Intent intent = new Intent(this, zfisicadensidade.class);
        startActivity(intent);
    }
    public void openActivity_zfisicaforcapeso() {
        Intent intent = new Intent(this, zfisicaforcapeso.class);
        startActivity(intent);
    }
    public void openActivity_submenufisica1() {
        Intent intent = new Intent(this, submenufisica1.class);
        startActivity(intent);
    }
}
