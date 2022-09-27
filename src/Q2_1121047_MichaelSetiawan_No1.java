
import java.util.HashMap;
import java.util.Random;
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
public class Q2_1121047_MichaelSetiawan_No1 {

    static ArrayList<String> kalimat = new ArrayList<String>();
    static HashMap<Integer, Integer> score = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        kalimat.add("why java developer wear glasses, because they can not c#");
        kalimat.add("he said \"you are semicolon to my statements\". then she replies \"sorry, but i code in python.\"");
        kalimat.add("programmer: an organism that turns caffeine into a sofware.");
        kalimat.add("there are 10 types of programmers in the world: those who understand binary, and those who don't.");
        kalimat.add("writing whole project as student: bring it on!; wrinting 10 lines of codes os salaride: bruh!!");

        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(5);

        String text = kalimat.get(x);
        System.out.println(text);
        String[] textArr = text.split(" ");
        System.out.println("input text:");
        String input = in.nextLine();
        String[] inputArr = input.split(" ");
        int score = 0;
        for (int i = 0; i < inputArr.length; i++) {
            boolean matched = false;
            for (int j = 0; j < textArr.length; j++) {
                if (inputArr[i].equals(textArr[j])) {
                    score++;
                    textArr[j] = "";
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                score--;
            }
        }
        if (inputArr.length != textArr.length) {
            System.out.println("jumlah kata berbeda!");
        }
        System.out.println("total score: " + score);
    }
}
