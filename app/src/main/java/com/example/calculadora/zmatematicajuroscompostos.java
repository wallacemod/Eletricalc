package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class zmatematicajuroscompostos extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result1, result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zmatematicajuroscompostos);

        //inicio
        Numero1 = findViewById(R.id.n1);
        Numero2 = findViewById(R.id.n2);
        Numero3 = findViewById(R.id.n3);
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        //fim

        //inicio função calculo
        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();
            String no3 = Numero3.getText().toString();

            if (no1.trim().isEmpty() || no2.trim().isEmpty() || no3.trim().isEmpty()) {
                Toast.makeText(zmatematicajuroscompostos.this, "Falta valores", Toast.LENGTH_LONG).show();
            } else {
                double n1, n2, n3;
                double Valor1;
                double Valor2;
                double Montante;
                double Rendimento;

                n1 = Double.parseDouble(Numero1.getText().toString());
                n2 = Double.parseDouble(Numero2.getText().toString());
                n3 = Double.parseDouble(Numero3.getText().toString());


                Valor1 = (1 + (n2 / 100));
                Valor2 = Math.pow(Valor1, n3);
                Montante = ((Valor2 * n1));


                Rendimento = ((Montante) - n1);


                result1.setText("Juros: R$");
                result2.setText("Total: R$");

                result1.append(String.format("%.2f", Rendimento));

                result2.append(String.format("%.2f", Montante));

            }
        });
    }

}
