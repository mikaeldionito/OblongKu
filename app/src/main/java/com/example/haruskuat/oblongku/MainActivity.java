package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView katalogMik, sizeMik, rulesMik, cpMik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        katalogMik = (CardView) findViewById(R.id.kalatog_mik);
        sizeMik = (CardView) findViewById(R.id.size_mik);
        rulesMik = (CardView) findViewById(R.id.rules_mik);
        cpMik = (CardView) findViewById(R.id.cp_mik);

        katalogMik.setOnClickListener(this);
        sizeMik.setOnClickListener(this);
        rulesMik.setOnClickListener(this);
        cpMik.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent mik ;
        switch (v.getId()){
            case R.id.kalatog_mik : mik = new Intent(this,HalamanKatalog.class); startActivity(mik); break;
            case R.id.size_mik : mik = new Intent(this,HalamanSize.class); startActivity(mik); break;
            case R.id.rules_mik : mik = new Intent(this,HalamanRules.class); startActivity(mik); break;
            case R.id.cp_mik : mik = new Intent(this, HalamanCP.class); startActivity(mik); break;
            default: break;
        }

    }
}
