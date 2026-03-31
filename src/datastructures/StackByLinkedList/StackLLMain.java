/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.StackByLinkedList;

import datastructures.DataStructures;
import java.util.Scanner;

/**
 *
 * @author Qusai Almhmoudi
 */
public class StackLLMain {
  static   StackByLinkedList sk = new StackByLinkedList();
      static   Scanner sc =new Scanner(System.in);
                 
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
                sk.push(sc.nextInt());
                break;
            case 2:
                sk.pop();
                break;
            case 3:
                System.out.println(sk.peek());
                break;
                 case 4:
                sk.deleteItem(sc.nextInt());
                break;
                 case 5:
                 System.out.println(sk.getSize());
                break;
                 case 6:
                sk.display();
                break;
            case 7:
                DataStructures.main(new String[0]);
                break;
            default:
                throw new AssertionError();
        }
            datastructures.stack.StackMain.main(new String[0]);
    }  
}
