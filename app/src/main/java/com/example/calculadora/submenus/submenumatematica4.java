package com.example.calculadora.submenus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;
import com.example.calculadora.zmatematicabhaskara;

public class submenumatematica4 extends AppCompatActivity {
    private CardView buttonsubmatmenu4a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenumatematica4);

        buttonsubmatmenu4a = findViewById(R.id.buttonsubmatmenu4a);

        ////////--------
        buttonsubmatmenu4a.setOnClickListener(view -> openActivity_zmatematicabhaskara());
        ////////--------
    }

    public void openActivity_zmatematicabhaskara() {
        Intent intent = new Intent(this, zmatematicabhaskara.class);
        startActivity(intent);
    }

}