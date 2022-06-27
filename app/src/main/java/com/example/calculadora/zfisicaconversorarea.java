package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class zfisicaconversorarea extends AppCompatActivity {

    Spinner caixa1, caixa2;
    EditText n1, result;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zfisicaconversorarea);

        n1 = findViewById(R.id.n1);
        caixa1 = findViewById(R.id.caixa1);
        caixa2 = findViewById(R.id.caixa2);
        btnCalcular = findViewById(R.id.btnCalcular);




        String[] from = {"Metros quadrados (m²)", "Centímetros quadrados (cm²)", "Hectares (ha)", "Acres (ac)"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        caixa1.setAdapter(ad);

        String[] to = {"Metros quadrados (m²)", "Centímetros quadrados (cm²)", "Hectares (ha)", "Acres (ac)"};
        ArrayAdapter ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        caixa2.setAdapter(ad1);

        btnCalcular.setOnClickListener(v -> {

            String no1 = n1.getText().toString();

            if (no1.trim().isEmpty()) {
                Toast.makeText(zfisicaconversorarea.this, "Valor ausente", Toast.LENGTH_LONG).show();
            }
            else {

                result = findViewById(R.id.n2);


                double tot;

                double valor = Double.parseDouble(n1.getText().toString());

                // SEPARA

                // SEPARA
                if (caixa1.getSelectedItem().toString().equals("Metros quadrados (m²)") && caixa2.getSelectedItem().toString().equals("Centímetros quadrados (cm²)")) {
                    tot = valor * 10000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }

                if (caixa1.getSelectedItem().toString().equals("Metros quadrados (m²)") && caixa2.getSelectedItem().toString().equals("Hectares (ha)")) {
                    tot = valor / 10000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Metros quadrados (m²)") && caixa2.getSelectedItem().toString().equals("Acres (ac)")) {
                    tot = valor / 4047.0;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-----
                //-----
                if (caixa1.getSelectedItem().toString().equals("Centímetros quadrados (cm²)") && caixa2.getSelectedItem().toString().equals("Metros quadrados (m²)")) {
                    tot = valor / 10000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Centímetros quadrados (cm²)") && caixa2.getSelectedItem().toString().equals("Hectares (ha)")) {
                    tot = valor / 100000000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Centímetros quadrados (cm²)") && caixa2.getSelectedItem().toString().equals("Acres (ac)")) {
                    tot = valor / 40468600;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-----
                //-----
                if (caixa1.getSelectedItem().toString().equals("Hectares (ha)") && caixa2.getSelectedItem().toString().equals("Metros quadrados (m²)")) {
                    tot = valor * 10000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Hectares (ha)") && caixa2.getSelectedItem().toString().equals("Centímetros quadrados (cm²)")) {
                    tot = valor * 100000000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Hectares (ha)") && caixa2.getSelectedItem().toString().equals("Acres (ac)")) {
                    tot = valor * 2.471;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-----
                //-----
                if (caixa1.getSelectedItem().toString().equals("Acres (ac)") && caixa2.getSelectedItem().toString().equals("Metros quadrados (m²)")) {
                    tot = valor * 4046.86;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Acres (ac)") && caixa2.getSelectedItem().toString().equals("Centímetros quadrados (cm²)")) {
                    tot = valor * 40468600;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Acres (ac)") && caixa2.getSelectedItem().toString().equals("Hectares (ha)")) {
                    tot = valor / 2.471;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }


                if (caixa1.getSelectedItem().toString().equals(caixa2.getSelectedItem().toString())) {
                    tot = valor;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }


                if (caixa2.getSelectedItem().toString().equals("Metros quadrados (m²)")) {
                    result.append(" m²");
                }
                if (caixa2.getSelectedItem().toString().equals("Hectares (ha)")) {
                    result.append(" ha");
                }
                if (caixa2.getSelectedItem().toString().equals("Centímetros quadrados (cm²)")) {
                    result.append(" cm²");
                }
                if (caixa2.getSelectedItem().toString().equals("Acres (ac)")) {
                    result.append(" ac");
                }
            }

        });
    }
}