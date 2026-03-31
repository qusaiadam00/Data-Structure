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
public class ArrayG2DMain {

    static Stack<String> sk = DataStructures.getStack();
    static ArrayG2D arr;
    static Scanner sc = new Scanner(System.in);

    static void InitializeArrayG2D() {
        System.out.println("Enter number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int col = sc.nextInt();
        arr = new ArrayG2D(row, col);
        sk.push("ArrayG2D");
        ArrayG2D();
    }

    static void ArrayG2D() {

        System.out.println("\t<< ADT Of G 2D Array >>"
                + "\n1-Addition"
                + "\n2-Remove"
                + "\n3-Remove With Repetition And Skip Position"
                + "\n4-Remove With Repetition And Shifting To End Of Array"
                + "\n5-Remove And Shifting To End Of Array"
                + "\n6-Remove With Repetition And Shifting To End Of columns"
                + "\n7-Remove And Shifting To End Of columns"
                + "\n8-Display"
                + "\n0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");

        byte op2D = sc.nextByte();
        switch (op2D) {
            case 1:
                arr.insert(DataStructures.ChoTypeOfDataInput());
                break;
            case 2:
                arr.remove();
                break;
            case 3:
                arr.removeWithRepetitionAndSkipPosition();
                break;
            case 4:
                arr.removeWithRepetitionAndShiftToEndOfArr();
                break;
            case 5:
                arr.removeWithShiftToEndOfArr();
                break;

            case 6:
                arr.removeWithRepetitionAndShiftToEndCol();
                break;
            case 7:
                arr.removeWithShiftingToEndCol();
                break;
            case 8:
                arr.display();
                break;
            case 0:
                ArrayGMain.display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
        ArrayGMain.display(DataStructures.display());
    }
    public static void main(String[] args) {
        System.out.println(1%1);
        InitializeArrayG2D();
    }

}
