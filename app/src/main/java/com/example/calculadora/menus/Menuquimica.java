package com.example.calculadora.menus;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculadora.R;
import com.example.calculadora.zquimicaentropia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menuquimica extends AppCompatActivity {
    private Button buttonquimmenu1, buttonquimmenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuquimica);

        buttonquimmenu1 = (Button) findViewById(R.id.buttonquimmenu1);
        buttonquimmenu2 = (Button) findViewById(R.id.buttonquimmenu2);

        buttonquimmenu1.setOnClickListener(view -> openActivity_zquimicaentropia());
    }

    public void openActivity_zquimicaentropia() {
        Intent intent = new Intent(this, zquimicaentropia.class);
        startActivity(intent);

    }
}