package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSembrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSembrar = findViewById(R.id.btnSembrar);
        btnSembrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSembrar:
                goToSembrar();
        }
    }

    private void goToSembrar() {
        Intent i = new Intent(getApplicationContext(), ActivitySembrar.class);
        startActivity(i);
    }
}
