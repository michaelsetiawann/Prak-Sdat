
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
public class Q2_1121047_MichaelSetiawan_No2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        double avg = 0;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        int hari = scan.nextInt();
        for (int i = 0; i < hari; i++) {
            int suhu = scan.nextInt();
            arrayList.add(suhu);
            avg += suhu;
            if (suhu < 0) {
                count1++;
            } else if (suhu == 0) {
                count2++;
            } else if (suhu > 0 && suhu < 35) {
                count3++;
            } else if (suhu >= 35) {
                count4++;
            }
        }

        Object max = Collections.max(arrayList);
        Object min = Collections.min(arrayList);

        System.out.println("Suhu Tertinggi : " + max);
        System.out.println("Suhu Terendah : " + min);
        System.out.println("Suhu Rata-rata : " + avg / hari);
        System.out.println("- suhu < 0 = " + count1 + "hari ");
        System.out.println("- suhu = 0 = " + count2 + "hari ");
        System.out.println("- suhu > 0 dan < 35 = " + count3 + "hari ");
        System.out.println("- suhu >= 35 = " + count4 + "hari ");
    }
    
}
