package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zeletronicaleideohm extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicaleideohm);

        Numero1 = findViewById(R.id.n1);
        Numero2 = findViewById(R.id.n2);
        Numero3 = findViewById(R.id.n3);
        result1 = findViewById(R.id.result1);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();
            String no3 = Numero3.getText().toString();

            double n1, n2, n3;
            double Tensao;
            double Resistencia;
            double Corrente;

            if ((no1.trim().isEmpty() && no2.trim().isEmpty() && no3.trim().isEmpty()) || (no1.trim().isEmpty() && no2.trim().isEmpty()) || (no1.trim().isEmpty() && no3.trim().isEmpty()) || (no2.trim().isEmpty() && no3.trim().isEmpty())){
                Toast.makeText(zeletronicaleideohm.this, "Falta valores", Toast.LENGTH_LONG).show();
            }
            else {
                if (no1.trim().isEmpty()) {
                    n2 = Double.parseDouble(Numero2.getText().toString());
                    n3 = Double.parseDouble(Numero3.getText().toString());
                    Tensao = (n2 * n3);
                    result1.setText("V: ");

                    String stringdouble = Double.toString(Tensao);
                    result1.append(stringdouble);

                    result1.append(" V");
                }
                //
                if (no2.trim().isEmpty()) {
                    n1 = Double.parseDouble(Numero1.getText().toString());
                    n3 = Double.parseDouble(Numero3.getText().toString());
                    Resistencia = (n1 / n3);
                    result1.setText("R: ");

                    String stringdouble = Double.toString(Resistencia);
                    result1.append(stringdouble);

                    result1.append(" Ω");
                }
                //
                if (no3.trim().isEmpty()) {
                    n1 = Double.parseDouble(Numero1.getText().toString());
                    n2 = Double.parseDouble(Numero2.getText().toString());
                    Corrente = (n1 / n2);
                    result1.setText("I: ");

                    String stringdouble = Double.toString(Corrente);
                    result1.append(stringdouble);

                    result1.append(" A");

                }
            }
        });
    }
}
