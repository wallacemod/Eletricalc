package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zmatematicabhaskara extends AppCompatActivity {
    private EditText Numero1, Numero2, Numero3;
    private TextView result1, result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zmatematicabhaskara);

        //inicio
        Numero1 = (findViewById(R.id.n1));
        Numero2 = (findViewById(R.id.n2));
        Numero3 = (findViewById(R.id.n3));
        result1 = (findViewById(R.id.result1));
        result2 = (findViewById(R.id.result2));
        //fim

        //inicio função calculo
        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no1 = Numero1.getText().toString();
                String no2 = Numero2.getText().toString();
                String no3 = Numero3.getText().toString();

                if (no1.trim().isEmpty() || no2.trim().isEmpty() || no3.trim().isEmpty()) {
                    Toast.makeText(zmatematicabhaskara.this, "Falta valores", Toast.LENGTH_LONG).show();
                }

                else {
                    double n1,n2,n3;
                    double Calcular;
                    double Calcularx;
                    double Delta;
                    n1 = Double.parseDouble(Numero1.getText().toString());
                    n2 = Double.parseDouble(Numero2.getText().toString());
                    n3 = Double.parseDouble(Numero3.getText().toString());
                    Delta = ((Math.pow(n2, 2)) - (4 * (n1 * n3)));
                    if (Delta >= 0) {
                        Calcular = (((-n2) + (Math.sqrt(Delta))) / (2 * n1));
                        Calcularx = (((-n2) - (Math.sqrt(Delta))) / (2 * n1));

                        result1.setText("x': ");
                        result2.setText("x'': ");

                        String stringdouble = Double.toString(Calcular);
                        result1.append(stringdouble);

                        String stringdouble1 = Double.toString(Calcularx);
                        result2.append(stringdouble1);

                    } else {
                        Toast.makeText(zmatematicabhaskara.this, "Não possui raiz", Toast.LENGTH_LONG).show();
                    }
                }

            }

            });
        }
}
