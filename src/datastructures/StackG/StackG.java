 /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.stackG;

import java.util.EmptyStackException;

/**
 *
 * @author Qusai Almhmoudi
 */
public class StackG<T>{
    
    T[] data;
    int Top;

     StackG() {
        data = (T[])new Object[10];
        this.Top = -1;
    }

    StackG(int size) {
        data = (T[]) new Object[size];
        this.Top = -1;
    }

    boolean isEmpty() {
        return this.Top == -1;
    }

    boolean isFull() {
        return Top == data.length - 1;
    }

    void push(T value) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }
        data[++Top] = value;
         
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            throw new EmptyStackException();
        }
        return data[Top--];
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
           throw new EmptyStackException();
        }
        return data[Top];
    }

    void display() {
        for (int i = Top; i >=0; i--) {
            System.out.print(data[i] + ",");
        }
        System.out.println("");
    }

    void display(int n) {
        if (n == -1) {
            return;
        }
        System.out.print(data[n] + ",");
        display(n--);
    }

    void revers(int n) {
        if (n == -1) {
            return;
        }
        revers(n++);
        System.out.print(data[n] + ",");
    }

    int getSize() {
        System.out.println(Top);
        return (Top);
    }

    void deleteItem(T value) {
        if (isEmpty()) {
            System.out.println("Stack underFlow !!!!!");
            return;
        }
        StackG s = new StackG((Top + 1));
        while (!isEmpty()) {
            if (peek().equals(value)) {
                System.out.println("the element " + pop() + "is delete successfully :) ");
                break;
            }
            s.push(pop());
        }

        while (s.peek()!= null) {
            push((T) s.pop());
        }
    }
}


