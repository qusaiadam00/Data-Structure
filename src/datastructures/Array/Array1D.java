/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Array;

import java.util.Scanner;

/**
 *
 * @author Qusai Al_mhmoudi
 *
 */
public class Array1D {

    static Scanner sc = new Scanner(System.in);
    static int array1d[];
    static int current;

    public Array1D() {
        this.array1d = new int[10];
        this.current = -1;
    }

    public Array1D(int size) {
        this.array1d = new int[size];
        this.current = -1;
    }

    static boolean isEmpty() {
        return (current == -1);
    }

    static boolean isFull() {
        return (current == array1d.length - 1);
    }

    public void insert() {
        if (isFull()) {
            System.out.println("Array is OverFlow ");
            return;
        }
        System.out.println("Enter array element : ");
        array1d[++current] = sc.nextInt();

    }

    public void addAt() {
        System.out.println("Enter element : ");
        int item = sc.nextInt();
        System.out.println("Enter position : ");
        int position = sc.nextInt();
        addAt(item, (position - 1));
    }

    public void delete(int item) {
        if (isEmpty()) {
            return ;
        }
        int newIndex = (array1d.length/2);
        for (int i = (array1d.length/2); i < array1d.length; i++) {
            if (array1d[i] != item) {
                array1d[newIndex++]= array1d[i];
            }
        }
        for (int i = newIndex; i < array1d.length; i++) {
            array1d[i]=0;
        }
    }

    static void addAt(int item, int position) {
        if (isFull()) {
            System.out.println("Array is OverFlow ");
            return;
        }

        if (position - current >= -1) {
            for (int i = current; i >= position; i--) {
                array1d[i + 1] = array1d[i];
            }
            array1d[position] = item;
            current++;
            System.out.println("Add success");
            return;
        }
        System.out.println("!!!!!!!!!");
    }

    public void addAfter() {
        if (isFull()) {
            System.out.println("Array is OverFlow");
            return;
        }
        System.out.println("Enter element : ");
        int item = sc.nextInt();
        System.out.println("Enter element after : ");
        int after = sc.nextInt();
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == after) {
                addAt(item, (i + 1));
                return;
            }
        }
        System.out.println("the element is not found :(");
    }

    void addBefore() {
        if (isEmpty()) {
            System.out.println("Array is OverFlow");
            return;
        }
        System.out.println("Enter element : ");
        int item = sc.nextInt();
        System.out.println("Enter element before : ");
        int before = sc.nextInt();
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == before) {
                addAt(item, i);
                return;
            }
        }
        System.out.println("the element is not found :(");
    }
//1- حذف مع التكرار في مصفوفة احادية

    void remove() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == elementdel) {
                array1d[i] = 0;
            }
        }
    }

    void removeWithShifting() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        int newIndex = 0;
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == elementdel) {
                array1d[i] = 0;
                break;
            }
        }
        for (int i = 0; i <= current; i++) {
            if (array1d[i] != 0) {
                array1d[newIndex++] = array1d[i];
            }
        }
        current--;
    }
//3- حذف مع التكرار والازاحة  في مصفوفة احادية

    void removeDuplicates() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int element = sc.nextInt();

        for (int i = 0; i <= current; i++) {
            //تصفير القيم
            if (array1d[i] == element) {//[5, 4, 5, 4]
                array1d[i] = 0;
            }
        }
    }

    public void removeDuplicatesWithShiftingAndSkipElement(int element) {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("enter the reptition you want to skip  : ");
        int indexSkip = sc.nextInt();
        int counter = 0;
        int newIndex = 0;
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == element) {
                ++counter;
                if (counter != indexSkip) {
                    array1d[i] = 0;

                }
            }
            if (array1d[i] != 0) {
                array1d[newIndex++] = array1d[i];
            }
        }
        current = newIndex - 1;
    }

    void removeReptitionOfItem() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter number : ");
        int elemet = sc.nextInt();
        System.out.println("Enter number of reptition that you want to remove it : ");
        int reptitionDel = sc.nextInt();
        int counter = 0;
        for (int i = 0; i <= current; i++) {
            if (array1d[i] == elemet) {
                ++counter;
                if (counter == reptitionDel) {
                    array1d[i] = 0;
                    break;
                }
            }
        }
        int newIndex = 0;
        for (int i = 0; i <= current; i++) {
            if (array1d[i] != 0) {
                array1d[newIndex++] = array1d[i];
            }
        }
        current--;
    }

    public int getNumberOfOddNumbers() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < array1d.length; i++) {

        }
        return counter;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i <array1d.length; i++) {
            System.out.print("[" + array1d[i] + "]");
        }

        System.out.println("\n-----------------");

    }
}
