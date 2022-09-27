/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Michael
 */
class Barang {

    String name;
    double[] price = new double[3];
    double avg;

    public Barang(String name, double week1, double week2, double week3) {
        this.name = name;
        this.price[0] = week1;
        this.price[1] = week2;
        this.price[2] = week3;
    }
}

public class no2 {

    public static String searchRange(Barang[] brg, double higher, double lower, int col) {
        if (brg[col].avg < higher && brg[col].avg > lower) {
            System.out.println(brg[col].name + " dengan harga rata-rata " + brg[col].avg);
            return searchRange(brg, higher, lower, col + 1);
        } else {
            return searchRange(brg, higher, lower, col + 1);
        }
    }

    public static double average(double[] price) {
        int result = 0;
        for (int i = 0; i < price.length; i++) {
            result += price[i];
        }
        return result / price.length;
    }

    public static void main(String[] args) {
        double higher = 60000;
        double lower = 45000;
        int i = 0;

        Barang[] arrBrg = new Barang[7];
        arrBrg[0] = new Barang("A", 90971, 7090, 6303);
        arrBrg[1] = new Barang("B", 26212, 75438, 51086);
        arrBrg[2] = new Barang("C", 63846, 10926, 48241);
        arrBrg[3] = new Barang("D", 88821, 73407, 73890);
        arrBrg[4] = new Barang("E", 57043, 95811, 8165);
        arrBrg[5] = new Barang("F", 73368, 49169, 74037);
        arrBrg[6] = new Barang("G", 3141, 33832, 79579);

        for (int j = 0; j < arrBrg.length; j++) {
            arrBrg[j].avg = average(arrBrg[j].price);
        }

        System.out.println("Barang dengan rata-rata " + lower + " - " + higher + ":");
        searchRange(arrBrg, higher, lower, i);
    }
}
