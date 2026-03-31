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
public class ArrayG1DMain {
       static Stack<String> sk = DataStructures.getStack();
    static Scanner sc = new Scanner(System.in);
    static ArrayG1D<Object> ar;
    static void InitializeArrayG1D() {
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        ar = new ArrayG1D(size);
        sk.push("ArrayG1D");
        ArrayG1D();
    }

    public static void ArrayG1D() {
        System.out.println("\t<< ADT Of G 1D Array >>"
                + "\n1-Addition "
                + "\n2-add At(position)"
                + "\n3-Add After"
                + "\n4-Add Befor"
                + "\n5-Remove"
                + "\n6-Remove With Shifting"
                + "\n7-Remove Duplicates"
                + "\n8-Remove Duplicates With Skip And Shifting"
                + "\n9-Remove  Specific Reptition "
                + "\n10-Display"
                + "\n0-Exit"
                + "\n---------------------------"
                + "\n Enter number of option you want : ");
        byte op1D = sc.nextByte();
        switch (op1D) {
            case 1:
                System.out.print("Enter Data : ");
                ar.insert(DataStructures.ChoTypeOfDataInput());
                break;
            case 2:
                ar.addAt( );
                break;
            case 3:
                ar.addAfter( );
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
                System.out.println("Enter ");
                ar.removeDuplicatesWithShiftingAndSkipElement(DataStructures.ChoTypeOfDataInput());
                break;
            case 9:
                ar.removeReptitionOfItem();
                break;
            case 10:
                ar.display();
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
        InitializeArrayG1D();
    }
}
