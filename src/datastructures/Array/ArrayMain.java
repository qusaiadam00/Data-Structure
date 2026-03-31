/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.Array;

import static datastructures.Array.Array1DMain.Array1D;
import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class ArrayMain {
     static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);
    
    public static void Array() {
//        
        System.out.println("\t<<Menu of Array >>"
                + "\n1-Array 1D"
                + "\n2-Array 2D"
                + "\n0-Exit"
                + "\n----------"
                + "\n Enter number of opration you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
                sk.push("Array");
                Array1DMain.main(null);
                break;
            case 2:
                sk.push("Array");
                Array2DMain.main(null);
                break;
            case 0:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
    }
     public  static void display(String m) {
        if (m.equalsIgnoreCase("Array")) {
            Array();
        } else if (m.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (m.equalsIgnoreCase("Array2D")) {
            Array2DMain.Array2D();
        }else if (m.equalsIgnoreCase("Array1D")) {
            Array1DMain.Array1D();
        }
    }
    public static void main(String[] args) {
        Array();
    }
}
