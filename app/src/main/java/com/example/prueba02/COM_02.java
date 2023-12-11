package com.example.prueba02;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;

public class COM_02 extends AppCompatActivity {
    String cuentatotal="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com02);
        // PANTALLA TOTAL
        TextView total = findViewById(R.id.tvTotal);

        // BOTON 1
        Button botonCobrar1= (Button) findViewById(R.id.btn1);
        botonCobrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"1";
                total.setText(cuentatotal+"€");
            }
        });
        // BOTON 2
        Button botonCobrar2= (Button) findViewById(R.id.btn2);
        botonCobrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"2";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 3
        Button botonCobrar3= (Button) findViewById(R.id.btn3);
        botonCobrar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"3";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 4
        Button botonCobrar4= (Button) findViewById(R.id.btn4);
        botonCobrar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"4";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 5
        Button botonCobrar5= (Button) findViewById(R.id.btn5);
        botonCobrar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"5";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 6
        Button botonCobrar6= (Button) findViewById(R.id.btn6);
        botonCobrar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"6";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 7
        Button botonCobrar7= (Button) findViewById(R.id.btn7);
        botonCobrar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"7";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 8
        Button botonCobrar8= (Button) findViewById(R.id.btn8);
        botonCobrar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"8";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 9
        Button botonCobrar9= (Button) findViewById(R.id.btn9);
        botonCobrar9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"9";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON 0
        Button botonCobrar0= (Button) findViewById(R.id.btn0);
        botonCobrar0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+"0";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON PUNTO
        Button botonCobrarPunto= (Button) findViewById(R.id.btnPunto);
        botonCobrarPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal=cuentatotal+".";
                total.setText(cuentatotal+"€");
            }
        });

        // BOTON RESET
        Button botonCobrarReset= (Button) findViewById(R.id.btnReset);
        botonCobrarReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuentatotal="";
                total.setText(cuentatotal+"€");
            }
        });


//        BigInteger.valueOf(cuentatotal);


        double totalComanda=87;
//        TextView cambio = findViewById(R.id.txCambio);
//        cambio.setText(cuentatotal-totalComanda);

        TextView entrega = findViewById(R.id.txtEntrega);
        TextView cambio = findViewById(R.id.txCambio);


        Button botonefectivo= (Button) findViewById(R.id.btnEfectivo);
        botonefectivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrega.setText(cuentatotal+"€");
                double cuenta = Double.parseDouble(cuentatotal);
                double cambiofinal=(cuenta-totalComanda);
                cambio.setText(String.valueOf(cambiofinal)+"€");

            }
        });



    }
}