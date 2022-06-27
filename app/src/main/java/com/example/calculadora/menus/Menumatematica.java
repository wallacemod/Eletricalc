package com.example.calculadora.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculadora.R;
import com.example.calculadora.submenus.submenumatematica1;
import com.example.calculadora.submenus.submenumatematica2;
import com.example.calculadora.submenus.submenumatematica3;
import com.example.calculadora.submenus.submenumatematica4;

public class Menumatematica extends AppCompatActivity {
    private CardView buttonmatmenu1, buttonmatmenu2, buttonmatmenu3, buttonmatmenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumatematica);

        buttonmatmenu1 = findViewById(R.id.buttonmatmenu1);
       // buttonmatmenu2 = findViewById(R.id.buttonmatmenu2);
       // buttonmatmenu3 = findViewById(R.id.buttonmatmenu3);
        buttonmatmenu4 = findViewById(R.id.buttonmatmenu4);

        ////////--------
        buttonmatmenu1.setOnClickListener(view -> openActivity_submenumatematica1());
        //buttonmatmenu2.setOnClickListener(view -> openActivity_submenumatematica2());
       // buttonmatmenu3.setOnClickListener(view -> openActivity_submenumatematica3());
        buttonmatmenu4.setOnClickListener(view -> openActivity_submenumatematica4());
        ////////--------
    }

    public void openActivity_submenumatematica1() {
        Intent intent = new Intent(this, submenumatematica1.class);
        startActivity(intent);
    }

    public void openActivity_submenumatematica2() {
        Intent intent = new Intent(this, submenumatematica2.class);
        startActivity(intent);
    }

   // public void openActivity_submenumatematica3() {
   //     Intent intent = new Intent(this, submenumatematica3.class);
   //     startActivity(intent);
   // }

    public void openActivity_submenumatematica4() {
        Intent intent = new Intent(this, submenumatematica4.class);
        startActivity(intent);
    }
}