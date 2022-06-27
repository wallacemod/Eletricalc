package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class zeletronicaresistenciainternadocapacitor extends AppCompatActivity {
    private EditText Numero1, Numero2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicaresistenciainternadocapacitor);

        Numero1 = (findViewById(R.id.n1));
        Numero2 = (findViewById(R.id.n2));
        result = (findViewById(R.id.result));

        Button btnCalcular = (Button) (findViewById(R.id.btnCalcular));
        btnCalcular.setOnClickListener(view -> {
            String no1 = Numero1.getText().toString();
            String no2 = Numero2.getText().toString();

            if (no1.trim().isEmpty() || no2.trim().isEmpty()) {
                Toast.makeText(zeletronicaresistenciainternadocapacitor.this, "Falta valores", Toast.LENGTH_LONG).show();
            }

            else {
                double n1,n2;
                double Calcular;
                n1 = Double.parseDouble(Numero1.getText().toString());
                n2 = Double.parseDouble(Numero2.getText().toString());

                Calcular = 1/(2*3.14*n1*n2);

                result.setText("Xc: ");

                String stringdouble = Double.toString(Calcular);
                result.append(stringdouble);

                result.append(" Ω");

            }
        });

    }
}
