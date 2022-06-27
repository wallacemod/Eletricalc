package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zeletronicatransformacaoestreladelta extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result1, result2, result3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicatransformacaoestreladelta);

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
                Toast.makeText(zeletronicatransformacaoestreladelta.this, "Falta valores", Toast.LENGTH_LONG).show();
            }

            else {
                double n1,n2,n3;
                double CalcularRa;
                double CalcularRb;
                double CalcularRc;
                n1 = Double.parseDouble(Numero1.getText().toString());
                n2 = Double.parseDouble(Numero2.getText().toString());
                n3 = Double.parseDouble(Numero3.getText().toString());

                double v = n1 * n2 + n2 * n3 + n3 * n1;
                CalcularRa = v /n1;
                CalcularRb = v /n2;
                CalcularRc = v /n3;


                result1.setText("Ra: ");

                String stringdouble = Double.toString(CalcularRa);
                result1.append(stringdouble);
                result1.append(" Ω");



                result2.setText("Rb: ");

                String stringdouble1 = Double.toString(CalcularRb);
                result2.append(stringdouble1);
                result2.append(" Ω");


                result3.setText("Rc: ");

                String stringdouble2 = Double.toString(CalcularRc);
                result3.append(stringdouble2);
                result3.append(" Ω");

            }
        });

    }
}