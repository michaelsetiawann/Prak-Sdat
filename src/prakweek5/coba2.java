/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakweek5;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
class Node {

//    int data;
    Node next;
}

public class coba2 {
     static Node head = null;

    public static void addLast(int number) {
        Node newNode = new Node();
        newNode.data = number;

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

    public static void addFirst(int number) {
        Node newNode = new Node();
        newNode.data = number;

        newNode.next = head;
        head = newNode;
    }

    public static void deleteFirst() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {

            if (head.next == null) {
                System.out.println(head.data);
                head = null;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                System.out.println(temp.data);
                temp = null;
                System.out.println(temp.data);
            }
        }
    }

    public static void delete(int number) {
        boolean status = true;
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            if (head.data == number) {
                System.out.println(head.data);
                head = head.next;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data == number) {
                        System.out.println(temp.next.data);
                        temp.next = temp.next.next;
                        status = false;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
            }
            if (status) {
                System.out.println("data tidak ditemukan!");
            }
        }
    }

    public static void showOrder(int number) {
        if (head == null) {
            System.out.println("LL penuh!");
        } else {
            int i = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == number) {
                    System.out.println("ada di urutan ke-" + i);
                    break;
                } else {
                    i++;
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
        Scanner in = new Scanner(System.in);
        int menu = 0;
        int number;
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
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("masukan int: ");
                    number = in.nextInt();
                    addLast(number);
                    break;
                case 2:
                    System.out.print("masukan int: ");
                    number = in.nextInt();
                    addFirst(number);
                    break;
                case 3:
                    deleteFirst();
                    break;
                case 4:
                    deleteLast();
                    break;
                case 5:
                    System.out.print("masukan int yg ingin dihapus: ");
                    number = in.nextInt();
                    delete(number);
                    break;
                case 6:
                    System.out.print("masukan int: ");
                    number = in.nextInt();
                    showOrder(number);
                    break;
                case 7:
                    show();
                    break;
                case 8:
                    System.out.println("program keluar!");
                    break;
                default:
                    System.out.println("input salah!");
            }
        }
    }
}
