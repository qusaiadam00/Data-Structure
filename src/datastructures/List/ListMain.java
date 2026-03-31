package datastructures.List;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Al mhmoudi
 */
public class ListMain {

    static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);
     
    private static void LinkedList() {
        System.out.println("\t<<Menu of Linked List>>"
                + "\n1-single LinkedList"
                + "\n2-double LinkedList "
                + "\n0-Exit"
                + "\n----------"
                + "\n Enter number of opration you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
               
                SingleMain.main(null);
                break;
            case 2:
               
                DoubleMain.main(null);
                break;
            case 0:
                datastructures.DataStructures.Exit();
                break;
            default:
                throw new AssertionError();
        }
        display(datastructures.DataStructures.display());
    }

    
    public static void display(String m) {
        if (m.equalsIgnoreCase("Linked List")) {
            LinkedList();
        } else if (m.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (m.equalsIgnoreCase("SingleList")) {
            SingleMain.main(null);
        } else if (m.equalsIgnoreCase("doubleList")) {
             DoubleMain.main(null);
        }

    }

    public static void main(String[] args) {
        sk.push("Linked List");
        LinkedList();
    }
}
