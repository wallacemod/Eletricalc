package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class zeletronicaresistenciaequivalente extends AppCompatActivity {
    Spinner caixa1;
    String caixavalor;
    EditText n1, n2, n3, n4;
    TextView result;
    Button btnCalcular;
    TextInputLayout b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeletronicaresistenciaequivalente);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        caixa1 = findViewById(R.id.caixa1);
        result = findViewById(R.id.result);
        btnCalcular = findViewById(R.id.btnCalcular);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);


        String[] from = {"1", "2", "3", "4"};
        ArrayAdapter ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        caixa1.setAdapter(ad);


        caixa1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                caixavalor = parent.getItemAtPosition(position).toString();

                int value = Integer.parseInt(caixavalor);

                b1.setVisibility(value >= 1 ? view.VISIBLE : View.GONE);
                b2.setVisibility(value >= 2 ? view.VISIBLE : View.GONE);
                b3.setVisibility(value >= 3 ? view.VISIBLE : View.GONE);
                b4.setVisibility(value >= 4 ? view.VISIBLE : View.GONE);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btnCalcular.setOnClickListener(v -> {


            String no1 = n1.getText().toString();
            String no2 = n2.getText().toString();
            String no3 = n3.getText().toString();
            String no4 = n4.getText().toString();

            double tot;
            double tot1;
            double tot2;
            double r1, r2, r3, r4;



            if (caixa1.getSelectedItem().toString().equals("1")) {
                if (no1.trim().isEmpty()) {
                    Toast.makeText(zeletronicaresistenciaequivalente.this, "Falta valores", Toast.LENGTH_LONG).show();
                } else {

                    r1 = Double.parseDouble(n1.getText().toString());
                    tot = r1;

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                    result.append(" Ω");
                }
            }


            if (caixa1.getSelectedItem().toString().equals("2")) {
                if (no1.trim().isEmpty() || no2.trim().isEmpty()) {
                    Toast.makeText(zeletronicaresistenciaequivalente.this, "Falta valores", Toast.LENGTH_LONG).show();
                } else {
                    r1 = Double.parseDouble(n1.getText().toString());
                    r2 = Double.parseDouble(n2.getText().toString());
                    tot = (r1 * r2) / (r1 + r2);

                    String stringdouble = Double.toString(tot);
                    result.setText(stringdouble);
                    result.append(" Ω");
                }
            }

            if (caixa1.getSelectedItem().toString().equals("3")) {
                if (no1.trim().isEmpty() || no2.trim().isEmpty() || no3.trim().isEmpty()) {
                    Toast.makeText(zeletronicaresistenciaequivalente.this, "Falta valores", Toast.LENGTH_LONG).show();
                } else {
                    r1 = Double.parseDouble(n1.getText().toString());
                    r2 = Double.parseDouble(n2.getText().toString());
                    r3 = Double.parseDouble(n3.getText().toString());
                    tot = (r1 * r2) / (r1 + r2);
                    tot1 = (tot * r3) / (tot + r3);

                    String stringdouble = Double.toString(tot1);
                    result.setText(stringdouble);
                    result.append(" Ω");
                }
            }

            if (caixa1.getSelectedItem().toString().equals("4")) {
                if (no1.trim().isEmpty() || no2.trim().isEmpty() || no3.trim().isEmpty() || no4.trim().isEmpty()) {
                    Toast.makeText(zeletronicaresistenciaequivalente.this, "Falta valores", Toast.LENGTH_LONG).show();
                } else {
                    r1 = Double.parseDouble(n1.getText().toString());
                    r2 = Double.parseDouble(n2.getText().toString());
                    r3 = Double.parseDouble(n3.getText().toString());
                    r4 = Double.parseDouble(n4.getText().toString());
                    tot = (r1 * r2) / (r1 + r2);
                    tot1 = (tot * r3) / (tot + r3);
                    tot2 = (tot1 * r4) / (tot1 + r4);

                    String stringdouble = Double.toString(tot2);
                    result.setText(stringdouble);
                    result.append(" Ω");
                }
            }
        });
    }
}