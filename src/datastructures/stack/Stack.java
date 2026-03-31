/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

import java.io.IOException;
import java.util.EmptyStackException;

/**
 *
 * @author Qusai Al mhmoudi
 */
public class Stack {

    int [] data;
    int Top;

    Stack() {
        data = new int[10];
        this.Top = -1;
    }

    Stack(int size) {
        data = new int[size];
        this.Top = -1;
    }

    boolean isEmpty() {
        return Top == -1;
    }

    boolean isFull() {
        return Top == data.length - 1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }
        data[++Top] = value;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            throw new EmptyStackException();
        }
        return data[Top--];
    }

    int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[Top];
    }

    void display() {
        System.out.print("Top-->");
        for (int i = Top; i >= 0; i--) {
            System.out.println("\t|  "+data[i] +" |");
        }
        System.out.println("--------------");
    }

    void display(int n) {
        if (n == -1) {
            return;
        }
        System.out.print(data[n] + ",");
        display(n-1);
    }

    void revers(int n) {
        if (n == -1) {
            return;
        }
         revers(n-1);
      System.out.print(data[n] + ",");
    }

    int getSize() {
        return (Top+1);
    }

    public int getNumberOfOddNumbers(){
        if (isEmpty()) {
            System.out.println("Stack underFlow");return -1;
        }
        int counter = 0;
        Stack s = new Stack(Top+1);
        while (!isEmpty()) {
            if (peek()%2 == 1) {
               ++counter; 
            }
            s.push(pop());
        }
        while (!s.isEmpty()) {
            push(s.pop());
        }
        return counter;
    }
    void deleteItem(int value) {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return;
        }
        Stack s = new Stack(Top + 1);
        while (!isEmpty()) {
            if (peek() == value) {
                System.out.println("the element " + pop() + "is delete successfully :) ");
                break;
            }
            s.push(pop());
        }

        while (!s.isEmpty()) {
            push(s.pop());
        }
    }
}
