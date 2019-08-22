package com.sifa.muslimstore;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_sholat;
    private Button btn_produk,doa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sholat = (Button) findViewById(R.id.btn_jadwal_sholat);
        btn_produk = (Button) findViewById(R.id.btn_produk_halal);
        doa =(Button) findViewById(R.id.btn_doa_harian) ;


        btn_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Sholat_App.class);
                startActivity(intent);
            }
        });
        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HalalApp.class);
                startActivity(intent);

            }
        });

        doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DoaHarian.class);
                startActivity(intent);

            }
        });

    }
}
