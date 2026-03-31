/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.List;

import static datastructures.List.ListMain.display;
import static datastructures.List.ListMain.sk;
import java.util.Scanner;

/**
 *
 * @author Qusai Almhmoudi
 */
public class SingleMain {

    static Scanner sc = new Scanner(System.in);
    static SingleLinkedList singleList = new SingleLinkedList();

    static void SingleList() {
        System.out.println("\t<< ADT Of Single Linked List >>"
                + "\n1-Add First"
                + "\n2-Add Last"
                + "\n3-Add After"
                + "\n4-Add In Specific Position"
                + "\n5-Remove First"
                + "\n6-Remove Last"
                + "\n7-Remove From Specific Position"
                + "\n8-display"
                + "\n0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");
        String element;
         int index;
        byte op2D = sc.nextByte();
        switch (op2D) {
            case 1:
                System.out.print("Enter element : ");
                element = sc.next();
                singleList.addFirst(new Node(element));
                break;
            case 2:
                System.out.print("Enter element: ");
                element = sc.next();
                singleList.addLast(new Node(element));
                break;
            case 3:
                System.out.print("Enter element : ");
                element = sc.next();
                System.out.println("Enter element After");
                String after = sc.next();
                singleList.addAfter(new Node(element), after);
                break;
            case 4:
                System.out.print("Enter element : ");
                element = sc.next();
                System.out.println("Enter number of index");
                index = sc.nextInt();
                singleList.addAt(new Node(element), index);
                break;
            case 5:
                singleList.removeFirst();
                break;
            case 6:
                singleList.removeLast();
                break;
            case 7:
                System.out.println("Enter index delete");
                index = sc.nextInt();
                singleList.removeAt(index);
                break;
            case 8:
                singleList.display();
                break;
            case 0:
                datastructures.DataStructures.Exit();
                break;
            default:
                throw new AssertionError();
        }

        display(datastructures.DataStructures.display());
    }

    public static void main(String[] args) {
        sk.push("SingleList");
        SingleList();
    }
}
