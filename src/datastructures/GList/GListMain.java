/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class GListMain {

    static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);

    private static void LinkedListG() {

        System.out.println("\t\t----<*< Menu of Linked List >*>----\n\n"
                + "\n\t\t1-single LinkedList"
                + "\t\t\n\t\t2-double LinkedList "
                + "\t\t\n\t\t0-Exit"
                + "\n\n----------------"
                + "\n Enter number of opration you want : ");

        byte op = sc.nextByte();
         format();
        switch (op) {
            case 1:
                GSingleLinkedListMain.main(null);
                break;
            case 2:
                GDoubleLinkedListMain.main(null);
                break;
            case 0:
                datastructures.DataStructures.Exit();
                break;
            default:
            //throw new AssertionError();
        }
        datastructures.DataStructures.display();
    }

    public static void format() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void display(String text) {
        if (text.equalsIgnoreCase("Linked ListG")) {
            LinkedListG();
        } else if (text.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (text.equalsIgnoreCase("SingleListG")) {
            GSingleLinkedListMain.SingleListG();
        } else if (text.equalsIgnoreCase("doubleListG")) {
            GDoubleLinkedListMain.doubleListG();
        }
    }

    public static void main(String[] args) {
        System.out.println(4%2);
        System.out.println(5%2);
         sk.push("Linked ListG");
        LinkedListG();

    }
}
