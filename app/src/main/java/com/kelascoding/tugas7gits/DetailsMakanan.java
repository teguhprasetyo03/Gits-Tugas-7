package com.kelascoding.tugas7gits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsMakanan extends AppCompatActivity {

    TextView tvnama;
    TextView tvdesc;
    TextView tvharga;
    ImageView imggambar;

    int id;
    String nama, harga;
    int photo;
    String desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvnama = findViewById( R.id.detail_nama_makanan);
        tvdesc = findViewById( R.id.desc_detail );
        imggambar = findViewById( R.id.image_detail );
        tvharga = findViewById(R.id.detail_harga_makanan);

        nama = getIntent().getStringExtra( "nama" );
        photo = getIntent().getIntExtra( "gambar" ,0 );
        desc = getIntent().getStringExtra( "desc" );
        harga = getIntent().getStringExtra("harga");

        tvnama.setText( nama );
        tvdesc.setText( desc );
        tvharga.setText(harga);
        Glide.with( getApplicationContext() ).load(photo).into(imggambar );

    }
}