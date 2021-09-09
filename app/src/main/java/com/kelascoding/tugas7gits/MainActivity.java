package com.kelascoding.tugas7gits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rc;
    MakananAdapter ma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ma = new  MakananAdapter(getApplicationContext(), dataMakanan());
        rc = findViewById( R.id.recycler_makanan );
        rc.setLayoutManager( new GridLayoutManager( getApplicationContext(), 2 ) );
        rc.setAdapter( ma );
    }

    ArrayList<Makanan> dataMakanan(){
        return DummyMakanan.listMakanan();
    }
}