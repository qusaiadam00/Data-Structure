/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.QueueByLinkedList;

/**
 *
 * @author Qusai Almhmoudi
 */
public class QueueByLL {
     Node Front;
    Node Rear;

    public QueueByLL() {
        this.Front = null;
        this.Rear = null;
    }

    public boolean isEmpty() {
        return this.Front == null && this.Rear == null;
    }

    void Enqueue(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            this.Front = this.Rear = newNode;
            return;
        }
        this.Rear.next = newNode;
        this.Rear = newNode;
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty :( ");
            return;
        }
        this.Front = this.Front.next;
        if (this.Front == null) {
            this.Rear = null;
        }
    }

    public char getFront() {
        if (isEmpty()) {
            //......
            return '!';
        }
        return this.Front.data;
    }

    public char getRear() {
        if (isEmpty()) {
            //......
            return '!';
        }
        return this.Rear.data;
    }

    int getSize(){
        return 0;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty ");
            return;
        }
        Node curr = Front;
        while (curr != null) {
            System.out.print("[" + curr.data + "] ");
            curr = curr.next;
        }      
        System.out.println("");
    }

}
