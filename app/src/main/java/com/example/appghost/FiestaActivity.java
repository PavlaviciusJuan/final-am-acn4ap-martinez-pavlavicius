package com.example.appghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FiestaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiesta);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btn_home) {
            Intent miIntent = new Intent(FiestaActivity.this, MainActivity.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btn_login) {

        }
    }
}