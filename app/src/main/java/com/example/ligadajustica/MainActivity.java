package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnflash;
    Button btnciborgue;
    Button btnbatman;
    Button btnmulher;
    Button btnaquaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnflash = (Button) findViewById(R.id.btnflash);
        btnciborgue = (Button) findViewById(R.id.btnciborgue);
        btnbatman = (Button) findViewById(R.id.btnbatman);
        btnmulher = (Button) findViewById(R.id.btnmulher);
        btnaquaman = (Button) findViewById(R.id.btnaquaman);

        btnflash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inflash = new Intent(MainActivity.this, aflash.class);
                startActivity(inflash);

            }
        });

        btnciborgue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent infciborgue = new Intent(MainActivity.this, aciborgue.class);
                startActivity(infciborgue);

            }
        });

        btnbatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent infbatman = new Intent(MainActivity.this, abatman.class);
                startActivity(infbatman);

            }
        });

        btnaquaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent infaquaman = new Intent(MainActivity.this, aaquaman.class);
                startActivity(infaquaman);

            }
        });

        btnmulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent infmulher = new Intent(MainActivity.this, amulher.class);
                startActivity(infmulher);

            }
        });
    }
}