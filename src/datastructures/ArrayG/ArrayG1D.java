/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.ArrayG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Qusai Al_mhmoudi
 *
 */
public class ArrayG1D<T>{

    Scanner sc = new Scanner(System.in);
    T array1d[];
    int currentPocition = -1;

    public ArrayG1D() {

    }

    public ArrayG1D(int size) {
        this.array1d = (T[]) new Object[size];
    }

    private boolean isFull() {
        return currentPocition == array1d.length - 1;
    }

    private boolean isEmpty() {
        return currentPocition == -1;
    }

    public void insert(T item) {
        if (isFull()) {
            System.out.println("Array is Full :)");
            return;
        }
        array1d[++currentPocition] = item;
    }

    public void addAt() {
        System.out.println("Enter element : ");
        Object item = sc.next();
        System.out.println("Enter position : ");
        int position = sc.nextInt();

        addAt((T) item, (position - 1));
    }

    void addAt(T item, int position) {
        if (isFull()) {
            System.out.println("Array is OverFlow ");
            return;
        }
        if (position <= (currentPocition + 1) && position < array1d.length) {
            for (int i = currentPocition; i >= position; i--) {
                array1d[i + 1] = array1d[i];
            }
            array1d[position] = item;
            currentPocition++;
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
        Object item = sc.next();
        System.out.println("Enter element after : ");
        Object after = sc.next();
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i].equals(after)) {
                addAt((T) item, (i + 1));
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
        Object item = sc.next();
        System.out.println("Enter element before : ");
        Object before = sc.next();
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i].equals(before)) {
                addAt((T) item, i - 1);
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
        Object elementdel = sc.next();
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i].equals(elementdel)) {
                array1d[i] = null;
                break;
            }
        }
        int newIndex = 0;
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i] == null) {
                continue;
            }
            array1d[newIndex++] = array1d[i];
        }
    }

    void removeWithShifting() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        Object elementdel = sc.next();
        int newIndex = 0;
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i].equals(elementdel)) {
                array1d[i] = null;
                break;
            }
        }
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i] != null) {
                array1d[newIndex++] = array1d[i];
            }
        }
        currentPocition--;
    }
//3- حذف مع التكرار والازاحة  في مصفوفة احادية

    void removeDuplicates() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        Object element = sc.next();

        for (int i = 0; i <= currentPocition; i++) {
            //تصفير القيم
            if (array1d[i] == element) {//[5, 4, 5, 4]
                array1d[i] = null;
            }
        }
    }

    public void removeDuplicatesWithShiftingAndSkipElement(T element) {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.print("enter the reptition you want to skip  : ");
        int indexSkip = sc.nextInt();
        int counter = 0;
        int newIndex = 0;
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i] == element) {
                ++counter;
                if (counter != indexSkip) {
                    array1d[i] = null;

                }
            }
            if (array1d[i] != null) {
                array1d[newIndex++] = array1d[i];
            }
        }
        currentPocition = newIndex - 1;
    }

    void removeReptitionOfItem() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter number : ");
        Object elemet = sc.next();
        System.out.println("Enter number of reptition that you want to remove it : ");
        int reptitionDel = sc.nextInt();
        int counter = 0;
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i] == elemet) {
                ++counter;
                if (counter == reptitionDel) {
                    array1d[i] = null;
                    break;
                }
            }
        }
        int newIndex = 0;
        for (int i = 0; i <= currentPocition; i++) {
            if (array1d[i] != null) {
                array1d[newIndex++] = array1d[i];
            }
        }
        currentPocition--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i <= currentPocition; i++) {
            System.out.print("[" + array1d[i] + "]");
        }

        System.out.println("\n-----------------");
    }
}
