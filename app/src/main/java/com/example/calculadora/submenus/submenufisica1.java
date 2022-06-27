package com.example.calculadora.submenus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;
import com.example.calculadora.zfisicaconversorarea;
import com.example.calculadora.zfisicaconversorcomprimento;
import com.example.calculadora.zfisicaconversormassa;
import com.example.calculadora.zfisicaconversortemperatura;

public class submenufisica1 extends AppCompatActivity {
    private CardView buttonsubfismenu1a, buttonsubfismenu1b, buttonsubfismenu1c, buttonsubfismenu1d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenufisica1);

        buttonsubfismenu1a = findViewById(R.id.buttonsubfismenu1a);
        buttonsubfismenu1b = findViewById(R.id.buttonsubfismenu1b);
        buttonsubfismenu1c = findViewById(R.id.buttonsubfismenu1c);
        buttonsubfismenu1d = findViewById(R.id.buttonsubfismenu1d);

            ////////--------
        buttonsubfismenu1a.setOnClickListener(view -> openActivity_zmatematicaconversorarea());
        buttonsubfismenu1b.setOnClickListener(view -> openActivity_zmatematicaconversorcomprimento());
        buttonsubfismenu1c.setOnClickListener(view -> openActivity_zmatematicaconversormassa());
        buttonsubfismenu1d.setOnClickListener(view -> openActivity_zmatematicaconversortemperatura());
            ////////--------
        }
        public void openActivity_zmatematicaconversorarea () {
            Intent intent = new Intent(this, zfisicaconversorarea.class);
            startActivity(intent);
        }

        public void openActivity_zmatematicaconversorcomprimento () {
            Intent intent = new Intent(this, zfisicaconversorcomprimento.class);
            startActivity(intent);
        }

        public void openActivity_zmatematicaconversormassa () {
            Intent intent = new Intent(this, zfisicaconversormassa.class);
            startActivity(intent);
        }

        public void openActivity_zmatematicaconversortemperatura () {
            Intent intent = new Intent(this, zfisicaconversortemperatura.class);
            startActivity(intent);
    }
}