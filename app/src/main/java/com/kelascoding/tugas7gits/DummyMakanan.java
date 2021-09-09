package com.kelascoding.tugas7gits;

import java.util.ArrayList;

public class DummyMakanan {

    // Membuat isi item array list
    public static ArrayList<Makanan> listMakanan(){
        ArrayList<Makanan> makanan = new ArrayList<>();
        makanan.add(new Makanan(1,"Ayam Goreng", "Rp. 17000", R.drawable.ayam,  "Soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. " ));
        makanan.add(new Makanan( 2 , "Rendang" ,"Rp. 20000", R.drawable.rendang, "Rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 3 , "Bakso" ,"Rp. 25000", R.drawable.bakso, "Bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 1 , "Sate" , "Rp. 22000", R.drawable.sate, "Sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 1 , "Soto" , "Rp. 15000", R.drawable.soto,     "Soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 1 , "Ayam Goreng" ,"Rp. 17000", R.drawable.ayam, "Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan( 2 , "Rendang" ,"Rp. 20000", R.drawable.rendang, "Rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 3 , "Bakso","Rp. 25000", R.drawable.bakso, "Bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 1 , "Sate" ,"Rp. 22000", R.drawable.sate, "Sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        makanan.add(new Makanan( 1 , "Soto" ,"Rp. 15000", R.drawable.soto,     "Soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas. "));
        return makanan;

    }

}
