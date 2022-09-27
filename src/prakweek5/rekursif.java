/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek5;

/**
 *
 * @author Michael
 */
public class rekursif {

    static int total = 0;
    static int terbesar = 0;
    static int terkecil = 0;

    //no 1
    public static int reverseAngka(int angka) {
        if (angka == 0) {
            return total;
        } else {
            int temp = angka % 10;
            total = total * 10 + temp;
            reverseAngka(angka / 10);
        }
        return total;
    }

    //no 2
    public static String reverseWord(String word) {
        if (word.length() == 1) {
            return word;
        } else {
            return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
        }
    }

    //no 3
    public static int cariArray(int[] angka, int cari, int panjang) {
        if (panjang == 0) {
            return panjang - 1;
        } else {
            if (angka[panjang - 1] != cari) {
                return cariArray(angka, cari, panjang - 1);
            } else {
                return panjang - 1;
            }
        }
    }

    //no 4
    public static int arrayTotal(int[] arr, int panjang) {
        if (panjang == 0) {
            return arr[panjang];
        } else {
            return arr[panjang] + arrayTotal(arr, panjang - 1);
        }
    }

    //no 5
    public static int arrTerbesar(int[] arr, int panjang) {
        if (panjang > 0) {
            return Math.max(arr[panjang], arrTerbesar(arr, panjang - 1));
        } else {
            return arr[0];
        }
    }

    public static int arrTerkecil(int[] arr, int panjang) {
        if (panjang > 0) {
            return Math.min(arr[panjang], arrTerkecil(arr, panjang - 1));
        } else {
            return arr[0];
        }

    }

    //no 6
    public static int[] arrReverse(int[] angka, int depan, int belakang) {
        belakang -= 1;
        if (depan < belakang) {
            int temp = angka[depan];
            angka[depan] = angka[belakang];
            angka[belakang] = temp;
            arrReverse(angka, depan + 1, belakang);
        }
        return angka;
    }

    //no 7
    public static int jumlahPangkat(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * n * n) + jumlahPangkat(n - 1);
        }
    }

    //no 8
      public static void permutasi(String preFix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(preFix);
        } else {
            for (int i = 0; i < n; i++) {
                permutasi(preFix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }

    public static void main(String[] args) {
        //no1
        System.out.println("Nomor 1:");
        int num = 4567;
        System.out.println("Before : " + num);
        System.out.println("After : " + reverseAngka(num));
        
        //no2
        System.out.println("Nomor 2:");
        String word = "butuh ayank";
        System.out.println("Before : " + word);
        System.out.println("After : " + reverseWord(word));
        
        //no3
        System.out.println("Nomor 3:");
        int[] angka = {1, 1, 2, 7, 1, 3, 6, 4, 9};
        int cari = 10;
        int hasil = cariArray(angka, cari, angka.length);

        if (hasil == -1) {
            System.out.println("data tidak ditemukan!");
        } else {
            System.out.println("data ada di index ke-" + hasil);
        }
        
        // no 4
        System.out.println("Nomor 4:");
        int hasill = arrayTotal(angka, angka.length - 1);
        System.out.println("total : " + hasill);
        
        // no 5
        System.out.println("Nomor 5:");
        int terbesar = arrTerbesar(angka, angka.length - 1);
        System.out.println("terbesar : " + terbesar);
        int terkecil = arrTerkecil(angka, angka.length - 1);
        System.out.println("terkecil : " + terkecil);
        
        //no 6
        System.out.println("Nomor 6");
        int[] arr = arrReverse(angka, 0, angka.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //no 7
        
        System.out.println("Nomor 7:");
        System.out.println(jumlahPangkat(3));
        
        //no8
        System.out.println("Nomor 8:");
        String huruf = "ABC";
        permutasi("", huruf);
    }
}
