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
class Nodee {

    int data;
    Nodee next;

    public Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}
public class coba {
      static Nodee head = null;
    static Scanner scan = new Scanner(System.in);

    public static void addLast(int number) {
        Nodee newNode = new Nodee(number);
        if (head == null) {
            head = newNode;
        } else {
            Nodee temp = new Nodee(number);
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void addFirst(int number) {
        Nodee newNode = new Nodee(number);
//        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void deleteFirst() {
        if (head == null) {
            System.out.println("ERROR");
        } else {
            Nodee delete = head;
            head = delete.next;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            System.out.println("ERROR");
        } else {
            Nodee current = head;
            while (current.next != null) {
                current.next = current.next.next;
            }
            current.next = null;
        }
    }

    public static void delete(int number) {
        if (head == null) {
            System.out.println("ERROR");
        } else {
            Nodee current = head;
            while (current.next != null) {
                if (current.next.data==number) {
                    current.next = current.next.next;
                    break;
                } else {
                    current=current.next;
                }
            }
        }
    }

    public static void showOrder(int number) {
        Nodee current = head;
        int counter=0;
        boolean stat=false;
        if (current == null) {
            System.out.println("LL kosong");
        } else {
            while (current != null&&stat==false) {
                if (current.data==number) {
                    System.out.println("index ke- "+counter);
                    stat=true;
                } else {
                    current=current.next;
                }
                counter++;
            }
        }
    }

    public static void show() {
        Nodee current = head;
        if (current == null) {
            System.out.println("LL kosong");
        } else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        int menu;
        do {

            System.out.println("Pilih Menu : (1/2/3/4)");
            System.out.println("1. Add Last");
            System.out.println("2. Add First");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Delete");
            System.out.println("6. Show Order");
            System.out.println("7. Show");
            System.out.println("8. Exit");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan Angka yang mau di add Last :");
                    int num = scan.nextInt();
                    addLast(num);
                    break;
                case 2:
                    System.out.println("Masukkan Angka yang mau di add First :");
                    num = scan.nextInt();
                    addFirst(num);
                    break;
                case 3:
                    deleteFirst();
                    break;
                case 4:
                    deleteLast();
                    break;
                case 5:
                    System.out.println("Masukkan angka yang mau didelete:");
                    num = scan.nextInt();
                    delete(num);
                    break;
                case 6:
                    System.out.println("Masukkan angka yang mau dicari indexnya::");
                    num = scan.nextInt();
                    showOrder(num);
                    break;
                case 7:
                    show();
                    break;
                default:
                    System.out.println("Exitt");
                    break;
            }
        } while (menu != 8);

    }
}
