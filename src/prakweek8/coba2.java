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
class Node {
    int data;
    Node next, prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class coba2 {
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
            while(current != null) {
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
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public static void displayBackward() {
        if (head == null) {
            System.out.println("LL kosong!");
        } else {
            Node temp = tail;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.prev;
            }
        }
    }
    
    public static void addOrdered(int nilai) {
        Node newNode = new Node(nilai);
        if (head == null) {
            head = tail = newNode;
        } else if(nilai < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if(nilai > tail.data) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
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
        int counter = 0;
        double total = 0;
        Node temp = head;
        while(temp != null) {
            counter++;
            total += temp.data;
            temp = temp.next;
        }
        return (total/counter);
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int menu = 0;
        int input;
        while(menu != 8) {
            System.out.print("1. addFirst\n"
                    + "2. addLast\n"
                    + "3. insertAfter\n"
                    + "4. displayForward\n"
                    + "5. displyaBackward\n"
                    + "6. addOrdered\n"
                    + "7. average\n"
                    + "8. exit\n"
                    + "pilih menu: ");
            menu = in.nextInt();
            switch(menu) {
                case 1:
                    System.out.print("input number: ");
                    input = in.nextInt();
                    addFirst(input);
                    break;
                case 2:
                    System.out.print("input number: ");
                    input = in.nextInt();
                    addLast(input);
                    break;
                case 3:
                    System.out.print("input number: ");
                    input = in.nextInt();
                    System.out.print("after: ");
                    int after = in.nextInt();
                    if (insertAfter(after, input)) {
                        System.out.println("berhasil input "+input);
                    } else {
                        System.out.println("after tidak ditemukan!");
                    }
                    break;
                case 4:
                    displayForward();
                    break;
                case 5:
                    displayBackward();
                    break;
                case 6:
                    System.out.print("input number: ");
                    input = in.nextInt();
                    addOrdered(input);
                    break;
                case 7:
                    System.out.println(average());
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
