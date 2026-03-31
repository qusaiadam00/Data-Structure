/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import static datastructures.GList.GListMain.display;
import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class GDoubleLinkedListMain {

    static Scanner sc = new Scanner(System.in);
    static Stack<String> sk = DataStructures.getStack();
    static GDoubleLikedList doubleList = new GDoubleLikedList();

    public static void doubleListG() {

        System.out.println("\t\t----<< Double Linked List Funiction >>----\n"
                + "\n\t\t[01]-Add First"
                + "\n\t\t[02]-Add Last"
                + "\n\t\t[03]-Add At(position)"
                + "\n\t\t[04]-Add Before"
                + "\n\t\t[05]-Add After"
                + "\n\t\t[06]-Remove First"
                + "\n\t\t[07]-Remove Last"
                + "\n\t\t[08]-Remove Node"
                + "\n\t\t[09]-Remove After"
                + "\n\t\t[10]-Remove Before"
                + "\n\t\t[11]-Remove At(Position)"
                + "\n\t\t[12]-Display"
                + "\n\t\t[13]-convert double linked list to an array2D"
                + "\n\t\t[14]-Get Size"
                + "\n\t\t[0]-Exit"
                + "\n\t\t---------------------------"
                + "\n Enter number of option you want : ");

        byte op2D = sc.nextByte();
        switch (op2D) {
            case 1:
                doubleList.addFirst(new GDNode(new Student()));
                break;
            case 2:
                doubleList.addLast(new GDNode(new Student()));
                break;
            case 3:
                System.out.print("Enter Number of pooition that you want to Add At : ");
                int positionAdd = sc.nextInt();
                doubleList.addAt(new GDNode(new Student()), positionAdd);
                break;
            case 4:
                System.out.print("Enter ID of Student that you want to Add Befor him : ");
                long idBefor = sc.nextLong();
                doubleList.addBefor(new GDNode(new Student()), idBefor);
                break;
            case 5:
                System.out.print("Enter ID of Student that you want to Add After him : ");
                long idAfter = sc.nextLong();
                doubleList.addAfter(new GDNode(new Student()), idAfter);
                break;
            case 6:
                doubleList.removeHead();
                break;
            case 7:
                doubleList.removeTail();
                break;
            case 8:
                System.out.print("Enter ID of Student that you want to remove : ");
                long idRemove = sc.nextLong();
                doubleList.removeNode(idRemove);
                break;
            case 9:
                System.out.print("Enter ID of Student that you want to remove After him : ");
                long idRemoveAfter = sc.nextLong();
                doubleList.removeAfter(idRemoveAfter);
                break;
            case 10:
                System.out.print("Enter ID of Student that you want to remove Before him : ");
                long idRemoveBefore = sc.nextLong();
                doubleList.removeBefor(idRemoveBefore);
                break;
            case 11:
                System.out.print("Enter Number of pooition that you want to Remove it : ");
                int idRemoveAT = sc.nextInt();
                doubleList.removeAt(idRemoveAT);
                break;
            case 12:
                doubleList.display();
                break;
            case 13:
                doubleList.convertDLLToArray2D();
                break;
            case 14:
                doubleList.getSize();
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
        sk.push("doubleListG");
        doubleListG();
    }
}
