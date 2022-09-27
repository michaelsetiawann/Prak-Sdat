
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael
 */
class Member {

    String nama;
    String telepon;

    public Member(String _nama, String _telepon) {
        this.nama = _nama;
        this.telepon = _telepon;
    }
}

class Peminjaman {

    String idMember;
    String idBuku;
    Undian undian;

    public Peminjaman(String idM, String idB) {
        this.idMember = idM;
        this.idBuku = idB;
    }
}

class Buku {

    String idBuku;
    String judul;
    Queue wait = new LinkedList();

    public Buku(String _idBuku, String _judul) {
        this.idBuku = _idBuku;
        this.judul = _judul;
    }

}

class Undian {

    int nomor;
    String idMember;

    public Undian(int number, String memberID) {
        this.nomor = number;
        this.idMember = memberID;
    }
}

public class Collectios2_1121047_MichaelSetiawan {

    static HashMap<String, Member> members = new HashMap<String, Member>();
    static LinkedList<Peminjaman> listPeminjaman = new LinkedList<Peminjaman>();
    static ArrayList<Buku> books = new ArrayList<Buku>();
    static HashSet<Undian> undian = new HashSet<Undian>();
    static Stack<String> book = new Stack<String>();
    static Scanner scan = new Scanner(System.in);
    static int number = 0;

    public static void tambahMember(String IDmember, String name, String number) {
        Member newMember = new Member(name, number);
        members.put(IDmember, newMember);
    }

    public static void hapusMember(String nama) {
        for (Map.Entry<String, Member> set : members.entrySet()) {
            if (set.getValue().nama.equals(nama)) {
                members.remove(set.getKey());
                System.out.println("hapus data berhasil");
            }
        }
    }

    public static void printMember() {
        members.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            Member m = members.get(entry.getKey());
            System.out.println(m.nama + " " + m.telepon);
            System.out.println("----------------------");
        });

    }

    public static void tambahBuku(String idBuku, String judul) {
        Buku newBuku = new Buku(idBuku, judul);
        books.add(newBuku);
    }

    public static void hapusBuku(String idBuku) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).idBuku.equals(idBuku)) {
                books.remove(i);
                System.out.println("Delete berhasil");
                break;
            }
        }
    }

    public static void prinBuku() {
        for (int i = 0; i < books.size(); i++) {
            Buku b = books.get(i);
            System.out.println(b.idBuku + " " + b.judul);
        }
    }

    public static void waitBook(String memberID, String bookID) {
        for (int i = 0; i < books.size(); i++) {
            Buku b = books.get(i);
            if (b.idBuku.equals(bookID)) {
                b.wait.add(memberID);
            }
        }
    }

    public static void checkWait(String idBuku) {
        for (int i = 0; i < books.size(); i++) {
            Buku b = books.get(i);
            if (b.idBuku.equals(idBuku)) {
                if (b.wait.size() > 0) {
                    String member = (String) b.wait.peek();
                    b.wait.remove();
                    pinjam(member, idBuku);
                    System.out.println("Ada antrian");
                } else {
                    System.out.println("Tidak ada antrian");
                }
                break;
            }
        }
    }

    public static void pinjam(String idMember, String idBuku) {
        if (checkMember(idMember) && checkID(idBuku)) {
            if (checkLent(idBuku)) {
                System.out.println("Buku telah dipinjam");
                waitBook(idMember, idBuku);
                System.out.println("Sekarang Anda berada dalam antrian");
            } else {
                Peminjaman pinjam = new Peminjaman(idMember, idBuku);
                listPeminjaman.add(pinjam);
                System.out.println("Buku dipinjam untuk " + idMember);
            }
        } else {
            System.out.println("ID tidak ditemukan");
        }
    }

    public static boolean checkLent(String idBuku) { 
        boolean found = false;
        Iterator iterato = listPeminjaman.iterator();
        while (iterato.hasNext()) {
            Peminjaman P = (Peminjaman) iterato.next();
            if (idBuku.equals(P.idBuku)) {
                found = true;
            }
        }
        return found;
    }

    public static boolean checkMember(String idMember) { 
        boolean found = false;
        for (HashMap.Entry<String, Member> set
                : members.entrySet()) {
            if (idMember.equals(set.getKey())) {
                found = true;
            }
        }
        return found;
    }

    public static boolean checkID(String idBuku) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Buku b = books.get(i);
            if (b.idBuku.equals(idBuku)) {
                found = true;
            }
        }
        return found;
    }

    public static void kembalikan(String idMember, String idBuku) {
        Iterator iterato = listPeminjaman.iterator();
        while (iterato.hasNext()) {
            Peminjaman P = (Peminjaman) iterato.next();
            if (P.idMember.equals(idMember) && P.idBuku.equals(idBuku)) {
                listPeminjaman.remove(P);
                System.out.println("Buku dikembalikan");
                checkWait(idBuku);
                break;
            }
        }
    }

    public static void printLent() { 
        Iterator iterato = listPeminjaman.iterator();
        while (iterato.hasNext()) {
            Peminjaman P = (Peminjaman) iterato.next();
            System.out.println(P.idMember + " " + P.idBuku);
        }
    }

    public static void undian(String idMember) { 
        number++;
        System.out.println(number);
        Undian undiann = new Undian(number, idMember);
        undian.add(undiann);
    }

    public static void winner() {

        Random rando = new Random();
        int win = rando.nextInt(undian.size()) + 1;
        System.out.println(win);
        Iterator iterator = undian.iterator();
        while (iterator.hasNext()) {
            Undian a = (Undian) iterator.next();
            if (a.nomor == win) {
                System.out.println("Pemenangnya adalah" + a.idMember + "dengan nomor " + a.nomor);
            }
        }
    }

    public static void buyBook(String judul) {
        book.push(judul);
    }

    public static String peekBook() {
        String judul;
        if (book.isEmpty()) {
            System.out.println("Tidak ada buku yang tidak terdaftar");
            return judul = null;
        } else {
            judul = (String) book.peek();
            System.out.println(judul);
            return judul;
        }
    }

    public static void popBook() {
        book.pop();
    }

    public static void main(String[] args) {
        String idMember;
        String nama;
        String telepon;
        String judul;
        String idBuku;
        int menu = 0;
        do {
            System.out.println("Pilih menu : \n"
                    + "1. Member baru\n"
                    + "2. Hapus Member\n"
                    + "3. Registrasi Buku\n"
                    + "4. Hapus Buku\n"
                    + "5. Pinjam\n"
                    + "6. Kembalikan\n"
                    + "7. Print Member\n"
                    + "8. Print Buku\n"
                    + "9. Print Pinjam\n"
                    + "10. Winner of the month\n" 
                    + "11. Beli Book\n");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("id member:");
                    idMember = scan.next();
                    System.out.println("nama:");
                    nama = scan.next();
                    System.out.println("telepon:");
                    telepon = scan.next();
                    tambahMember(idMember, nama, telepon);
                    break;
                case 2:
                    System.out.println("Input Member ID :");
                    idMember = scan.next();
                    hapusMember(idMember);
                    break;
                case 3:
                    String title = peekBook();
                    if (title != null) {
                        System.out.println("Input ID Buku " + title);
                        idBuku = scan.next();
                        tambahBuku(idBuku, title);
                        popBook();
                        System.out.println("Berhasil!");
                    } else {
                        System.out.println("Gagal!");
                    }
                    break;
                case 4:
                    System.out.println("Input ID buku untuk di delete");
                    nama = scan.next();
                    hapusBuku(nama);
                    break;
                case 5:
                    System.out.println("Input member ID : ");
                    idMember = scan.next();
                    System.out.println("Input ID buku : ");
                    idBuku = scan.next();
                    pinjam(idMember, idBuku);
                    break;
                case 6:
                    System.out.println("Input member ID :  ");
                    idMember = scan.next();
                    System.out.println("Input ID buku : ");
                    idBuku = scan.next();
                    kembalikan(idMember, idBuku);
                    break;
                case 7:
                    printMember();
                    break;
                case 8:
                    prinBuku();
                    break;
                case 9:
                    printLent();
                    break;
                case 10:
                    System.out.println("Pemenang bulan ini : "); 
                    winner();
                    break;
                case 11:
                    System.out.println("Input title :");
                    scan.nextLine();
                    judul = scan.nextLine();
                    buyBook(judul);
                    break;
                default:
                    System.out.println("Salah input!");
            }
        } while (menu != 12);

    }
}
