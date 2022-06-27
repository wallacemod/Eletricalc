package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class zfisicaconversorcomprimento extends AppCompatActivity {

    Spinner caixa1, caixa2;
    EditText n1, result;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zfisicaconversorcomprimento);
        n1 = findViewById(R.id.n1);
        caixa1 = findViewById(R.id.caixa1);
        caixa2 = findViewById(R.id.caixa2);
        btnCalcular = findViewById(R.id.btnCalcular);


        String[] from = {"Metros (m)", "Centímetros (cm)", "Quilômetros (km)", "Polegadas (in)", "Pés (ft)"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        caixa1.setAdapter(ad);

        String[] to = {"Metros (m)", "Centímetros (cm)", "Quilômetros (km)", "Polegadas (in)", "Pés (ft)"};
        ArrayAdapter ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        caixa2.setAdapter(ad1);

        btnCalcular.setOnClickListener(v -> {

            String no1 = n1.getText().toString();

            if (no1.trim().isEmpty()) {
                Toast.makeText(zfisicaconversorcomprimento.this, "Valor ausente", Toast.LENGTH_LONG).show();
            }
            else {

                result = findViewById(R.id.n2);


                double tot;

                double valor = Double.parseDouble(n1.getText().toString());

                // SEPARA
                // SEPARA
                if (caixa1.getSelectedItem().toString().equals("Metros (m)") && caixa2.getSelectedItem().toString().equals("Centímetros (cm)")) {
                    tot = valor * 100;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }

                if (caixa1.getSelectedItem().toString().equals("Metros (m)") && caixa2.getSelectedItem().toString().equals("Quilômetros (km)")) {
                    tot = valor / 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Metros (m)") && caixa2.getSelectedItem().toString().equals("Polegadas (in)")) {
                    tot = valor * 39.37;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Metros (m)") && caixa2.getSelectedItem().toString().equals("Pés (ft)")) {
                    tot = valor * 3.281;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Centímetros (cm)") && caixa2.getSelectedItem().toString().equals("Metros (m)")) {
                    tot = valor / 100;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Centímetros (cm)") && caixa2.getSelectedItem().toString().equals("Quilômetros (km)")) {
                    tot = valor / 100000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Centímetros (cm)") && caixa2.getSelectedItem().toString().equals("Polegadas (in)")) {
                    tot = valor / 2.54;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Centímetros (cm)") && caixa2.getSelectedItem().toString().equals("Pés (ft)")) {
                    tot = valor / 30.48;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Quilômetros (km)") && caixa2.getSelectedItem().toString().equals("Metros (m)")) {
                    tot = valor * 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilômetros (km)") && caixa2.getSelectedItem().toString().equals("Centímetros (cm)")) {
                    tot = valor * 100000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilômetros (km)") && caixa2.getSelectedItem().toString().equals("Polegadas (in)")) {
                    tot = valor * 39370.1;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilômetros (km)") && caixa2.getSelectedItem().toString().equals("Pés (ft)")) {
                    tot = valor * 3280.84;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Polegadas (in)") && caixa2.getSelectedItem().toString().equals("Metros (m)")) {
                    tot = valor / 39.37;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Polegadas (in)") && caixa2.getSelectedItem().toString().equals("Centímetros (cm)")) {
                    tot = valor * 2.54;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Polegadas (in)") && caixa2.getSelectedItem().toString().equals("Quilômetros (km)")) {
                    tot = valor / 39370.1;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Polegadas (in)") && caixa2.getSelectedItem().toString().equals("Pés (ft)")) {
                    tot = valor / 12;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Pés (ft)") && caixa2.getSelectedItem().toString().equals("Metros (m)")) {
                    tot = valor / 3.281;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Pés (ft)") && caixa2.getSelectedItem().toString().equals("Centímetros (cm)")) {
                    tot = valor * 30.48;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Pés (ft)") && caixa2.getSelectedItem().toString().equals("Quilômetros (km)")) {
                    tot = valor / 3280.84;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Pés (ft)") && caixa2.getSelectedItem().toString().equals("Polegadas (in)")) {
                    tot = valor * 12;

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
                if (caixa2.getSelectedItem().toString().equals("Metros (m)")) {
                    result.append(" m");
                }
                if (caixa2.getSelectedItem().toString().equals("Centímetros (cm)")) {
                    result.append(" cm");
                }
                if (caixa2.getSelectedItem().toString().equals("Quilômetros (km)")) {
                    result.append(" km");
                }
                if (caixa2.getSelectedItem().toString().equals("Polegadas (in)")) {
                    result.append(" in");
                }
                if (caixa2.getSelectedItem().toString().equals("Pés (ft)")) {
                    result.append(" ft");
                }
            }

        });
    }
}