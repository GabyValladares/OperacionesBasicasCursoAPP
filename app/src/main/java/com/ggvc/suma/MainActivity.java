package com.ggvc.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText n1 = findViewById(R.id.txtNum1);
        EditText n2 = findViewById(R.id.txtNum2);
        Button Sumar = (Button) findViewById(R.id.btnSumar);
        Button Restar = (Button) findViewById(R.id.btnRestar);
        Button Multiplicar = (Button) findViewById(R.id.btnMultiplicar2);
        Button Dividir = (Button) findViewById(R.id.btnDividir);
        Button Ir = (Button) findViewById(R.id.btnAvanzadas);
        TextView result = findViewById(R.id.txTResul);

        /*public void Sumar(View Sumar) {
            double num1 = Double.parseDouble(n1.getText().toString());
            double num2 = Double.parseDouble(n2.getText().toString());
            double resultado = num1 + num2;
            result.setText(resultado + "");
        }*/
        Ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OperacionesAvanzadas.class);
                startActivity(intent);
            }


        });
        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double resultado = num1 + num2;
                result.setText(resultado + "");
            }


        });
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado=0;
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                if(num2>num1){
                    resultado = num2 - num1;

                }else{
                    resultado = num1 - num2;
                }

                result.setText(resultado + "");
            }


        });
        Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                double resultado = num1 * num2;
                result.setText(resultado + "");
            }


        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado=0;
                double num1 = Double.parseDouble(n1.getText().toString());
                double num2 = Double.parseDouble(n2.getText().toString());
                if (num2>0){
                    resultado = num1 / num2;}
                else{
                    Toast.makeText(MainActivity.this, "No se puede dividir para 0", Toast.LENGTH_SHORT).show();
                }
                result.setText(resultado + "");
            }


        });

    }
}

