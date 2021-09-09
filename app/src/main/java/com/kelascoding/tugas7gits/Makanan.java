package com.kelascoding.tugas7gits;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {

    public Makanan(int id, String nama, String harga, int photo, String desc) {
        this.id = id;
        this.photo = photo;
        this.nama = nama;
        this.harga = harga;
        this.desc = desc;
    }

    int id, photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    String nama,harga,desc;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.photo);
        dest.writeString(this.nama);
        dest.writeString(this.harga);
        dest.writeString(this.desc);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.photo = source.readInt();
        this.nama = source.readString();
        this.harga = source.readString();
        this.desc = source.readString();
    }

    protected Makanan(Parcel in) {
        this.id = in.readInt();
        this.photo = in.readInt();
        this.nama = in.readString();
        this.harga = in.readString();
        this.desc = in.readString();
    }

    public static final Parcelable.Creator<Makanan> CREATOR = new Parcelable.Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel source) {
            return new Makanan(source);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };
}
