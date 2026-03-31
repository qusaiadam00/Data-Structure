/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Qusai Almhmoudi
 */
public class DataStructures {

    static Stack<String> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static Stack<String> getStack() {
        return stack;

    }

    public static Object ChoTypeOfDataInput() {
        Object typeIn ;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t---<Type of Input>>--- "
                + "\n\t\t1-String"
                + "\n\t\t2-Integer"
                + "\n\t\t3-Double"
                + "\n\t\t4-Char"
                + "\n----------------"
                + "\nEnter Number Of Option : ");
        byte typeInput = sc.nextByte();
        sc.nextLine();
        switch (typeInput) {
            case 1:
                typeIn = sc.nextLine();
                break;
            case 2:
                typeIn = sc.nextInt();
                break;
            case 3:
                typeIn = sc.nextDouble();
                break;
            case 4:
                typeIn = sc.next().charAt(0);
                break;
            default:
                throw new AssertionError();
        }
        return typeIn;
    }

    static void displayMenu() {
        stack.push("Main Menu");
        System.out.println("\t\t<< Menu >>");
        System.out.println("\n\t 1-Array ADT "
                + "\n\t 2-LinkedList ADT "
                + "\n\t 3-Stack ADT By Array"
                + "\n\t 4-Stack ADT By Linked List"
                + "\n\t 5-Queue ADT By Array"
                + "\n\t 6-Queue ADT By Linked List"
                + "\n\t 7-Generics Array ADT"
                + "\n\t 8-Generics Linked List ADT"
                + "\n\t 9-Generics Stack ADT"
                + "\n\t 10-Generics Queue ADT"
                + "\n\t 11-Tree"
                + "\n\t 0-Exit"
                + "\n----------------"
                + "\n Enter number of option you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
                datastructures.Array.ArrayMain.main(new String[0]);
                break;
            case 2:
                datastructures.List.ListMain.main(new String[0]);
                break;
            case 3:
                datastructures.stack.StackMain.main(new String[0]);
                break;
            case 4:
                datastructures.StackByLinkedList.StackLLMain.main(new String[0]);
            case 5:
                datastructures.Queue.MainQueue.main(new String[0]);
                break;
            case 6:
                datastructures.QueueByLinkedList.QueueLLMain.main(new String[0]);
                break;
            case 7:
                datastructures.ArrayG.ArrayGMain.main(new String[0]);
                break;
            case 8:
                datastructures.GList.GListMain.main(new String[0]);
                break;
            case 9:
                datastructures.stackG.GStackMain.main(new String[0]);
                break;
            case 10:
                datastructures.GQueue.GQueueMain.main(new String[0]);
                break;
            case 11:
                datastructures.GQueue.GQueueMain.main(new String[0]);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static String Exit() {
        stack.pop();
        return stack.peek();
    }

    public static String display() {
        return (stack.peek());
    }

    public static void main(String[] args) {
         stack.push("DataStructures");
        displayMenu();

    }

}
