package com.example.calculadora.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import com.example.calculadora.R;
import com.example.calculadora.zeletronicacorrentedebase;
import com.example.calculadora.zeletronicaimpedanciadebase;
import com.example.calculadora.zeletronicaleideohm;
import com.example.calculadora.zeletronicaresistenciaequivalente;
import com.example.calculadora.zeletronicaresistenciainternadocapacitor;
import com.example.calculadora.zeletronicatransformacaodeltaestrela;
import com.example.calculadora.zeletronicatransformacaoestreladelta;

public class Menueletronica extends AppCompatActivity {
    private CardView buttoneletmenu1, buttoneletmenu2, buttoneletmenu3, buttoneletmenu4, buttoneletmenu5, buttoneletmenu6, buttoneletmenu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menueletronica);

        buttoneletmenu1 = findViewById(R.id.buttoneletmenu1);
        buttoneletmenu2 = findViewById(R.id.buttoneletmenu2);
        buttoneletmenu3 = findViewById(R.id.buttoneletmenu3);
        buttoneletmenu4 = findViewById(R.id.buttoneletmenu4);
        buttoneletmenu5 = findViewById(R.id.buttoneletmenu5);
        buttoneletmenu6 = findViewById(R.id.buttoneletmenu6);
        buttoneletmenu7 = findViewById(R.id.buttoneletmenu7);

        buttoneletmenu1.setOnClickListener(view -> openActivity_zeletronicaleideohm());
        buttoneletmenu2.setOnClickListener(view -> openActivity_zeletronicaimpedanciadebase());
        buttoneletmenu3.setOnClickListener(view -> openActivity_zeletronicacorrentedebase());
        buttoneletmenu4.setOnClickListener(view -> openActivity_zeletronicaresistenciaequivalente());
        buttoneletmenu5.setOnClickListener(view -> openActivity_zeletronicaresistenciainternadocapacitor());
        buttoneletmenu6.setOnClickListener(view -> openActivity_zeletronicatransformacaoestreladelta());
        buttoneletmenu7.setOnClickListener(view -> openActivity_zeletronicatransformacaodeltaestrela());

    }

    public void openActivity_zeletronicaleideohm() {
        Intent intent = new Intent(this, zeletronicaleideohm.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicaimpedanciadebase() {
        Intent intent = new Intent(this, zeletronicaimpedanciadebase.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicacorrentedebase() {
        Intent intent = new Intent(this, zeletronicacorrentedebase.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicaresistenciaequivalente() {
        Intent intent = new Intent(this, zeletronicaresistenciaequivalente.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicaresistenciainternadocapacitor() {
        Intent intent = new Intent(this, zeletronicaresistenciainternadocapacitor.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicatransformacaoestreladelta() {
        Intent intent = new Intent(this, zeletronicatransformacaoestreladelta.class);
        startActivity(intent);
    }

    public void openActivity_zeletronicatransformacaodeltaestrela() {
        Intent intent = new Intent(this, zeletronicatransformacaodeltaestrela.class);
        startActivity(intent);
    }
}