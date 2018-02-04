package com.example.rzknzl.rizkinuzuli_1202154225_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class NextActivity extends AppCompatActivity {

    private TextView Tempat, Makan, Porsi, Harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Tempat = (TextView) findViewById(R.id.tvTempat);
        Makan = (TextView) findViewById(R.id.tvMenu2);
        Porsi = (TextView) findViewById(R.id.tvPorsi2);
        Harga = (TextView) findViewById(R.id.tvHarga2);

        Intent intent = getIntent();

        String Tempat2 = intent.getStringExtra("resto");
        String Makan2 = intent.getStringExtra("menu");
        int Porsi2 = intent.getIntExtra("porsi",0);
        int Harga2 = intent.getIntExtra("harga",0);

        Tempat.setText(Tempat2);
        Makan.setText(Makan2);
        Porsi.setText(""+Porsi2);
        Harga.setText(""+Harga2);

        if(Harga2 >= 65000){
            Toast tos = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            tos.show();
        } else{
            Toast tos = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            tos.show();
        }

    }
}
