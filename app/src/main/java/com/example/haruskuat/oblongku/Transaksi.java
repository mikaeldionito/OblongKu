package com.example.haruskuat.oblongku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Transaksi extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference mikDB;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
    }public void Click1(View view){
        final EditText text1 = (EditText) findViewById(R.id.edit1);
        final EditText text2 = (EditText) findViewById(R.id.edit2);
        final EditText text3 = (EditText) findViewById(R.id.edit3);
        final EditText text4 = (EditText) findViewById(R.id.edit4);
        final EditText text5 = (EditText) findViewById(R.id.edit5);
        final EditText text6 = (EditText) findViewById(R.id.edit6);
        final EditText text7 = (EditText) findViewById(R.id.edit7);
        Button btn1 = (Button) findViewById(R.id.btn1);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference mikDB = database.getReference("Pembeli :").child(text1.getText().toString());
        mikDB.child("Kode Baju").setValue(text2.getText().toString());
        mikDB.child("Nama").setValue(text3.getText().toString());
        mikDB.child("NoTelp").setValue(text4.getText().toString());
        mikDB.child("Alamat").setValue(text5.getText().toString());
        mikDB.child("E-Mail").setValue(text6.getText().toString());
        mikDB.child("Ukuran").setValue(text7.getText().toString());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().toString().length() == 0) {
                    text1.setError("Tolong Masukan No Identitas!");
                } else if (text2.getText().toString().length() == 0) {
                    text2.setError("Tolong Masukan Kode Baju!");
                }else if (text3.getText().toString().length() == 0) {
                    text3.setError("Tolong Masukan Nama Pembeli!");
                }else if (text4.getText().toString().length() == 0) {
                    text4.setError("Tolong Masukan No Telepon / HP Pembeli");
                }else if (text5.getText().toString().length() == 0) {
                    text5.setError("Tolong Masukan Alamat");
                }else if (text6.getText().toString().length() == 0) {
                    text6.setError("Tolong Masukan Email Pembeli!");
                }else if (text7.getText().toString().length() == 0) {
                    text7.setError("Tolong Masukan Ukuran Baju");
                }else {
                   Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
