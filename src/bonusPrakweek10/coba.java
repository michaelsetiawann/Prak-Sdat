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
//class Node {
//
//    int info;
//    Node next, prev;
//
//    public Node(int info) {
//        this.info = info;
//        this.next = null;
//    }
//}

public class coba {
    static Node head = null, tail = null;

    public static void insert(int info) {
        Node newNode = new Node(info);
        if (head == null) {
            head = newNode;
            tail = head;
        } else if (info < head.info) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else if (info > tail.info) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.info > info) {
                    Node temp = current.next;
                    current.next = newNode;
                    newNode.prev = current;
                    current.next = temp;
                    temp.prev = current.next;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public static void show() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.info);
                temp = temp.next;
            }
        }
    }

    public static void rangeAsc(int awal, int akhir) {
        if (head == null) {
            System.out.println("LL kosong!");
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

    public static void rangeDesc(int awal, int akhir) {
        if (head == null) {
            System.out.println("LL kosong!");
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

    public static void sumBefore(int num) {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            int total = 0;
            Node temp = tail;
            while (temp != null) {
                System.out.println(temp.info);
                if (temp.info < num) {
                    total += temp.info;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0;
        int input, awal, akhir;
        while (menu != 5) {
            System.out.print("1. insert\n"
                    + "2. print\n"
                    + "3. range\n"
                    + "4. sumBefore\n"
                    + "5. exit\n"
                    + "pilih menu: ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("insert number: ");
                    input = in.nextInt();
                    insert(input);
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    System.out.print("1. ascending\n"
                            + "2. decending\n"
                            + "pilih urutan: ");
                    int urutan = in.nextInt();
                    System.out.print("awal: ");
                    awal = in.nextInt();
                    System.out.print("akhir: ");
                    akhir = in.nextInt();
                    if (urutan == 1) {
                        rangeAsc(awal, akhir);
                    } else {
                        rangeDesc(awal, akhir);
                    }
                case 4:
                    System.out.print("input number: ");
                    input = in.nextInt();
                    sumBefore(input);
                    break;
                case 5:
                    System.out.println("program keluar!");
                    break;
                default:
                    System.out.println("input salah!");
            }
        }
    }
}
