package com.example.ejercheckbox2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkBoxCycling;
    CheckBox chkBoxTeaching;
    CheckBox chkBoxBlogging;
    //Button btnHobby;
    TextView txtHobby;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ejerCheckBox2();
    }

    public void ejerCheckBox2() {

        chkBoxCycling = (CheckBox) findViewById(R.id.chkBoxCycling);
        chkBoxTeaching = (CheckBox) findViewById(R.id.chkBoxTeaching);
        chkBoxBlogging = (CheckBox) findViewById(R.id.chkBoxBlogging);
        //btnHobby = (Button)findViewById(R.id.btnHobby);
        txtHobby = (TextView)findViewById(R.id.txtHobby);

        /*btnHobby.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                getHobbyClick(v);
            }
        });*/
        chkBoxCycling.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        chkBoxTeaching.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        chkBoxBlogging.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
    }
    //captura evento cuando pulsa boton no cuando seleccionamos los checkBox
    /*public void getHobbyClick(View v)
    {
        String strMessage = "";
        if(chkBoxCycling.isChecked())
        {
            strMessage+="Cycling";
        }
        if(chkBoxTeaching.isChecked())
        {
            strMessage+="Teaching ";
        }
        if(chkBoxBlogging.isChecked())
        {
            strMessage+="Blogging ";
        }
        showTextNotification(strMessage);
    }*/
    public void showTextNotification(String msgToDisplay)
    {
        txtHobby.setText(msgToDisplay);
        //Toast.makeText(this, msgToDisplay, Toast.LENGTH_SHORT).show();
    }

    class myCheckBoxChangeClicker implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            String strMessage = "";
            if(isChecked)
            {
                if(buttonView==chkBoxCycling)
                {
                    strMessage+="Cycling";
                    showTextNotification(strMessage);
                    //showTextNotification("Cycling");
                }
                if(buttonView==chkBoxTeaching)
                {
                    strMessage+="Teaching";
                    showTextNotification(strMessage);
                    //showTextNotification("Teaching");
                }
                if(buttonView==chkBoxBlogging)
                {
                    if(strMessage=="") {
                        strMessage+="Blogging";
                    }else
                    showTextNotification(strMessage);
                    //showTextNotification("Blogging");
                }
            }
        }
    }
}