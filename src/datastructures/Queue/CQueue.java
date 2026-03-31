/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.Queue;
 

/**
 *
 * @author Qusai Almhmoudi
 */
public class CQueue {

    int Front, Rear;
    int[] data;
   

    public CQueue() {
        data = new int[5];
        Front = 0;
        Rear = 0;
    }

    public CQueue(int size) {
        data = new int[size];
        Front = 0;
        Rear = 0;
    }

    @Override
    public String toString() {
        return "CQueue{" + "Front=" + Front + ", Rear=" + Rear + ", data=" + data + '}';
    }

    public boolean isEmpty() {
        return Front == Rear;
    }

    public boolean isFull() {
        return (Rear+1)%data.length == Front;
    }

    public void Enqueue(int val) {
        if (isFull()) {
            System.out.println("The Queue is full you cannot Enqueue");
            return;
        }
        Rear = ((Rear + 1) % data.length);
        data[Rear] = val;
         
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty you cannot Dequeue");
            return 0;
        }
        Front = ((Front + 1) % data.length);
        return data[Front];
    }

    public int getFront() {
        if (isEmpty()) {
            return 0;
        }
        return data[(Front + 1) % data.length];
    }

    public int getRear() {
        if (isEmpty()) {
            return 0;
        }
        return data[Rear];
    }
    public int getSize(){
        int size = Front,length = 0;
        while (size != Rear) {
            length++;
            size =(size+1)%data.length;
        }
        return length;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty ");
            return;
        }
        for (int i = (Front+1)%data.length; i != Rear; i = (i + 1) % data.length) {
            System.out.print("[" + data[i] + "] ");
        }
        System.out.print("[" + data[Rear] + "] ");
        System.out.println("");
    }

    public void removeItem(int val) {
        boolean isFound = false;
        if (isEmpty()) {
            System.out.println("The Queue is Empty you cannot remove item :( 0");
            return;
        }
        for (int i = Front+1; i != Rear + 1; i = (i + 1) % data.length) {
            if (data[i] == val) {
                for (int j = i; j != Rear + 1; j = (j + 1) % data.length) {
                    data[j] = data[(j + 1) % data.length];

                }
                isFound = true;
                Rear = ((Rear-1 +data.length) % data.length);
                break;
            }

        }
        String found = isFound ? "The IItem removed successfuly " : "the item is not found";
        System.out.println(found);
    }
 

}
