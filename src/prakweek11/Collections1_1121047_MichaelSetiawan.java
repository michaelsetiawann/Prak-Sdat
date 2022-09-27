/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Member {

    String nama;
    String telepon;

    public Member(String _nama, String _telepon) {
        nama = _nama;
        telepon = _telepon;
    }
}

class Buku {

    String idBuku;
    String judul;

    public Buku(String _idBuku, String _judul) {
        idBuku = _idBuku;
        judul = _judul;
    }
}

class Peminjaman {

    String idMember;
    String idBuku;

    public Peminjaman(String _idMember, String _idBuku) {
        idMember = _idMember;
        idBuku = _idBuku;
    }
}

public class Collections1_1121047_MichaelSetiawan {

    static HashMap<String, Member> members = new HashMap<String, Member>();
    static ArrayList<Buku> books = new ArrayList<Buku>();
    static LinkedList<Peminjaman> listPeminjaman = new LinkedList<Peminjaman>();

    public static void tambahMember(String id, String nama, String telepon) {
        members.put(id, new Member(nama, telepon));
    }

    public static void hapusMember(String nama) {
        for (Map.Entry<String, Member> set : members.entrySet()) {
            if (set.getValue().nama.equals(nama)) {
                members.remove(set.getKey());
                System.out.println("hapus data berhasil");
            }
        }
    }

    public static void tambahBuku(String idBuku, String judul) {
        books.add(new Buku(idBuku, judul));
    }

    public static void hapusBuku(String idBuku) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).idBuku.equals(idBuku)) {
                books.remove(i);
                break;
            }
        }
    }

    public static void pinjam(String idMember, String idBuku) {
        if (cekMember(idMember) && cekBuku(idBuku)) {
            listPeminjaman.add(new Peminjaman(idMember, idBuku));
        } else {
            System.out.println("data tidak ada!");
        }
    }

    public static void kembalikan(String idMember, String idBuku) {
        if (cekMember(idMember) && cekBuku(idBuku)) {
            listPeminjaman.remove(new Peminjaman(idMember, idBuku));
        } else {
            System.out.println("data tidak ada!");
        }
    }

    public static boolean cekMember(String id) {
        return members.get(id) != null;
    }

    public static boolean cekBuku(String id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).idBuku.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        String idMember;
        String nama;
        String telepon;
        String judul;
        String idBuku;
        while (menu != 7) {
            System.out.println("1.member baru\n2. hapus member\n3. tambah buku\n4.hapus buku\n5. pinjam\n6. kembalikan\7. exit");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("id member:");
                    idMember = input.next();
                    System.out.println("nama:");
                    nama = input.next();
                    System.out.println("telepon:");
                    telepon = input.next();
                    tambahMember(idMember, nama, telepon);
                    break;
                case 2:
                    System.out.println("nama:");
                    nama = input.next();
                    hapusMember(nama);
                    break;
                case 3:
                    System.out.println("id buku:");
                    idBuku = input.next();
                    System.out.println("judul buku:");
                    judul = input.next();
                    tambahBuku(idBuku, judul);
                    break;
                case 4:
                    System.out.println("id buku:");
                    idBuku = input.next();
                    hapusBuku(idBuku);
                    break;
                case 5:
                    System.out.println("id member:");
                    idMember = input.next();
                    System.out.println("id buku:");
                    idBuku = input.next();
                    pinjam(idMember, idBuku);
                    break;
                case 6:
                    System.out.println("id member:");
                    idMember = input.next();
                    System.out.println("id buku:");
                    idBuku = input.next();
                    kembalikan(idMember, idBuku);
                    break;
                default:
                    System.out.println("program keluar!");
            }
        }
    }
}
