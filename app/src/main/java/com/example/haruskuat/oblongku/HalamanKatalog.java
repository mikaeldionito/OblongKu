package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HalamanKatalog extends AppCompatActivity implements View.OnClickListener {
    private CardView bajuHitam, bajuBiru, bajuPutih, bajuKuning, bajuMerah, bajuHijau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_katalog);

        bajuHitam = (CardView) findViewById(R.id.baju_hitam);
        bajuBiru = (CardView) findViewById(R.id.baju_biru);
        bajuPutih = (CardView) findViewById(R.id.baju_putih);
        bajuKuning = (CardView) findViewById(R.id.baju_kuning);
        bajuMerah = (CardView) findViewById(R.id.baju_merah);
        bajuHijau = (CardView) findViewById(R.id.baju_hijau);

        bajuHitam.setOnClickListener(this);
        bajuBiru.setOnClickListener(this);
        bajuPutih.setOnClickListener(this);
        bajuKuning.setOnClickListener(this);
        bajuMerah.setOnClickListener(this);
        bajuHijau.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent mik2;
        switch (v.getId()){
            case R.id.baju_hitam : mik2 = new Intent(this,Hitam.class); startActivity(mik2); break;
            case R.id.baju_biru : mik2 = new Intent(this,Biru.class); startActivity(mik2); break;
            case R.id.baju_putih : mik2 = new Intent(this,Putih.class); startActivity(mik2); break;
            case R.id.baju_kuning : mik2 = new Intent(this,Kuning.class); startActivity(mik2); break;
            case R.id.baju_merah : mik2 = new Intent(this,Merah.class); startActivity(mik2); break;
            case R.id.baju_hijau : mik2 = new Intent(this,Hijau.class); startActivity(mik2); break;
            default: break;
        }
    }
}
