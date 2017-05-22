package com.example.kzfot.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button egy, ketto, harom, negy, ot, hat, het, nyolc, kilenc,
    egyenlo, osszeadas, kivonas, szorzas, osztas, nulla, torles;
    EditText eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egy = (Button) findViewById(R.id.egy);
        ketto = (Button) findViewById(R.id.ketto);
        harom = (Button) findViewById(R.id.harom);
        negy = (Button) findViewById(R.id.negy);
        ot = (Button) findViewById(R.id.ot);
        hat = (Button) findViewById(R.id.hat);
        het = (Button) findViewById(R.id.het);
        nyolc = (Button) findViewById(R.id.nyolc);
        kilenc = (Button) findViewById(R.id.kilenc);
        nulla = (Button) findViewById(R.id.nulla);
        osszeadas = (Button) findViewById(R.id.osszeadas);
        kivonas = (Button) findViewById(R.id.kivonas);
        szorzas = (Button) findViewById(R.id.szorzas);
        osztas = (Button) findViewById(R.id.osztas);
        egyenlo = (Button) findViewById(R.id.egyenlo);
        torles = (Button) findViewById(R.id.torles);

        egy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ketto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        harom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        negy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        het.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        nyolc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        kilenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        nulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        osszeadas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
        torles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        egyenlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
