package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zeletronicaimpedanciadebase extends AppCompatActivity {
    private EditText Numero1, Numero2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicaimpedanciadebase);


        //inicio
        Numero1 = (EditText) (findViewById(R.id.n1));
        Numero2 = (EditText) (findViewById(R.id.n2));
        result = (TextView) (findViewById(R.id.result));
        //fim

        //inicio função calculo
        Button btnCalcular = (Button) (findViewById(R.id.btnCalcular));
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();

            if (no1.trim().isEmpty() || no2.trim().isEmpty()) {
                Toast.makeText(zeletronicaimpedanciadebase.this, "Falta valores", Toast.LENGTH_LONG).show();
            }

            else {
                double n1,n2;
                double Calcular;
                n1 = Double.parseDouble(Numero1.getText().toString());
                n2 = Double.parseDouble(Numero2.getText().toString());

                Calcular = ((Math.pow(n1, 2)) / (n2));

                result.setText("Zb: ");

                String stringdouble = Double.toString(Calcular);
                result.append(stringdouble);

                result.append(" Ω");

            }
        });

    }
}
