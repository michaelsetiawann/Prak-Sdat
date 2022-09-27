/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusPrakweek10;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Node {

    int info;
    Node next;
    Node prev;

    public Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class BS_B_1121047_MichaelSetiawan {

    static Scanner scan = new Scanner(System.in);
    static Node head = null;
    static Node tail = null;

    public static void sorted() {
        System.out.print("masukan angka: ");
        int info = scan.nextInt();
        Node newNode = new Node(info);
        newNode.info = info;

        if (head == null) {
            tail = newNode;
            newNode.next = head;
            head = newNode;
        } else if (info >= tail.info) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (info <= head.info) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.info >= newNode.info) {
                    Node temp = current.next;
                    current.next = newNode;
                    newNode.prev = current;
                    current.next = temp;
                    temp.prev = current.next;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public static void displayForward() {
        if (head == null) {
            System.out.println("data kosong!");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.info);
                current = current.next;
            }
        }
    }

    public static void ascending() {
        System.out.print("masukan angka awal: ");
        int awal = scan.nextInt();
        System.out.print("masukan angka akhir: ");
        int akhir = scan.nextInt();
        if (head == null) {
            System.out.println("data kosong!");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.info >= awal && temp.info <= akhir) {
                    System.out.println(temp.info);
                }
                temp = temp.next;
            }
        }
    }

    public static void descending() {
        System.out.print("masukan angka awal: ");
        int awal = scan.nextInt();
        System.out.print("masukan angka akhir: ");
        int akhir = scan.nextInt();
        if (head == null) {
            System.out.println("data kosong!");
        } else {
            Node temp = tail;
            while (temp != null) {
                if (temp.info >= awal && temp.info <= akhir) {
                    System.out.println(temp.info);
                }
                temp = temp.prev;
            }
        }
    }

//    public static int sumBefore() {
//        if (head == null) {
//            System.out.println("data kosong!");
//        } else {
//            Node current = head;
//        }
//    }

    public static void main(String[] args) {
        int menu = 0;
        while (menu != 6) {
            System.out.print("1. insert\n"
                    + "2. print LL\n"
                    + "3. ascending\n"
                    + "4. descending\n"
                    + "5. sum before\n"
                    + "6. exit\n"
                    + "pilih menu: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    sorted();
                    break;
                case 2:
                    displayForward();
                    break;
                case 3:
                    ascending();
                    break;
                case 4:
                    descending();
                    break;
                case 5:
                    sumBefore();
                    break;
                case 6:
                    System.out.println("program selesai!");
                    break;
                default:
                    System.out.println("salah input!");
            }
        }
    }
}
