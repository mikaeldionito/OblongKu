package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Putih extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putih);

        Button btnPutih = (Button) findViewById(R.id.buttonPutih);
        btnPutih.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent putih = new Intent(this,Transaksi.class); startActivity(putih);
    }
}
