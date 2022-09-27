/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek10;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
//class Node {
//
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}

public class SLL_1121047_MichaelSetiawan {

    static Node head = null;
    static Node tail = null;

    public static void addFirst(int number) {
        if (head == null) {
            head = new Node(number);
            tail = head;
        } else {
            Node temp = new Node(number);
            temp.next = head;
            head = temp;
        }
    }

    public static void addLast(int number) {
        Node newNode = new Node(number);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            System.out.println("Data kosong");
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public static void show() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void showReverse(Node head) {
        if (head == null) {
            return;
        }
        showReverse(head.next);
        System.out.println("data = " + head.data);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        int angka;
        while (menu != 6) {
            System.out.print("1. addFirst\n"
                    + "2. addLast\n"
                    + "3. deleteLast\n"
                    + "4. show\n"
                    + "5. show reverse\n"
                    + "6.exit\n"
                    + "pilih menu: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("masukan angka : ");
                    angka = scan.nextInt();
                    addFirst(angka);
                    break;
                case 2:
                    System.out.print("masukan angka: ");
                    angka = scan.nextInt();
                    addLast(angka);
                    break;
                case 3:
                    deleteLast();
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    showReverse(head);
                    break;
                case 6:
                    System.out.println("program selesai!");
                    break;
                default:
                    System.out.println("input salah!");
            }
        }
    }
}
