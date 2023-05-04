package com.example.projeto3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class boasvindas extends AppCompatActivity {

    private TextView text_boasvindas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boasvindas);

        getSupportActionBar().hide();
    }

    private void IniciarComponentes(){
        text_boasvindas = findViewById(R.id.text_boasvindas);
    }
}