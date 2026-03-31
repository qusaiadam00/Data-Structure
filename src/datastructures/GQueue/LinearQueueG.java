/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GQueue;

/**
 *
 * @author Qusai Almhmoudi
 */
public class LinearQueueG<T> {
    
    int Front;
    int Rear;
    T[] data;

    public LinearQueueG() {
        data = (T[]) new Object[10];
        Front = Rear = -1;
    }

    public LinearQueueG(int size) {
        data = (T[]) new Object[size];
        Front = Rear = -1;
    }

    public boolean isEmpty() {
        return (Rear == Front + 1);
    }

    public boolean isFull() {
        return (Rear == data.length - 1);
    }

    public void Enqueue(T val) {
        if (isFull()) {
            System.out.println("The Queue is full(overflow)");
            return;
        }
        data[++Rear] = val;
    }

    public T Dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty ");
            return null;
        }
        return data[++Front];
    }

    public T getFront() {
        if (isEmpty()) {
            return null;
        }

        return data[Front + 1];
    }

    public T getRear() {
        if (isEmpty()) {
            return null;
        }
        return data[Rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is empty ");
            return;
        }
        for (T val : data) {
            if (val != null) {
                System.out.print("[" + val + "] ");
            }
        }
        System.out.println("");
    }

    public int getSize() {
        return Front - Rear;
    }

    public void removeItem(T val) {
        if (isEmpty()) {
            System.out.println("The Qeueu is empty ");
            return;
        }
        for (int i = Front + 1; i <= Rear; i++) {
            if (data[i] == val) {
                for (int j = i; j < Rear; j++) {
                    data[j] = data[j + 1];
                }
                Rear--;
                break;
            }
        }
    }
}
