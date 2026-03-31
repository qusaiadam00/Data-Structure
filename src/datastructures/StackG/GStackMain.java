/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.stackG;

import datastructures.DataStructures;
import java.util.Scanner;

/**
 *
 * @author Qusai Al mhmoudi
 */
public class GStackMain {

    static StackG sk = new StackG();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t<< ADT Of Stack >>"
                + "\n1-push "
                + "\n2-pop"
                + "\n3-peek"
                + "\n4-Remove Specific item  "
                + "\n5-get size"
                + "\n6-display"
                + "\n7-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
                sk.push(DataStructures.ChoTypeOfDataInput());
                break;
            case 2:
                sk.pop();
                break;
            case 3:
                System.out.println(sk.peek());
                break;
            case 4:
                sk.deleteItem(DataStructures.ChoTypeOfDataInput());
                break;
            case 5:
                System.out.println("Size is : " + sk.getSize());
                break;
            case 6:
                sk.display();
                break;
            case 7:
                DataStructures.main(new String[0]);
            default:
                throw new AssertionError();
        }
        datastructures.stackG.GStackMain.main(new String[0]);
    }
}
