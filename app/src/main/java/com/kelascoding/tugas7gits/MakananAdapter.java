package com.kelascoding.tugas7gits;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {
    Context context;
    List<Makanan> dataMakanan;

    public MakananAdapter(Context context, List<Makanan> dataMakanan) {
        this.context = context;
        this.dataMakanan = dataMakanan;
    }

    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false );
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder holder, int position) {
            holder.nama.setText(dataMakanan.get(position).getNama());
            holder.harga.setText(dataMakanan.get(position).getHarga());
            Glide.with( context ).load( dataMakanan.get( position ).getPhoto()).into( holder.gambar );

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailsMakanan.class);
                    intent.putExtra("nama", dataMakanan.get(position).getNama());
                    intent.putExtra("harga", dataMakanan.get(position).getHarga());
                    intent.putExtra("gambar",dataMakanan.get(position).getPhoto());
                    intent.putExtra("desc", dataMakanan.get(position).getDesc());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return dataMakanan.size();
    }

    class MakananViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView nama, harga,desc;

        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.image_makanan);
            nama = itemView.findViewById(R.id.nama_makanan);
            harga = itemView.findViewById(R.id.harga_makanan);
            desc = itemView.findViewById(R.id.desc_detail);
        }
    }
}
