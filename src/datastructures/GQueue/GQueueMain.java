/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GQueue;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class GQueueMain<T> {

    static  LinearQueueG linearQueue = new  LinearQueueG<>();
    static  CQueueG cQueue = new  CQueueG();
    static Stack stack = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);

    public static void operationOfLQueue() {
        System.out.println("\t\t\t<< Linear Queue Operations >>"
                + "\n\n\t\t\t1-Enqueue"
                + "\n\t\t\t2-Dequeue"
                + "\n\t\t\t3-Get Front"
                + "\n\t\t\t4-Get Rear"
                + "\n\t\t\t5-Get Size"
                + "\n\t\t\t6-Remove Item"
                + "\n\t\t\t7-Display"
                + "\n\t\t\t8-Retreat"
                + "\n\n\t\t\t----------------");
        System.out.println("Choses Operation : ");
        byte opQueue = sc.nextByte();
        switch (opQueue) {
            case 1:
                cQueue.Enqueue(DataStructures.ChoTypeOfDataInput());
                break;
            case 2:
                cQueue.Dequeue();
                break;
            case 3:
                System.out.println(cQueue.getFront());
                break;
            case 4:
                System.out.println(cQueue.getRear());
                break;

            case 5:
                System.out.println(cQueue.getSize());
                break;
            case 6:
                cQueue.removeItem(DataStructures.ChoTypeOfDataInput());
                break;
            case 7:
                cQueue.display();
                break;
            case 8:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
        display(DataStructures.display());

    }

    public static void operationOfCQueue() {
        System.out.println("\t\t\t<< Linear Queue Operations >>"
                + "\n\n\t\t\t1-Enqueue"
                + "\n\t\t\t2-Dequeue"
                + "\n\t\t\t3-Get Front"
                + "\n\t\t\t4-Get Rear"
                + "\n\t\t\t5-Get Size"
                + "\n\t\t\t6-Remove Item"
                + "\n\t\t\t7-Display"
                + "\n\t\t\t8-Retreat"
                + "\n\n\t\t\t----------------");
        System.out.println("Choses Operation : ");
        byte opQueue = sc.nextByte();
        switch (opQueue) {
            case 1:
                linearQueue.Enqueue(DataStructures.ChoTypeOfDataInput());
                break;
            case 2:
                linearQueue.Dequeue();
                break;
            case 3:
                System.out.println(linearQueue.getFront());
                break;
            case 4:
                System.out.println(linearQueue.getRear());
                break;

            case 5:
                System.out.println(linearQueue.getSize());
                break;
            case 6:
                linearQueue.removeItem(DataStructures.ChoTypeOfDataInput());
                break;
            case 7:
                linearQueue.display();
                break;
            case 8:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
        display(DataStructures.display());

    }

    private static void display(String m) {
        if (m.equalsIgnoreCase("Queue")) {
            Queue();
        } else if (m.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (m.equalsIgnoreCase("operationOfLQueue")) {
            operationOfLQueue();
        } else if (m.equalsIgnoreCase("operationOfCQueue")) {
            operationOfCQueue();
        }

    }

    public static void Queue() {

        System.out.println("\t\t\t<< Queue >>"
                + "\n\n\t\t\t1-Linear Queue"
                + "\n\t\t\t2-Circular Queue"
                + "\n\t\t\t3-Retreat"
                + "\n\n\t\t\t----------------");

        System.out.println("Enter number of operation  : ");
        byte type = sc.nextByte();
        switch (type) {
            case 1:
                stack.push("operationOfLQueue");
                operationOfLQueue();
                break;
            case 2:
                 stack.push("operationOfCQueue");
                operationOfCQueue();
                break;
            case 3:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        stack.push("Queue");
       Queue();
    }
}
