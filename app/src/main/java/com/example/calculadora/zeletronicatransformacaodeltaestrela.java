package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zeletronicatransformacaodeltaestrela extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result1, result2, result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicatransformacaodeltaestrela);


        Numero1 = (findViewById(R.id.n1));
        Numero2 = (findViewById(R.id.n2));
        Numero3 = (findViewById(R.id.n3));
        result1 = (findViewById(R.id.result1));
        result2 = (findViewById(R.id.result2));
        result3 = (findViewById(R.id.result3));


        Button btnCalcular = (Button) (findViewById(R.id.btnCalcular));
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();
            String no3 = Numero3.getText().toString();

            if (no1.trim().isEmpty() || no2.trim().isEmpty() || no3.trim().isEmpty()) {
                Toast.makeText(zeletronicatransformacaodeltaestrela.this, "Falta valores", Toast.LENGTH_LONG).show();
            }

            else {
                double n1,n2,n3;
                double CalcularR1;
                double CalcularR2;
                double CalcularR3;
                n1 = Double.parseDouble(Numero1.getText().toString());
                n2 = Double.parseDouble(Numero2.getText().toString());
                n3 = Double.parseDouble(Numero3.getText().toString());

                double v = (n1 + n2 + n3);
                CalcularR1 = (n2*n3) / v;
                CalcularR2 = (n3*n1) / v;
                CalcularR3 = (n1*n2) / v;


                result1.setText("R1: ");

                String stringdouble = Double.toString(CalcularR1);
                result1.append(stringdouble);
                result1.append(" Ω");


                result2.setText("R2: ");

                String stringdouble1 = Double.toString(CalcularR2);
                result2.append(stringdouble1);
                result2.append(" Ω");


                result3.setText("R3: ");

                String stringdouble2 = Double.toString(CalcularR3);
                result3.append(stringdouble2);
                result3.append(" Ω");

            }
        });

    }
}