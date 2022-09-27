/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek2;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */

//soal no2
class Makanan {

    String kategori, merk;
    double harga;
    int id;

    public Makanan(int _id, String _kategori, String _merk, double _harga) {
        this.id = _id;
        this.kategori = _kategori;
        this.merk = _merk;
        this.harga = _harga;
    }

    public static void main(String[] args) {
        
        int[] pembeli1 = {4, 4, 1, 3, 2, 2};
        
        Makanan m1 = new Makanan(1, "Air Mineral", "AQUA", 3000); 
        Makanan m2 = new Makanan(2, "Air Mineral", "Amidis", 2000);
        Makanan m3 = new Makanan(3, "Roti", "Sari Roti", 15000);
        Makanan m4 = new Makanan(4, "Roti", "Tosis", 12000);
        Makanan m5 = new Makanan(5, "Teh Kemasan", "Teh Kotak", 4500);
        Makanan m6 = new Makanan(6, "Teh Kemasan", "Ichi Ocha", 6000);
        ArrayList<Makanan> listM1 = new ArrayList<Makanan>();

        listM1.add(m1);
        listM1.add(m2);
        listM1.add(m3);
        listM1.add(m4);
        listM1.add(m5);
        listM1.add(m6);
        
//        for (int i = 0; i < listM1.size(); i++) {
//             System.out.println(listM1.get(i).id + " " + listM1.get(i).kategori + " " + listM1.get(i).merk + " " + listM1.get(i).harga);
//        }

        System.out.println(listM1.get(0).id + " " + listM1.get(0).kategori + " " + listM1.get(0).merk + " " + listM1.get(0).harga);
        System.out.println(listM1.get(1).id + " " + listM1.get(1).kategori + " " + listM1.get(1).merk + " " + listM1.get(1).harga);
        System.out.println(listM1.get(2).id + " " + listM1.get(2).kategori + " " + listM1.get(2).merk + " " + listM1.get(2).harga);
        System.out.println(listM1.get(3).id + " " + listM1.get(3).kategori + " " + listM1.get(3).merk + " " + listM1.get(3).harga);
        System.out.println(listM1.get(4).id + " " + listM1.get(4).kategori + " " + listM1.get(4).merk + " " + listM1.get(4).harga);
        System.out.println(listM1.get(5).id + " " + listM1.get(5).kategori + " " + listM1.get(5).merk + " " + listM1.get(5).harga);
        
        double totalBayar = pembeli1[0]*listM1.get(0).harga + pembeli1[1]*listM1.get(1).harga + pembeli1[2]*listM1.get(2).harga + pembeli1[3]*listM1.get(3).harga + pembeli1[4]*listM1.get(4).harga + pembeli1[5]*listM1.get(4).harga;
        System.out.println("Total biaya yang harus dibayar : " + totalBayar);
    }
}
