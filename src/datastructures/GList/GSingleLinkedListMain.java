/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import static datastructures.GList.GListMain.display;
import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;
//public void deleteNoneItem(String val)
/**
 *
 * @author mohammed khaled
 */
public class GSingleLinkedListMain {

    static Scanner sc = new Scanner(System.in);
    static GSingleLinkedList singleList = new GSingleLinkedList();
    static Stack<String> sk = DataStructures.getStack();
   
    
    public static void SingleListG() {

        System.out.println("\t\t----<< Single Linked List Funiction >>----\n"
                + "\n\t\t[01]-Add First"
                + "\n\t\t[02]-Add Last"
                + "\n\t\t[03]-Add After"
                + "\n\t\t[04]-Add In Specific Position"
                + "\n\t\t[05]-Remove First"
                + "\n\t\t[06]-Remove Last"
                + "\n\t\t[07]-Remove From Specific Position"
                + "\n\t\t[08]-display"
                + "\n\t\t[09]-Remove Nodes Between two Postions"
                + "\n\t\t[10]-Get Size"
                + "\n\t\t[11]-Remove Node"
                + "\n\t\t[0]-Exit"
                + "\n\t\t---------------------------"
                + "\n Enter number of Function you want : ");

        byte op2D = sc.nextByte();
        switch (op2D) {
            case 1:
                System.out.println("Enter data you want to add it first :");
                singleList.addFirst(new Node(DataStructures.ChoTypeOfDataInput()));
                break;
            case 2:
                System.out.println("Enter data you want to add it Last :");
                singleList.addLast(new Node(DataStructures.ChoTypeOfDataInput()));
                break;
            case 3:
                System.out.println("Enter data you want to add it first and Enter Data After : ");
                singleList.addAfter(new Node(DataStructures.ChoTypeOfDataInput()), DataStructures.ChoTypeOfDataInput());
                break;
            case 4:
                System.out.println("Enter data you want to add it first and Enter position : ");
                singleList.addInSpecificPlace(new Node(DataStructures.ChoTypeOfDataInput()), sc.nextInt());
                break;
            case 5:
                singleList.removeFirst();
                break;
            case 6:
                singleList.removeLast();
                break;
            case 7:
                System.out.print("Enter index of Data that you want to remove : ");
                singleList.removeِAt(sc.nextInt());
                break;
            case 8:
                singleList.display();
                break;
            case 9:
                System.out.print("Enter postion 1 : ");
                int p1 =sc.nextInt();
                System.out.print("Enter postion 2: ");
                int p2 =sc.nextInt();
                singleList.deleteBtwPos("1",p1,p2);
                break;
            case 10:
                singleList.getSize();
                break;
            case 11:
                  System.out.println("Enter Data of Node that you want to remove : ");
                singleList.removeNode(DataStructures.ChoTypeOfDataInput());
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
        sk.push("SingleListG");
        SingleListG();
    }

}
