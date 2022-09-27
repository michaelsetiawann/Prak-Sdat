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
class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DLL_1121047_MichaelSetiawan {

    static Node head = null;
    static Node tail = null;

    public static void addFirst(int number) {
        if (head == null) {
            head = new Node(number);
        } else {
            Node temp = new Node(number);
            temp.next = head;
            head = temp;
            head.next.prev = head;
        }
    }

    public static void addLast(int number) {
        if (head == null) {
            head = new Node(number);
            tail = head;
        } else {
            Node temp = new Node(number);
            temp.prev = tail;
            tail.next = temp;
            tail = tail.next;
        }
    }

    public static boolean insertAfter(int key, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return false;
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    Node temp = current.next;
                    newNode.next = temp;
                    temp.prev = newNode;
                    current.next = newNode;
                    newNode.prev = current;
                    return true;
                } else {
                    current = current.next;
                }
            }
        }
        return false;
    }

    public static void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void displayBackward() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            Node temp = tail;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
    }

    public static void addOrdered(int nilai) {
        Node newNode = new Node(nilai);
        if (head == null) {
            head = tail = newNode;
        } else if (nilai < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (nilai > tail.data) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data > nilai) {
                    Node temp = current.next;
                    current.next = newNode;
                    newNode.prev = current;
                    newNode.next = temp;
                    temp.prev = current.next;
                    break;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public static double average() {
        int count = 0;
        double total = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            total += temp.data;
            temp = temp.next;
        }
        return (total / count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        int angka;
        while (menu != 8) {
            System.out.print("1. addFirst\n"
                    + "2. addLast\n"
                    + "3. insertAfter\n"
                    + "4. display Forward\n"
                    + "5. display Backward\n"
                    + "6.add Order\n"
                    + "7.average\n"
                    + "8.exit\n"
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
                    System.out.print("masukan angka: ");
                    angka = scan.nextInt();
                    System.out.print("after: ");
                    int after = scan.nextInt();
                    if (insertAfter(after, angka)) {
                        System.out.println("Berhasil insert " + angka);
                    } else {
                        System.out.println("After tidak ditemukan");
                    }
                    break;
                case 4:
                    displayForward();
                    break;
                case 5:
                    displayBackward();
                    break;
                case 6:
                    System.out.print("masukan angka: ");
                    angka = scan.nextInt();
                    addOrdered(angka);
                    break;
                case 7:
                    System.out.println(average());
                    break;
                case 8:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("input salah!");
            }
        }

    }
}

