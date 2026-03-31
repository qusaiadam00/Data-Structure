/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.ArrayG;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class ArrayGMain {

    static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);

    public static void display(String m) {
        if (m.equalsIgnoreCase("ArrayG")) {
            ArrayG();
        } else if (m.equalsIgnoreCase("Main Menu")) {
            DataStructures.main(new String[0]);
        } else if (m.equalsIgnoreCase("ArrayG1D")) {
            ArrayG1DMain.ArrayG1D();
        } else if (m.equalsIgnoreCase("ArrayG2D")) {
            ArrayG2DMain.ArrayG2D();
        }
    }

    public static void ArrayG() {

        System.out.println("\t<<Menu of Ge Array >>"
                + "\n1-Array 1D G"
                + "\n2-Array 2D G"
                + "\n0-Exit"
                + "\n----------"
                + "\n Enter number of opration you want : ");
        byte op = sc.nextByte();
        switch (op) {
            case 1:
                sk.push("ArrayG");
                ArrayG1DMain.main(null);
                break;
            case 2:
                sk.push("ArrayG");
                ArrayG2DMain.main(null);
                break;
            case 0:
                display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        ArrayG();
    }
}
