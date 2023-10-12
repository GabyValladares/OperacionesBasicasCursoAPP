package com.ggvc.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperacionesAvanzadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_avanzadas);

        EditText n1=findViewById(R.id.txtNum3);
        EditText poten=findViewById(R.id.txtPotencia);
        Button potencia=findViewById(R.id.btnPotencia);
        Button nPotencia=findViewById(R.id.btnNPotencia);
        Button regresar=findViewById(R.id.btnBack);
        TextView resultado=findViewById(R.id.txtResult2);

        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double resul=Math.pow(num1,2);
                resultado.setText(resul+"");
            }
        });
        nPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(poten.getText().toString());
                double resul=Math.pow(num1,num2);
                resultado.setText(resul+"");
            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OperacionesAvanzadas.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }


}