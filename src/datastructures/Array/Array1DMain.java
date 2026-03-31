/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Array;

import datastructures.DataStructures;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Qusai Al_mhmoudi
 *
 */
public class Array1DMain {

    static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);
    static Array1D ar;

    static void InitializeArray1D() {
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        ar = new Array1D(size);
        sk.push("Array1d");
        Array1D();
    }

    static void Array1D() {
        System.out.println("\t---<< ADT Of 1D Array >>---"
                + "\n\t1-Addition "
                + "\n\t2-add At(position)"
                + "\n\t3-Add After"
                + "\n\t4-Add Befor"
                + "\n\t5-Remove"
                + "\n\t6-Remove With Shifting"
                + "\n\t7-Remove Duplicates"
                + "\n\t8-Remove Duplicates With Skip And Shifting"
                + "\n\t9-Remove  Specific Reptition "
                + "\n\t10-Display"
                + "\n\t11-Remove The Second Half Reptition And Shifting"
                + "\n\t0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");
        byte op1D = sc.nextByte();
        switch (op1D) {
            case 1:
                ar.insert();
                break;
            case 2:
                ar.addAt();
                break;
            case 3:
                ar.addAfter();
                break;
            case 4:
                ar.addBefore();
                break;
            case 5:
                ar.remove();
                break;
            case 6:
                ar.removeWithShifting();
                break;
            case 7:
                ar.removeDuplicates();
                break;

            case 8:
                ar.removeDuplicatesWithShiftingAndSkipElement(sc.nextInt());
                break;
            case 9:
                ar.removeReptitionOfItem();
                break;
            case 10:
                ar.display();
                break;
            case 11:
                ar.delete(4);
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
        InitializeArray1D();

    }
}
