package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class zfisicaconversormassa extends AppCompatActivity {

    Spinner caixa1, caixa2;
    EditText n1, result;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zfisicaconversormassa);
        n1 = findViewById(R.id.n1);
        caixa1 = findViewById(R.id.caixa1);
        caixa2 = findViewById(R.id.caixa2);
        btnCalcular = findViewById(R.id.btnCalcular);


        String[] from = {"Gramas (g)", "Quilogramas (kg)", "Onças (oz)", "Libras (lb)", "Toneladas (t)"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        caixa1.setAdapter(ad);

        String[] to = {"Gramas (g)", "Quilogramas (kg)", "Onças (oz)", "Libras (lb)", "Toneladas (t)"};
        ArrayAdapter ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        caixa2.setAdapter(ad1);

        btnCalcular.setOnClickListener(v -> {

            String no1 = n1.getText().toString();

            if (no1.trim().isEmpty()) {
                Toast.makeText(zfisicaconversormassa.this, "Valor ausente", Toast.LENGTH_LONG).show();
            }
            else {

                result = findViewById(R.id.n2);


                double tot;

                double valor = Double.parseDouble(n1.getText().toString());

                // SEPARA
                // SEPARA
                if (caixa1.getSelectedItem().toString().equals("Gramas (g)") && caixa2.getSelectedItem().toString().equals("Quilogramas (kg)")) {
                    tot = valor / 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }

                if (caixa1.getSelectedItem().toString().equals("Gramas (g)") && caixa2.getSelectedItem().toString().equals("Onças (oz)")) {
                    tot = valor / 28.35;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Gramas (g)") && caixa2.getSelectedItem().toString().equals("Libras (lb)")) {
                    tot = valor / 453.59;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Gramas (g)") && caixa2.getSelectedItem().toString().equals("Toneladas (t)")) {
                    tot = valor / 1000000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Quilogramas (kg)") && caixa2.getSelectedItem().toString().equals("Gramas (g)")) {
                    tot = valor * 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilogramas (kg)") && caixa2.getSelectedItem().toString().equals("Onças (oz)")) {
                    tot = valor * 35.274;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilogramas (kg)") && caixa2.getSelectedItem().toString().equals("Libras (lb)")) {
                    tot = valor * 2.205;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Quilogramas (kg)") && caixa2.getSelectedItem().toString().equals("Toneladas (t)")) {
                    tot = valor / 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Onças (oz)") && caixa2.getSelectedItem().toString().equals("Gramas (g)")) {
                    tot = valor * 28.35;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Onças (oz)") && caixa2.getSelectedItem().toString().equals("Quilogramas (kg)")) {
                    tot = valor / 35.274;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Onças (oz)") && caixa2.getSelectedItem().toString().equals("Libras (lb)")) {
                    tot = valor / 16;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Onças (oz)") && caixa2.getSelectedItem().toString().equals("Toneladas (t)")) {
                    tot = valor / 35274;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Libras (lb)") && caixa2.getSelectedItem().toString().equals("Gramas (g)")) {
                    tot = valor * 453.59;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Libras (lb)") && caixa2.getSelectedItem().toString().equals("Quilogramas (kg)")) {
                    tot = valor / 2.205;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Libras (lb)") && caixa2.getSelectedItem().toString().equals("Onças (oz)")) {
                    tot = valor * 16;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Libras (lb)") && caixa2.getSelectedItem().toString().equals("Toneladas (t)")) {
                    tot = valor / 2205;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                //-------------------------------------------------------
                //-------------------------------------------------------
                if (caixa1.getSelectedItem().toString().equals("Toneladas (t)") && caixa2.getSelectedItem().toString().equals("Gramas (g)")) {
                    tot = valor * 1000000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Toneladas (t)") && caixa2.getSelectedItem().toString().equals("Quilogramas (kg)")) {
                    tot = valor * 1000;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Toneladas (t)") && caixa2.getSelectedItem().toString().equals("Onças (oz)")) {
                    tot = valor * 35274;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                }
                if (caixa1.getSelectedItem().toString().equals("Toneladas (t)") && caixa2.getSelectedItem().toString().equals("Libras (lb)")) {
                    tot = valor * 2205;

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
                if (caixa2.getSelectedItem().toString().equals("Gramas (g)")) {
                    result.append(" g");
                }
                if (caixa2.getSelectedItem().toString().equals("Quilogramas (kg)")) {
                    result.append(" kg");
                }
                if (caixa2.getSelectedItem().toString().equals("Onças (oz)")) {
                    result.append(" oz");
                }
                if (caixa2.getSelectedItem().toString().equals("Libras (lb)")) {
                    result.append(" lb");
                }
                if (caixa2.getSelectedItem().toString().equals("Toneladas (t)")) {
                    result.append(" t");
                }
            }

        });
    }
}