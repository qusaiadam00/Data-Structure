/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GQueue;

/**
 *
 * @author Qusai Almhmoudi
 */
public class CQueueG<T> {

    int Front, Rear;
    T[] data;

    public CQueueG() {
        data = (T[]) new Object[5];
        Front = Rear = 0;

    }

    public CQueueG(int size) {
        data = (T[]) new Object[size];
        Front = Rear = 0;

    }

    public boolean isEmpty() {
        return Front == Rear;
    }

    public boolean isFull() {
        return (Rear + 1) % data.length == Front;

    }

    public void Enqueue(T val) {
        if (isFull()) {
            System.out.println("The Queue is full you cannot Enqueue");
            return;
        }

        Rear = (Rear + 1) % data.length;
        data[Rear] = val;

    }

    public T Dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty you cannot Dequeue");
            return null;
        }
        Front = ((Front + 1) % data.length);
        return data[Front];
    }

    public T getFront() {
        if (isEmpty()) {
            return null;
        }
        return data[(Front + 1) % data.length];
    }

    public T getRear() {
        if (isEmpty()) {
            return null;
        }
        return data[Rear];
    }

    public int getSize(){
        int size =0;
        for (int i = (Front+1)%data.length; i != Rear;  i = (i+1)%data.length,++size);
        return (size+1);
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty ");
            return;
        }
        System.out.println("F " + Front + " R" + Rear);
        for (int i = (Front + 1) % data.length; i != Rear; i = (i + 1) % data.length) {
            System.out.print("[" + data[i] + "] ");
        }
        System.out.print("[" + data[Rear] + "]\n");
    }

    public void removeItem(T val) {
        boolean isFound = false;
        if (isEmpty()) {
            System.out.println("The Queue is Empty you cannot remove item :( ");
            return;
        }

        for (int i = Front + 1; i != Rear; i = (i + 1) % data.length) {

            if (data[i].equals(val)) {
                for (int j = i; j != Rear; j = (j + 1) % data.length) {
                    data[j] = data[(j + 1) % data.length];
                }
                isFound = true;
                Rear = (Rear - 1 + data.length) % data.length;
                break;
            }
        }
        String found = isFound ? "The IItem removed successfuly " : "the item is not found";
        System.out.println(found);
    }

    public void removeItem1(T val) {
        boolean isFound = false;
        if (isEmpty()) {
            System.out.println("The Queue is Empty you cannot remove item :( ");
            return;
        }
        int index = (Front + 1) % data.length;
        for (int i = Front + 1; i != (Rear + 1) % data.length; i = (i + 1) % data.length) {

            if (data[i] != val) {
                data[index] = data[i];
                index = (index + 1) % data.length;
                isFound = true;

            }
        }
        Rear = (Rear - 1 + data.length) % data.length;

        String found = isFound ? "The IItem removed successfuly " : "the item is not found";
        System.out.println(found);
    }
    public static void main(String[] args) {
        CQueueG c = new CQueueG();
        c.Enqueue(4);
        c.Enqueue(8);
        c.Enqueue(7);
        c.Enqueue(9);
        c.Enqueue(2);
        c.Enqueue(5);
        c.display();
        c.Dequeue();
        c.Dequeue();   c.display();
        c.Enqueue(55);
        c.Enqueue(88);
        c.Enqueue(66);
        c.display();
        System.out.println(c.getRear());
        c.removeItem1(9);
        c.removeItem1(55);
        c.display();
    }

}
