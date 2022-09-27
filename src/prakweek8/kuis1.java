/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek8;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Account {

    String name;
    String email;
    String password;
    String[] friendList = new String[3];
    int friendIndex = 0;

    public Account(String nama, String email, String password) {
        this.name = nama;
        this.email = email;
        this.password = password;
    }
}

class Server {

    String port;
    String name;
    String description;
    Account[] population = new Account[6];
    int populationIndex =0;

    public Server(String name, String description, String port) {
        this.name = name;
        this.description = description;
        this.port = port;
    }
}

public class kuis1 {

    static Scanner scan = new Scanner(System.in);
    static int server = 0, acc = 0, pop = 0;
    static Server[] arrServer = new Server[10];
    static Account[] arrAccount = new Account[6];
    static int account = 0;

    public static void serverBaru() {
        System.out.println("Masukkan nama");
        String nama = scan.next();
        System.out.println("Masukkan deskripsi");
        String description = scan.next();
        System.out.println("Masukkan port");
        String port = scan.next();
        arrServer[server] = new Server(nama, description, port);
        server++;
    }

    public static void account() {
        System.out.println("Masukan nama :");
        String input = scan.next();
        System.out.println("Masukan email : ");
        String email = scan.next();
        System.out.println("Masukan password : ");
        String password = scan.next();
        arrAccount[acc] = new Account(input, email, password);
        acc++;
    }

    public static String population(int acc, int ser) {
        arrServer[ser].population[arrServer[ser].populationIndex] = arrAccount[acc];
        System.out.println(arrAccount[acc]);
        arrServer[ser].populationIndex++;
        return arrServer[ser].population[arrServer[ser].populationIndex-1].name;
    }

    public static void printPopulasi(int ser) {
        System.out.println(arrServer[ser].populationIndex);
        for (int i = 0; i < arrServer[ser].populationIndex; i++) {
            System.out.println(arrServer[ser].population[i].name);
            System.out.println(arrServer[ser].population[i].email);
        }
    }
    public static void addFriend(int acc){
        for (int i = 0; i < arrAccount[acc].friendList.length; i++) {
            System.out.println("Masukan account yang ingin ditambah teman : ");
            String addFriend = scan.next();
            arrAccount[acc].friendList[arrAccount[acc].friendIndex] = addFriend;
        }
    }
    public static void printList(int acc) {
        for (int i = 0; i < arrAccount[acc].friendIndex; i++) {
            System.out.println(arrAccount[acc].friendList[arrAccount[i].friendIndex]);
        }
    }

    public static int hapusTemanAccount(int acc, String nama) {
        System.out.println("Pilih account yang ingin didelete : ");
        String delete = scan.next();
        for (int i = 0; i < arrAccount[acc].friendIndex; i++) {
            if (nama.equals(arrAccount[acc].friendList[arrAccount[i].friendIndex])) {
                arrAccount[acc].friendList[arrAccount[i].friendIndex] = delete;
            }
        }
        return acc;
    }
    public static int hapusAccountServer(int ser){
        System.out.println("Pilih account yang ingin didelete :");
        String delete = scan.next();
        for (int i = 0; i < arrServer[ser].populationIndex; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int menu = 0;
        while (menu != 7) {
            System.out.println("Choose menu : \n"
                    + "1.Create server\n"
                    + "2.Create Account\n"
                    + "3.Insert Population\n"
                    + "4.Print Population\n"
                    + "5.Print list friend\n"
                    + "6.Hapus teman\n"
                    + "7.Hapus akun\n"
                    + "8.exit");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    serverBaru();
                    break;
                case 2:
                    account();
                    break;
                case 3:
                    System.out.println("Pilih Account (1-6)");
                    int acc = scan.nextInt();
                    System.out.println("Pilih server (1-3");
                    int ser = scan.nextInt();
                    System.out.println(population(acc, ser) + " berhasil didaftarkan");
                    break;
                case 4:
                    System.out.println("Pilih server yang mau diprint :");
                    int server = scan.nextInt();
                    printPopulasi(server);
                    break;
                case 5:
                    System.out.println("Pilih akun yang mau diprint list friend : ");
                    int akun = scan.nextInt();
                    printList(akun);
                    break;
                case 6:
                    System.out.println("Pilih akun yang mau dihapus dari account :");
                    int account = scan.nextInt();
                    System.out.println("Masukan nama : ");
                    String nama = scan.next();
                    hapusTemanAccount(account, nama);
                    break;
                case 7:
                    System.out.println("Pilih akun yang mau di hapus dari server");
                    int hapus = scan.nextInt();
                    hapusAccountServer(hapus);
                    break;
                case 8:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Salah input data");
            }
        }
    }
}
