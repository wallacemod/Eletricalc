package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class zfisicaconversortemperatura extends AppCompatActivity {

    Spinner caixa1, caixa2;
    EditText n1, result;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zfisicaconversortemperatura);
        n1 = findViewById(R.id.n1);
        caixa1 = findViewById(R.id.caixa1);
        caixa2 = findViewById(R.id.caixa2);
        btnCalcular = findViewById(R.id.btnCalcular);


        String[] from = {"Celsius (°C)", "Fahrenheit (°F)", "Kevin (K)"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        caixa1.setAdapter(ad);

        String[] to = {"Celsius (°C)", "Fahrenheit (°F)", "Kevin (K)"};
        ArrayAdapter ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        caixa2.setAdapter(ad1);

        btnCalcular.setOnClickListener(v -> {

            String no1 = n1.getText().toString();

            if (no1.trim().isEmpty()) {
                Toast.makeText(zfisicaconversortemperatura.this, "Valor ausente", Toast.LENGTH_LONG).show();
            }
            else {

                result = findViewById(R.id.n2);


                double tot;

                double valor = Double.parseDouble(n1.getText().toString());

                // SEPARA
                // SEPARA
                if (caixa1.getSelectedItem().toString().equals("Celsius (°C)") && caixa2.getSelectedItem().toString().equals("Fahrenheit (°F)")) {
                    tot = (valor * (1.8)) + 32 ;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }

                if (caixa1.getSelectedItem().toString().equals("Celsius (°C)") && caixa2.getSelectedItem().toString().equals("Kevin (K)")) {
                    tot = valor + 273.15;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Fahrenheit (°F)") && caixa2.getSelectedItem().toString().equals("Celsius (°C)")) {
                    tot = (valor-32)*(0.5555);

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Fahrenheit (°F)") && caixa2.getSelectedItem().toString().equals("Kevin (K)")) {
                    tot = (valor-32)*(0.5555)+273.15;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Kevin (K)") && caixa2.getSelectedItem().toString().equals("Celsius (°C)")) {
                    tot = valor - 273.15;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Kevin (K)") && caixa2.getSelectedItem().toString().equals("Fahrenheit (°F)")) {
                    tot = (valor - 273.15) * (1.8) + 32;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals(caixa2.getSelectedItem().toString())) {
                    tot = valor;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa2.getSelectedItem().toString().equals("Celsius (°C)")) {
                    result.append(" °C");
                }
                if (caixa2.getSelectedItem().toString().equals("Fahrenheit (°F)")) {
                    result.append(" °F");
                }
                if (caixa2.getSelectedItem().toString().equals("Kevin (K)")) {
                    result.append(" K");
                }
            }

        });
    }
}