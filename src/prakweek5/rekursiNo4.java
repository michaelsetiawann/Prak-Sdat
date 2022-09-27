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
public class rekursiNo4 {
    public static int totalAngka(int[] _angka,int panjang){ 
        int total=0; 
        panjang-=1; 
        if (panjang==-1) { 
            return total; 
        } else { 
            total= total+_angka[panjang]+ totalAngka(_angka,panjang); 
        } 
        return total; 
    }
    
    public static void main(String[] args) {
        int panjang=0;
        int hasil;
        int[] angka = {1, 3, 4};
        hasil = totalAngka(angka, panjang);
        System.out.println("hasil = " + hasil);
        
    }
}
