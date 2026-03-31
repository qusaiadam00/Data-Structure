/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.Queue;

/**
 *
 * @author Qusai Almhmoudi
 */
 public class LinearArrayQueue{

    int Front;
    int Rear;
    int[] data;

    public LinearArrayQueue() {
        data = new int[10];
        Front = Rear = -1;
    }

    public LinearArrayQueue(int size) {
        data =  new int[size];
        Front = Rear = -1;
    }

    public boolean isEmpty() {
        return (Rear == Front);
    }

    public boolean isFull() {
        return (Rear == data.length - 1);
    }

    public void Enqueue(int val) {
        if (isFull()) {
            System.out.println("The Queue is full(overflow)");
            return;
        }
        data[++Rear] = val;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty ");
            return 0;
        }
        return data[++Front];
    }

    public int getFront() {
        if (isEmpty()) {
            return 0;
        }

        return data[Front + 1];
    }

    public int getRear() {
        if (isEmpty()) {
            return 0;
        }
        return data[Rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty ");
            return;
        }
        for (int i = Front+1; i <=Rear; i++) {
            System.out.print("["+data[i]+"] ");
        }
        System.out.println("");
    }

    public int getSize() {
        return  Rear-Front;
    }

    public void removeItem(int val) {
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
                
            }
        }
    }
    public static void main(String[] args) {
        LinearArrayQueue l =  new LinearArrayQueue(5);
        l.Enqueue(1);
        l.Enqueue(4);
        l.Enqueue(1);
        l.Enqueue(8);
        
        l.display();
        l.removeItem(1);
        LinearArrayQueue ll =  new LinearArrayQueue(5);
        ll.Enqueue(l.Dequeue());
        ll.Enqueue(l.Dequeue());
        ll.Enqueue(l.Dequeue());
        ll.Enqueue(l.Dequeue());
        ll.display();
          System.out.println(l.getSize());
        l.Dequeue();
         
        l.display();
        System.out.println(l.getSize());
         
        l.Enqueue(9);
        l.Enqueue(6);
        l.display();
        System.out.println(l.getSize()); 
    }
}

