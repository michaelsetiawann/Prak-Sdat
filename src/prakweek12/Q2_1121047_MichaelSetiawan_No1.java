/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Q2_1121047_MichaelSetiawan_No1 {

    static ArrayList<String> kalimat = new ArrayList<String>();
    static HashMap<Integer, Integer> typingScore = new HashMap<Integer, Integer>();
    static Scanner in = new Scanner(System.in);
    static int txtSekarang = -1;
    static int txtSebelum = -1;

    public static void typingTest(int x) {
        String text = kalimat.get(x);
        System.out.println(text);
        String[] textArr = text.split(" ");
        System.out.println("masukan text:");
        in.nextLine();
        String input = in.nextLine();
        String[] inputArr = input.split(" ");
        int score = 0;
        for (int i = 0; i < inputArr.length; i++) {
            boolean cek = false;
            for (int j = 0; j < textArr.length; j++) {
                if (inputArr[i].equals(textArr[j])) {
                    score++;
                    textArr[j] = "";
                    cek = true;
                    break;
                }
            }
            if (!cek) {
                score--;
            }
        }
        if (inputArr.length != textArr.length) {
            System.out.println("jumlah kata berbeda!");
        } else {
            System.out.println("jumlah kata sama");
        }
        if (typingScore.get(x) == null) {
            typingScore.put(x, score);
        }
        if (typingScore.get(x) > score) {
            typingScore.replace(x, score);
        }
    }

    public static void printScore() {
        System.out.println("PRINT SCORE");
        for (Integer i : typingScore.keySet()) {
            System.out.println("Score text ke-" + (i + 1) + ": " + typingScore.get(i));
        }
    }

    public static int randomize(int jumlah) {
        Random r = new Random();
        int random = r.nextInt(jumlah);

        return random;
    }

    public static void main(String[] args) {
        kalimat.add("why java developer wear glasses, because they can not c#");
        kalimat.add("he said \"you are semicolon to my statements\". then she replies \"sorry, but i code in python.\"");
        kalimat.add("programmer: an organism that turns caffeine into a sofware.");
        kalimat.add("there are 10 types of programmers in the world: those who understand binary, and those who don't.");
        kalimat.add("writing whole project as student: bring it on!; wrinting 10 lines of codes os salaride: bruh!!");

        txtSekarang = randomize(5);
        int x = 0;
        typingTest(x);

        int menu = 0;
        while (menu != 5) {
            System.out.println("1. ulang test saat ini\n"
                    + "2. ulang test sebelumnya\n"
                    + "3. next test\n"
                    + "4. print score\n"
                    + "5. stop\n"
                    + "pilih menu:");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    typingTest(txtSekarang);
                    break;
                case 2:
                    if (txtSebelum == -1) {
                        System.out.println("masih belum ada test sebelum!");
                    } else {
                        typingTest(txtSebelum);
                    }
                    break;
                case 3:
                    txtSebelum = txtSekarang;
                    txtSekarang = randomize(5);
                    typingTest(txtSekarang);
                    break;
                case 4:
                    printScore();
                    break;
                default:
                    System.out.println("program keluar!");
            }
        }

    }
}
