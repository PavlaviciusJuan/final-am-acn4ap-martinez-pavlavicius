package com.example.appghost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FiestaActivity extends AppCompatActivity {
    TextView texto;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiesta);

        texto = (TextView)findViewById(R.id.textView3);
        texto.setText("Ghost Party es una fiesta de generos variados!");
        imagen = (ImageView)findViewById(R.id.imageView);
        Button boton = findViewById(R.id.cambio_descripcion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout scroll = (LinearLayout) findViewById(R.id.linear_layout);
                    LinearLayout linearLayout = new LinearLayout(boton.getContext());
                        TextView myText = new TextView(boton.getContext());
                        myText.setText("Ven a Ghost Party!!!");
                        linearLayout.setOrientation(LinearLayout.VERTICAL);
                    linearLayout.addView(myText);
                scroll.addView(linearLayout);
            }
        });

    }

    public void onClick(View view) {

        if (view.getId() == R.id.btn_home) {
            Intent miIntent = new Intent(FiestaActivity.this, MainActivity.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btn_login) {
            Intent miIntent = new Intent(FiestaActivity.this, MainActivity.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.cambio_imagen) {
            imagen.setImageResource(R.drawable.predeterminada2);
        } else if (view.getId() == R.id.btn_mas_fiestas) {
            Intent miIntent = new Intent(FiestaActivity.this, MainActivity.class);
            startActivity(miIntent);
        }
    }
}