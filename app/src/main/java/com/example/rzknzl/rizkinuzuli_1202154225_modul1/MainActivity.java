package com.example.rzknzl.rizkinuzuli_1202154225_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etMakan, etJumlah;
    private String tempat_makan, menu_makan;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMakan = (EditText) findViewById(R.id.food);
        etJumlah = (EditText) findViewById(R.id.jumlah);

    }

    public void eatbus (View view){
        Intent intent = new Intent(this, NextActivity.class);
        tempat_makan = "EATBUS";
        menu_makan = etMakan.getText().toString();
        porsi = Integer.parseInt(etJumlah.getText().toString());
        int price = 50000*porsi;

        Log.d("total price", "Rp. "+price);

        intent.putExtra("resto", tempat_makan);
        intent.putExtra("menu", menu_makan);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", price);

        startActivity(intent);
    }

    public void abnormal (View view){
        Intent intent = new Intent(this, NextActivity.class);
        tempat_makan = "ABNORMAL";
        menu_makan = etMakan.getText().toString();
        porsi = Integer.parseInt(etJumlah.getText().toString());
        int price = 30000*porsi;

        Log.d("total price", "Rp. "+price);

        intent.putExtra("resto", tempat_makan);
        intent.putExtra("menu", menu_makan);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", price);

        startActivity(intent);
    }

}