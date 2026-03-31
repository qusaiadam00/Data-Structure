/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.ArrayG;

import java.util.Scanner;
import datastructures.DataStructures;

/**
 *
 * @author Qusai Al_mhmoudi
 *
 */
public class ArrayG2D<T> {

    Scanner sc = new Scanner(System.in);
    T array2d[][];
    int currRow;
    int currCol;

    public ArrayG2D(int row, int col) {
        this.array2d = (T[][]) new Object[row][col];
        this.currRow = -1;
        this.currCol = -1;
    }

    public ArrayG2D(int size) {
        this.array2d = (T[][]) new Object[size][size];
        this.currRow = -1;
        this.currCol = -1;
    }

    private boolean isEmpty() {
        return currCol == -1;
    }

    private boolean isFull() {
        return array2d[array2d.length - 1][array2d[0].length - 1] != null;
    }

    public void insert(T data) {
        if (isFull()) {
            System.err.println("Array is Full : ");
            return;
        }
        if ((currCol + 1) % array2d[0].length == 0) {
            currRow = (currRow + 1) % array2d.length;
        }
        BREAK:
        for (; currRow < array2d.length;) {
            for (; currCol < array2d[0].length;) {
                currCol = (currCol + 1) % array2d[0].length;
                array2d[currRow][currCol] = data;
                break BREAK;
            }
        }
    }

    //1- حذف مع التكرار في مصفوفة الثناىية
    void remove() {
        if (isEmpty()) {
            System.err.println(" sorry array is empty :( ");
            return;
        }
        boolean isFound = false;
        System.out.println("Enter element you want to delete it : ");
        Object elementdel = DataStructures.ChoTypeOfDataInput();
        BREAK:
        for (int i = 0; i <= currRow; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (array2d[i][j].equals(elementdel)) {
                    currCol = (currCol - 1 + array2d[0].length) % array2d[0].length;
                    array2d[i][j] = null;
                    isFound = true;
                    break BREAK;
                }
            }
        }
        String Massage = (isFound == true) ? "Delete successfully" : "The item is not found";
        System.out.println(Massage);

    }

    //2- حذف مع التكرار والازاحة لاخر المصفوفة في مصفوفة ثنائية
    public void removeWithRepetitionAndShiftToEndOfArr() {
        System.out.println("Enter element you want to delete it : ");
        T elementdel = (T) DataStructures.ChoTypeOfDataInput();
        int rows = array2d.length;
        int cols = array2d[0].length;
        int writeRow = 0;
        int writeCol = 0;

        for (int i = 0; i <= array2d[0].length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (array2d[i][j] != elementdel && array2d[i][j] != null) {
                    array2d[writeRow][writeCol] = array2d[i][j];
                    writeCol++;
                    if (writeCol == cols) {
                        writeCol = 0;
                        writeRow++;
                        continue;
                    }
                }
                array2d[i][j] = null;
                if (array2d[i][j] != null) {
                    currCol = (currCol - 1 + array2d[0].length) % array2d[0].length;
                }
            }
        }

        while (writeRow < rows) {
            array2d[writeRow][writeCol] = null;
            writeCol++;
            if (writeCol == cols) {
                writeCol = 0;
                writeRow++;
            }
        }
    }

    void removeWithShiftToEndOfArr() {
        if (isEmpty()) {
            System.err.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        Object elementdel = sc.next();

        int writeRow = 0;
        int writeCol = 0;
        int counter = 0;
        for (int i = 0; i < currRow; i++) {
            for (int j = 0; j < currCol; j++) {
                if (array2d[i][j] != elementdel || counter > 1) {
                    counter++;
                    array2d[writeRow][writeCol] = array2d[i][j];
                    writeCol++;
                    if (writeCol == currCol) {
                        writeCol = 0;
                        writeRow++;

                    }

                }
            }
        }

        while (writeRow < currRow) {
            array2d[writeRow][writeCol] = null;
            writeCol++;
            if (writeCol == currCol) {
                writeCol = 0;
                writeRow++;

            }
        }

    }

    void change2DArrayTo1DArray(T array1D[], T array2D[][]) {
        int counter = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array1D[counter++] = array2D[i][j];
            }
        }

    }

    void change1DArrayTo2DArray(T array1D[], T array2D[][]) {
        int counter = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = array1D[counter++];
            }
        }

    }
    // 3- حذف التكرارات مع ابقاء موقع معين

    void removeWithRepetitionAndSkipPosition() {
        if (isEmpty()) {
            System.err.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        T elementdel = (T) DataStructures.ChoTypeOfDataInput();
        T[] newArray1D = (T[]) new Object[array2d.length * array2d[0].length];
        change2DArrayTo1DArray(newArray1D, array2d);
        removeDuplicates(newArray1D, (T) elementdel);
        change1DArrayTo2DArray(newArray1D, array2d);

    }

    void removeDuplicates(T array[], T element) {
        if (isEmpty()) {
            System.err.println(" sorry array is empty :( ");
            return;
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
//             التي قيمها لا تساوي صفر ِشرط لازاحة العناصر في المصفوفة
            if (array[i] != element && array[i] != null) {
                array[counter++] = array[i];
            }
        }
//    تصفير اماكن العناصر التي تم حذفه     
        for (int j = counter; j < array.length; j++) {
            array[j] = null;
        }
    }

// 4- حذف التكرارات مع ا لازاحة لاخر الصف في المصفوفة الثنائية   
    void removeWithRepetitionAndShiftToEndCol() {
        if (isEmpty()) {
            System.err.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        Object elementdel = sc.next();
        for (int i = 0; i < array2d.length; i++) {
            removeDuplicates(array2d[i], (T) elementdel);
        }
    }

    void removeWithShiftingToEndCol() {
        if (isEmpty()) {
            System.err.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        Object elementdel = sc.next();
        for (int i = 0; i < array2d.length; i++) {
            if (array2d[0][i] == elementdel) {
                array2d[0][i] = null;
                for (int j = i; j < array2d.length - 1; j++) {
                    array2d[0][j] = array2d[0][j + 1];
                }
                array2d[0][array2d.length - 1] = null;
                break;
            }
        }
    }

    public void display() {
        if (isEmpty()) {
            System.err.println(" sorry Array is Empty :( ");
            return;
        }

        for (int i = 0; i <= currRow; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (array2d[i][j] == null) {
                    continue;
                }
                System.out.print("[" + array2d[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("------------------");

    }
}
