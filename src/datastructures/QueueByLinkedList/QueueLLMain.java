/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.QueueByLinkedList;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class QueueLLMain {

    static QueueByLL linearQueue = new QueueByLL();

    static Stack stack = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);

    public static void operationOfLQueue() {
        System.out.println("\t\t\t<< Linear Queue Operations >>"
                + "\n\n\t\t\t1-Enqueue"
                + "\n\t\t\t2-Dequeue"
                + "\n\t\t\t3-Get Front"
                + "\n\t\t\t4-Get Rear"
                + "\n\t\t\t5-Get Size"
                + "\n\t\t\t6-Display"
                + "\n\t\t\t7-Retreat"
                + "\n\n\t\t\t----------------");
        System.out.println("Choses Operation : ");
        byte opQueue = sc.nextByte();
        switch (opQueue) {
            case 1:
                linearQueue.Enqueue(sc.next().charAt(0));
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
                linearQueue.display();
                break;
            case 7:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
        display(DataStructures.display());

    }

    private static void display(String m) {

        if (m.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (m.equalsIgnoreCase("operationOfLQueue")) {
            operationOfLQueue();

        }
    }

    public static void main(String[] args) {
        operationOfLQueue();
    }
}
