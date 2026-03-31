/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Array;

import datastructures.Queue.LinearArrayQueue;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Qusai Al_mhmoudi
 *
 */
public class Array2D {

    Scanner sc = new Scanner(System.in);
    int array2d[][];
    int counter = 0;
    int row = 0, col = 0;
    int rows;
    int cols;

    public Array2D(int row, int col) {
        this.array2d = new int[row][col];
        this.rows = row;
        this.cols = col;
    }

    public Array2D(int size) {
        this.array2d = new int[size][size];
        this.rows = this.cols = size;
    }

    boolean isEmpty() {
        return array2d == null || array2d.length == 0;
    }

    boolean isFull() {
        return (counter == (array2d.length * array2d[0].length));
    }

    public void deleteAllHlf(int item){
        for (int i = 0; i <array2d.length; i++) {
            for (int j = 0; j <array2d[0].length; j++) {
                if (array2d[i][j] == item && !(j+i==array2d.length-1)) {
                    array2d[i][j] = 0;
                }
            }
        }
    }
    void insert() {
        if (isFull()) {
            //.....
            return;
        }
        System.out.println("How many Iteams do You want to insert ? ");
        int lenth = sc.nextInt();
        if (counter + lenth > (rows * cols)) {
            System.err.println("you hava exceeded the allowed limit ###...");
            return;
        }
        int i = 0;
        B:
        for (int j = row; j < rows; j++) {
            for (int k = col; k < cols; k++) {
                if (i == lenth) {
                    break B;
                }
                System.out.println("Enter array element (" + j + "/" + k + ") : ");
                array2d[j][k] = sc.nextInt();
                i++;
                counter++;
                col++;
            }
            col = 0;
            row++;
        }
    }

//1- حذف مع التكرار في مصفوفة الثناىية
    void remove() {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }

        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array2d[i][j] == elementdel) {
                    array2d[i][j] = 0;
                    counter--;
                    return ;
                }
            }
        }
    }

    //2- حذف مع التكرار والازاحة لاخر المصفوفة في مصفوفة ثنائية
    void removeWithRepetitionAndShiftToEndOfArr() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();

        int writeRow = 0;
        int writeCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (array2d[i][j] != elementdel) {
                    array2d[writeRow][writeCol] = array2d[i][j];
                    writeCol++;
                    if (writeCol == cols) {
                        writeCol = 0;
                        writeRow++;

                    }

                }
                counter--;
            }
        }

        while (writeRow < rows) {
            array2d[writeRow][writeCol] = 0;
            writeCol++;
            if (writeCol == cols) {
                writeCol = 0;
                writeRow++;

            }
        }

    }

    void removeWithShiftToEndOfArr() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();

        int writeRow = 0;
        int writeCol = 0;
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (array2d[i][j] != elementdel || index > 1) {
                    index++;
                    counter--;
                    array2d[writeRow][writeCol] = array2d[i][j];
                    writeCol++;
                    if (writeCol == cols) {
                        writeCol = 0;
                        writeRow++;

                    }

                }
            }
        }

        while (writeRow < rows) {
            array2d[writeRow][writeCol] = 0;
            writeCol++;
            if (writeCol == cols) {
                writeCol = 0;
                writeRow++;

            }
        }

    }

    void change2DArrayTo1DArray(int array1D[], int array2D[][]) {
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1D[index++] = array2D[i][j];
            }
        }

    }

    void change1DArrayTo2DArray(int array1D[], int array2D[][]) {
        int index = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = array1D[index++];
            }
        }

    }
    // 3- حذف التكرارات مع ابقاء موقع معين

    void removeWithRepetitionAndSkipPosition() {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        int[] newArray1D = new int[rows * cols];
        change2DArrayTo1DArray(newArray1D, array2d);
        removeDuplicates(newArray1D, elementdel);
        change1DArrayTo2DArray(newArray1D, array2d);

    }

    void removeDuplicates(int array[], int element) {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }

        int index = 0;
        for (int i = 0; i < array.length; i++) {
//             التي قيمها لا تساوي صفر ِشرط لازاحة العناصر في المصفوفة
            if (array[i] != element) {
                array[index++] = array[i];
            }

        }
//    تصفير اماكن العناصر التي تم حذفه     
        for (int j = index; j < array.length; j++) {
            array[j] = 0;
        }
        counter = index;
    }

// 4- حذف التكرارات مع ا لازاحة لاخر الصف في المصفوفة الثنائية   
    void removeWithRepetitionAndShiftToEndCol() {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        for (int i = 0; i < array2d.length; i++) {
            removeDuplicates(array2d[i], elementdel);
        }
    }

    void removeWithShiftingToEndCol() {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }
        System.out.println("Enter element you want to delete it : ");
        int elementdel = sc.nextInt();
        for (int i = 0; i < array2d.length; i++) {
            if (array2d[0][i] == elementdel) {
                array2d[0][i] = 0;
                for (int j = i; j < array2d.length - 1; j++) {
                    array2d[0][j] = array2d[0][j + 1];
                }
                array2d[0][array2d.length - 1] = 0;
                break;
            }
        }
        counter--;
    }

    LinearArrayQueue lq;

    void ArrayToQueue() {
        lq = new LinearArrayQueue(counter);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                lq.Enqueue(array2d[i][j]);
            }
        }
    }

    void deleteWithRepetionItemByLQueue() {
        System.out.println(counter);
        ArrayToQueue();
        System.out.print("Enter item you want to delete it :");
        int itemDelete = sc.nextInt();
        lq.removeItem(itemDelete);
        QueueToArray();
    }

    void QueueToArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2d[i][j] = lq.Dequeue();
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println(" sorry array is empty :( ");
            return;
        }
        for (int i = 0; i < array2d.length; i++) {
            System.out.println(Arrays.toString(array2d[i]));
        }
        System.out.println("------------------");

    }

}
