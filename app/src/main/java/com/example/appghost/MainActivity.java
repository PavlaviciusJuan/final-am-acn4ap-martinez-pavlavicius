package com.example.appghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btn_ir_fiesta){
            Intent miIntent= new Intent(MainActivity.this, FiestaActivity.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btn_login) {

        }




    }
}