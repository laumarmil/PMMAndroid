package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //pantalla
    private TextView pantalla;
    //botones num
    private Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;
    //botones op
    private Button btnSuma, btnResta, btnMultiplica, btnDivide, btnIgual;
    //botones sim
    private Button btnClear, btnBorrar, btnPunto;

    private String op, res, aux;
    private double resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializando pantalla calculadora
        pantalla = (TextView) findViewById(R.id.screen);

        //inicializando botones calculadora
        btnCero = (Button) findViewById(R.id.cero);
        btnUno = (Button) findViewById(R.id.uno);
        btnDos = (Button) findViewById(R.id.dos);
        btnTres = (Button) findViewById(R.id.tres);
        btnCuatro = (Button) findViewById(R.id.cuatro);
        btnCinco = (Button) findViewById(R.id.cinco);
        btnSeis = (Button) findViewById(R.id.seis);
        btnSiete = (Button) findViewById(R.id.siete);
        btnOcho = (Button) findViewById(R.id.ocho);
        btnNueve = (Button) findViewById(R.id.nueve);
        btnSuma = (Button) findViewById(R.id.sum);
        btnResta = (Button) findViewById(R.id.resta);
        btnMultiplica = (Button) findViewById(R.id.mul);
        btnDivide = (Button) findViewById(R.id.div);
        btnClear = (Button) findViewById(R.id.c);
        btnBorrar = (Button) findViewById(R.id.borrar);
        btnPunto = (Button) findViewById(R.id.punto);
        btnIgual = (Button) findViewById(R.id.igual);


        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "1";
                pantalla.setText(res);
            }
        });
        
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "1";
                pantalla.setText(res);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "2";
                pantalla.setText(res);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "3";
                pantalla.setText(res);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "4";
                pantalla.setText(res);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "5";
                pantalla.setText(res);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "6";
                pantalla.setText(res);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "7";
                pantalla.setText(res);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "8";
                pantalla.setText(res);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "9";
                pantalla.setText(res);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aux = pantalla.getText().toString();
                op = "+";
                pantalla.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aux = pantalla.getText().toString();
                op = "-";
                pantalla.setText("");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aux = pantalla.getText().toString();
                op = "*";
                pantalla.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aux = pantalla.getText().toString();
                op = "/";
                pantalla.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + ".";
                pantalla.setText(res);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = "";
                pantalla.setText(res);
                aux = "";
                op = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res.substring(0, res.length() - 1);
                pantalla.setText(res);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res = pantalla.getText().toString();
                res = res + "1";
                if (op.equals("-")) {
                    resul = Double.parseDouble(aux) - Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resul));
                }
                if (op.equals("+")) {
                    resul = Double.parseDouble(aux) + Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resul));
                }
                if (op.equals("/")) {
                    resul = Double.parseDouble(aux) / Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resul));
                }
                if (op.equals("*")) {
                    resul = Double.parseDouble(aux) * Double.parseDouble(pantalla.getText().toString());
                    pantalla.setText(String.valueOf(resul));
                }
            }
        });

    }
}
