/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek9;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    
    static Node head = null;

    public static void addLast(int num) {
        Node newNode = new Node(num);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void addFirst(int num) {
        Node newNode = new Node(num);
        
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void deleteFirst() {
        if (head == null) {
            System.out.println("LL kosong");
        } else {
            Node delete = head;
            head = delete.next;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            System.out.println("LL kosong");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp.next = temp.next.next;
            }
            temp.next = null;
        }
    }

    public static void delete(int num) {
        if (head == null) {
            System.out.println("LL kosong");
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == num) {
                    temp.next = temp.next.next;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public static void showOrder(int num) {
        if (head == null) {
            System.out.println("LL penuh!");
        } else {
            int counter = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == num) {
                    System.out.println("ada di index ke-" + counter);
                    break;
                } else {
                    counter++;
                    temp = temp.next;
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
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        int angka;
        while (menu != 8) {
            System.out.print("1. addLast\n"
                    + "2. addFirst\n"
                    + "3. deleteFirst\n"
                    + "4. deleteLast\n"
                    + "5. delete\n"
                    + "6. showOrder\n"
                    + "7. show\n"
                    + "8. exit\n"
                    + "pilih menu: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("masukan angka : ");
                    angka = scan.nextInt();
                    addLast(angka);
                    break;
                case 2:
                    System.out.print("masukan angka: ");
                    angka = scan.nextInt();
                    addFirst(angka);
                    break;
                case 3:
                    deleteFirst();
                    break;
                case 4:
                    deleteLast();
                    break;
                case 5:
                    System.out.print("masukan angka yg ingin di delete: ");
                    angka = scan.nextInt();
                    delete(angka);
                    break;
                case 6:
                    System.out.print("masukan angka: ");
                    angka = scan.nextInt();
                    showOrder(angka);
                    break;
                case 7:
                    show();
                    break;
                case 8:
                    System.out.println("program selesai!");
                    break;
                default:
                    System.out.println("input salah!");
            }
        }
    }
}
