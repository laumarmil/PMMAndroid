package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView miSaludo = (TextView) findViewById(R.id.myView);
        final EditText miTexto = (EditText) findViewById(R.id.myTxt);
        final Button miBoton = (Button) findViewById(R.id.myBtn);
        final TextView Saludo = (TextView) findViewById(R.id.myHi);

        miBoton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String mensajeSaludo = "Bienvenidx " + miTexto.getText();
                Saludo.setText(mensajeSaludo.toUpperCase());

            }
        });
    }
}