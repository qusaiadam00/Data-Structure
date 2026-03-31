/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.stack;

import datastructures.DataStructures;
import java.util.Scanner;

/**
 *
 * @author Qusai Al mhmoudi
 */
public class StackMain {

    static Stack sk = new Stack();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t\t---<< ADT Of Stack >>---"
                + "\n\t\t1-push "
                + "\n\t\t2-pop"
                + "\n\t\t3-peek"
                + "\n\t\t4-Remove Specific item"
                + "\n\t\t5-Get size"
                + "\n\t\t6-Display"
                + "\n\t\t7- Get number Of Odd Numbers"
                + "\n\t\t0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
                System.out.print("Enter item :");
                int pushItem = sc.nextInt();
                sk.push(pushItem);
                break;
            case 2:
                sk.pop();
                break;
            case 3:
                System.out.println("Top = "+sk.peek());
                break;
            case 4:
                System.out.print("Enter item you want to remove it : ");
                int itemDelete = sc.nextInt();
                sk.deleteItem(itemDelete);
                break;
            case 5:
                System.out.println("Size of stack = "+sk.getSize());
                break;
            case 6:
//                sk.display();
                sk.revers(sk.Top);
                break;
            case 7:
                System.out.println("number Of Odd Numbers = "+sk.getNumberOfOddNumbers());
                break;
            case 0:
                DataStructures.main(null);
                break;
            default:
                throw new AssertionError();
        }
        datastructures.stack.StackMain.main(null);
    }
}
