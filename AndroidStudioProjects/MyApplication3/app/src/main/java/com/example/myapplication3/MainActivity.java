package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
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

        final TextView Saludo = (TextView) findViewById(R.id.myView);
        final EditText miTexto = (EditText) findViewById(R.id.myTxt);
        final Button miBoton = (Button) findViewById(R.id.myBtn);
        final TextView miSaludo = (TextView) findViewById(R.id.myHi);

        showToast("Pulsar BOTON");
        miBoton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent = new Intent(MainActivity.this, Pantalla2.class);

                Bundle miBundle = new Bundle();

                String mensajeSaludo = "Te saludo " + miTexto.getText();
                miBundle.putString("TEXTO", mensajeSaludo);
                miIntent.putExtras(miBundle);
                startActivity(miIntent);

            }

        });
    }
    protected void showToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

}