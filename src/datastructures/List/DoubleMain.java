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
public class DoubleMain {

    static Scanner sc = new Scanner(System.in);

    static DoubleLinkedList doubleList = new DoubleLinkedList();

    static void doubleList() {

        System.out.println("------<< ADT Of double LinkedList >>------"
                + "\n1-Add First"
                + "\n2-Add Last"
                + "\n3-Add After"
                + "\n4-Add Before"
                + "\n5-Add At(position)"
                + "\n6-Remove"
                + "\n7-Remove After"
                + "\n8-Remove Before"
                + "\n9-Remove At(positioon)"
                + "\n10-Display"
                + "\n11-delete Item Postion"
                + "\n0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");

        int op2D = sc.nextInt();
        switch (op2D) {
            case 1:
                doubleList.addFirst(new DNode(new Student()));
                break;
            case 2:
                doubleList.addLast(new DNode(new Student()));
                break;
            case 3:
                System.out.print("Enter id of student after : ");
                long after = sc.nextLong();
                doubleList.addAfter(new DNode(new Student()), after);
                break;
            case 4:
                System.out.print("Enter id of student after : ");
                long before = sc.nextLong();
                doubleList.addBefor(new DNode(new Student()), before);
                break;
            case 5:
                System.out.print("Enter id of student after : ");
                int post= sc.nextInt();
                doubleList.addAt(new DNode(new Student()), post);
                break;
            case 6:
                doubleList.removeNode(sc.nextLong());
                break;
            case 7:
                doubleList.removeAfter(sc.nextLong());
                break;
            case 8:
                doubleList.removeBefor(sc.nextLong());
                break;
            case 9:
                doubleList.removeAt(sc.nextLong());
                break;
            case 10:
                doubleList.display();
                break;
            case 11:
                doubleList.deleteItemPos("O");
                break;
            case 0:
                datastructures.DataStructures.Exit();
                break;
            default:
                throw new AssertionError();
        }
//        sc.next();
         display(datastructures.DataStructures.display());
    }

    public static void main(String[] args) {
         sk.push("doubleList");
        doubleList();
    }
}
