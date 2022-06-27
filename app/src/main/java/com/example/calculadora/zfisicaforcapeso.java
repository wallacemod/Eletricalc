package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zfisicaforcapeso extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zfisicaforcapeso);


        Numero1 = findViewById(R.id.n1);
        Numero2 = findViewById(R.id.n2);
        Numero3 = findViewById(R.id.n3);
        result = findViewById(R.id.result);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();
            String no3 = Numero3.getText().toString();

            double n1, n2, n3;
            double Peso;
            double Massa;
            double Gravidade;

            if ((no1.trim().isEmpty() && no2.trim().isEmpty() && no3.trim().isEmpty()) || (no1.trim().isEmpty() && no2.trim().isEmpty()) || (no1.trim().isEmpty() && no3.trim().isEmpty()) || (no2.trim().isEmpty() && no3.trim().isEmpty())){
                Toast.makeText(zfisicaforcapeso.this, "Falta valores", Toast.LENGTH_LONG).show();
            }
            else {
                if (no1.trim().isEmpty()) {
                    n2 = Double.parseDouble(Numero2.getText().toString());
                    n3 = Double.parseDouble(Numero3.getText().toString());
                    Peso = (n2 * n3);
                    result.setText("P: ");

                    String stringdouble = Double.toString(Peso);
                    result.append(stringdouble);

                    result.append("N");
                }
                //
                if (no2.trim().isEmpty()) {
                    n1 = Double.parseDouble(Numero1.getText().toString());
                    n3 = Double.parseDouble(Numero3.getText().toString());
                    Massa = (n1 / n3);
                    result.setText("m: ");

                    String stringdouble = Double.toString(Massa);
                    result.append(stringdouble);

                    result.append(" kg");
                }
                //
                if (no3.trim().isEmpty()) {
                    n1 = Double.parseDouble(Numero1.getText().toString());
                    n2 = Double.parseDouble(Numero2.getText().toString());
                    Gravidade = (n1 / n2);
                    result.setText("g: ");

                    String stringdouble = Double.toString(Gravidade);
                    result.append(stringdouble);

                    result.append(" m/s²");
                }
            }
        });
    }
}