package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        final TextView miSaludo2 = (TextView) findViewById(R.id.myHi2);

        Bundle miBundleRecoger = getIntent().getExtras();
        miSaludo2.setText(miBundleRecoger.getString("TEXTO"));

        showAlert("Pulsar Boton");

        final Button miVolver = (Button) findViewById(R.id.myBtnVolver);
        miVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(Pantalla2.this, MainActivity.class);
                startActivity(miIntent);
            }
        });
    }
    protected void showAlert(CharSequence text) {
        //CharSequence text = getResources().getString(R.string.noNameMsg);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(text);
        alert.setPositiveButton(android.R.string.ok, null);
        alert.show();

    }
}