package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hitam extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitam);

        Button btnHitam = (Button) findViewById(R.id.buttonHitam);
        btnHitam.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent  hitam = new Intent(this,Transaksi.class); startActivity(hitam);
    }
}
