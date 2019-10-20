package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Biru extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biru);

        Button btnBiru = (Button) findViewById(R.id.buttonBiru);
        btnBiru.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent biru = new Intent(this,Transaksi.class); startActivity(biru);
    }
}
