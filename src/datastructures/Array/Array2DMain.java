/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.Array;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Almhmoudi
 */
public class Array2DMain {

    static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);
    static Array2D arr;

    static void InitializeArray2D() {
        System.out.println("Enter number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int col = sc.nextInt();
        arr = new Array2D(row, col);
        sk.push("Array2d");
        Array2D();
    }

    static void Array2D() {
        
        System.out.println("\t\t---<< ADT Of 2D Array >>---"
                + "\n\t1-Addition"
                + "\n\t2-Remove"
                + "\n\t3-Remove With Repetition And Skip Position"
                + "\n\t4-Remove With Repetition And Shifting To End Of Array"
                + "\n\t5-Remove And Shifting To End Of Array"
                + "\n\t6-Remove With Repetition And Shifting To End Of columns"
                + "\n\t7-Remove And Shifting To End Of columns"
                + "\n\t8-Display"
                + "\n\t9-Change Array to Queue And Delete"
                + "\n\t10-delete All hlf"
                + "\n\t0-Exit"
                + "\n\t---------------------------"
                + "\n Enter number of option you want : ");

        byte op2D = sc.nextByte();
        switch (op2D) {
            case 1:
                arr.insert();
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
            case 9:
                 arr.deleteWithRepetionItemByLQueue();
                 break;
            case 10:
                arr.deleteAllHlf(10);
                break;
            case 0:
                ArrayMain.display(DataStructures.Exit());
                break;
            default:
                throw new AssertionError();
        }
       ArrayMain.display(DataStructures.display());
    }
    public static void main(String[] args) {
        InitializeArray2D();
    }
}
