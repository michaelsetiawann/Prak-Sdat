/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanUTS;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
//class Account {
//
//    String name;
//    String email;
//    String password;
//    String[] friendList = new String[3];
//    int friendIndex = 0;
//
//    public Account(String name, String email, String password) {
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//}
//
//class Server {
//
//    String port;
//    String name;
//    String description;
//    Account[] population = new Account[6];
//    int populationIndex = 0;//digunakan saat input account to population
//
//    public Server(String name, String description, String port) {
//        this.name = name;
//        this.description = description;
//        this.port = port;
//    }
//}
class Account {

    String name;
    String email;
    String password;
    String[] friendList = new String[3];
    int counterFriend = 0; //count data yg sudah masuk array 

    public Account(String _name, String _email, String _pass) {
        this.name = _name;
        this.email = _email;
        this.password = _pass;
    }
}

class Server {

    String port;
    String name;
    String description;
    Account[] population = new Account[6];
    int counterPop = 0; //count data yg sudah masuk array 

    public Server(String _port, String _nama, String _desc) {
        this.port = _port;
        this.name = _nama;
        this.description = _desc;
    }
}

public class kuisGlen1 {

//    static Scanner in = new Scanner(System.in);
//    static Server[] server = new Server[5];
//    static int serverIndex = 0;
//    static Account[] account = new Account[server.length * 6];// jumlah server dikali dengan jumalah akun perserver
//    static int accountIndex = 0;
//
//    public static void newServer() {
//        if (serverIndex > server.length) {
//            System.out.println("semua server sudah terpakai!");
//        } else {
//            in.nextLine();//mencegah error karena nextLine
//            System.out.println("------server baru------");
//            System.out.print("nama: ");
//            String name = in.next();
//            System.out.print("deskripsi: ");
//            String description = in.nextLine();
//            System.out.print("port: ");
//            String port = in.next();
//            server[serverIndex] = new Server(name, description, port);
//            serverIndex++;
//        }
//    }
//
//    public static void newAccount() {// dengan asusmsi account ditambahkan tetapi tidak dimasukan ke server
//        if (accountIndex > account.length) {
//            System.out.println("Account penuh!");
//        } else {
//            System.out.print("nama: ");
//            String name = in.next();
//            System.out.print("email: ");
//            String email = in.next();
//            System.out.print("password: ");
//            String password = in.next();
//            account[accountIndex] = new Account(name, email, password);
//            accountIndex++;
//        }
//    }
//
//    public static String addToPopulation(int serNum) {//return boolean dengan asumsi return status keberhasilah input account
//        if (server[serNum].populationIndex > server[serNum].population.length) {
//            return "*";
//        } else {
//            for (int i = 0; i < account.length; i++) {
//                System.out.println((i + 1) + ". " + account[i].name);
//            }
//            System.out.print("pilih nomor akun: ");
//            int accNum = in.nextInt();
//            server[serNum].population[server[serNum].populationIndex] = account[accNum - 1];
//            String name = server[serNum].population[server[serNum].populationIndex].name;
//            server[serNum].populationIndex++;
//            return name;
//        }
//    }
//
//    public static void addFriend(int serNum) {// dengan asusmsi menambah teman dilakukan saat sebelum account dimasukan ke jadi jika menambah teman dan account sudah dimasukan ke server maka teman tidak akan muncul saar di print
//        for (int i = 0; i < account.length; i++) {
//            System.out.println((i + 1) + ". " + account[i].name);
//        }
//        System.out.print("pilih account yang ingin ditambah teman: ");
//        int userNum = in.nextInt();
//        if (server[serNum].population[userNum - 1].friendIndex > server[serNum].population[userNum - 1].friendList.length) {
//            System.out.println("teman penuh!");
//        } else {
//            String friendName = "";
//            while (friendName.equals("0")) {
//                System.out.print("nama teman(0 = stop): ");
//                friendName = in.next();
//                server[serNum].population[userNum - 1].friendList[server[serNum].population[userNum - 1].friendIndex] = friendName;
//                ++server[serNum].population[userNum - 1].friendIndex;
//            }
//        }
//    }
//
//    public static void serverPrint() {
//        System.out.print("pilih server(1-5)");
//        int serNum = in.nextInt();
//        for (int i = 0; i < server[serNum].population.length; i++) {
//            System.out.println("-----user number " + (i + 1) + "------");
//            System.out.println("name: " + server[serNum].population[i].name);
//            System.out.println("Friend list: ");
//            for (int j = 0; j < server[serNum].population[i].friendList.length; j++) {
//                System.out.println("- " + friendListPrint(serNum, i, j));
//            }
//        }
//    }
//
//    public static String friendListPrint(int serNum, int i, int j) {// dengan asumsi function ini digunakan pada prosedure serverPrint
//        return server[serNum].population[i].friendList[j];
//    }
//
//    public static String friendDelete(int serNum) {// dengan asumsi menghapus teman dari sebuat account yang sudah dimasukan ke server
//        for (int i = 0; i < server[serNum].populationIndex; i++) {
//            System.out.println((i + 1) + ". " + server[serNum].population[i].name);
//        }
//        System.out.print("pilih user yg ingin dihapus temannya: ");
//        int userNum = in.nextInt();
//        for (int i = 0; i < server[serNum].population[userNum - 1].friendIndex; i++) {
//            System.out.println((i + 1) + ". " + friendListPrint(serNum, userNum - 1, i));
//        }
//        System.out.print("pilih teman yg ingin dihapus: ");
//        int friendNum = in.nextInt();
//        String name = server[serNum].population[userNum - 1].friendList[friendNum - 1];
//        server[serNum].population[userNum - 1].friendList[friendNum - 1] = null;
//        --server[serNum].population[userNum - 1].friendIndex;
//        return name;
//    }
//
//    public static String accountDelete(int serNum) {
//        for (int i = 0; i < server[serNum].populationIndex; i++) {
//            System.out.println((i + 1) + ". " + server[serNum].population[i].name);
//        }
//        System.out.print("pilih user yg ingin dihapus: ");
//        int userNum = in.nextInt();
//        String name = server[serNum].population[userNum - 1].name;
//        server[serNum].population[userNum - 1] = null;
//        --server[serNum].populationIndex;
//        return name;
//    }
//
//    public static void main(String[] args) {
//        int menu = 0;
//        int serNum = 0;
//
//        System.out.println("1. Buat server baru\n"
//                + "2. buat account baru\n"
//                + "3. tambah teman\n"
//                + "4. masukan account ke server\n"
//                + "5. print populasi server\n"
//                + "6. hapus teman\n"
//                + "7. hapus akun\n"
//                + "8. exit");
//        System.out.print("pilih menu: ");
//        menu = in.nextInt();
//        switch (menu) {
//            case 1:
//                newServer();
//                break;
//            case 2:
//                newAccount();
//                break;
//            case 3:
//                System.out.print("pilih server (1-" + server.length + "): ");
//                serNum = in.nextInt();
//                addFriend(serNum);
//                break;
//            case 4:
//                System.out.print("pilih server (1-" + server.length + "): ");
//                serNum = in.nextInt();
//                addToPopulation(serNum);
//                break;
//            case 5:
//                serverPrint();
//                break;
//            case 6:
//                System.out.print("pilih server (1-" + server.length + "): ");
//                serNum = in.nextInt();
//                friendDelete(serNum);
//                break;
//            case 7:
//                System.out.print("pilih server (1-" + server.length + "): ");
//                serNum = in.nextInt();
//                accountDelete(serNum);
//                break;
//            case 8:
//                System.out.println("program keluar!");
//                break;
//            default:
//                System.out.println("input salah!");
//
//        }
//
//    }
    static Scanner scan = new Scanner(System.in);
    //counter 
    static int ser = 0;
    static int acc = 0;
    static Server[] arrServer = new Server[3];
    static Account[] arrAccount = new Account[6];

    public static void makeServer() {
        System.out.println("Membuat server");
        System.out.println("Masukkan port");
        String port = scan.next();
        System.out.println("Masukkan nama");
        String nama = scan.next();
        System.out.println("Masukkan deskripsi");
        String desc = scan.next();
        arrServer[ser] = new Server(port, nama, desc);
        System.out.println(ser);
        ser++;
    }

    public static void makeAccount() {
        System.out.println("Membuat Akun");
        System.out.println("Masukan nama :");
        String input = scan.next();
        System.out.println("Masukan email : ");
        String email = scan.next();
        System.out.println("Masukan password : ");
        String password = scan.next();
        arrAccount[acc] = new Account(input, email, password);
        acc++;
    }

    public static String addPopulation(int _acc, int _ser) {
        arrServer[_ser].population[arrServer[_ser].counterPop] = arrAccount[_acc];
        System.out.println(arrAccount[_acc]);
        arrServer[_ser].counterPop++;
        return arrServer[_ser].population[arrServer[_ser].counterPop - 1].name;
    }

    public static void printPopulation(int _ser) {
        System.out.println(arrServer[_ser].counterPop);
        System.out.println("Print Population");
        for (int i = 0; i < arrServer[_ser].counterPop; i++) {
            System.out.println(arrServer[_ser].population[i].name);
            System.out.println(arrServer[_ser].population[i].email);
            System.out.println(" ");
        }
    }

    public static void addFriend(int _acc) {
        for (int i = 0; i < arrAccount[_acc].friendList.length; i++) {
            System.out.println("Masukkan nama Teman :");
            String teman = scan.next();
            arrAccount[_acc].friendList[arrAccount[_acc].counterFriend] = teman;
        }
    }

    public static void printFriend(int _acc) {
        System.out.println("Print Friend");
        for (int i = 0; i < arrAccount[_acc].counterFriend; i++) {
            System.out.println(arrAccount[_acc].friendList[arrAccount[i].counterFriend]);
            System.out.println(" ");
        }
    }

    public static void deleteFriend(int _acc, String _nama) {
        System.out.println("Delete Friend");
        for (int i = 0; i < arrAccount[_acc].counterFriend; i++) {
            if (_nama.equals(arrAccount[_acc].friendList[arrAccount[i].counterFriend])) {
                arrAccount[_acc].friendList[arrAccount[i].counterFriend] = " ";
            }
        }
    }

    public static void deleteAccount(int _acc) {
        System.out.println("Delete Account " + _acc);
    }

    public static void main(String[] args) {
        int menu = 0;
        do {
            System.out.println("Pilih menu 1-9: \n"
                    + "1.Buat server\n"
                    + "2.Buat Akun\n"
                    + "3.Masuk akun ke populasi\n"
                    + "4.Print populasi\n"
                    + "5.Print daftar teman\n"
                    + "6.Hapus teman\n"
                    + "7.Hapus Akun\n"
                    + "8.Tambah teman\n"
                    + "9.Exit");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    makeServer();
                    break;
                case 2:
                    makeAccount();
                    break;
                case 3:
                    System.out.println("Pilih akun yang akan dimasukkan");
                    int account = scan.nextInt();
                    System.out.println("Pilih server yang akan dimasukkan");
                    int server = scan.nextInt();
                    System.out.println(addPopulation(account - 1, server - 1) + " sudah berhasil dimasukkan");
                    break;
                case 4:
                    System.out.println("Pilih server yang mau di print populasinya");
                    server = scan.nextInt();
                    printPopulation(server);
                    break;
                case 5:
                    System.out.println("Pilih akun yang mau di print daftar teman nya ");
                    account = scan.nextInt();
                    printFriend(account);
                    break;
                case 6:
                    System.out.println("Pilih akun yang mau dihapus daftar teman nya");
                    account = scan.nextInt();
                    System.out.println("Masukkan nama teman");
                    String nama = scan.next().toLowerCase();
                    deleteFriend(account, nama);
                    break;
                case 7:
                    System.out.println("Pilih Akun yang mau di hapus dari server");
                    account = scan.nextInt();
                    deleteAccount(account);
                    break;
                case 8:
                    System.out.println("Pilih Akun yang mau ditambahkan teman nya");
                    account = scan.nextInt();
                    addFriend(account);
                    break;
                case 9:
                    System.out.println("Program keluar");
                    break;
                default:
                    System.out.println("Input salah");
            }
        } while (menu != 9);

    }
}
