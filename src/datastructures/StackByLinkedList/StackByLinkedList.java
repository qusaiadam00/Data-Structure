/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.StackByLinkedList;

/**
 *
 * @author Qusai Almhmoudi
 */
public class StackByLinkedList {
   
    Node Top;

    public StackByLinkedList() {
        this.Top = null;
    }

    boolean isEmpty() {
        return Top == null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            Top = newNode;
            return;
        }
        newNode.next = Top;
        Top = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return 0;
        }
        Node curr = Top; 
        Top = Top.next;
        return curr.data;
    }

    int peek() {
        if (isEmpty()) {
            //......
            return 0;
        }
        return Top.data;
    }

    void display() {
        Node curr = Top;
        while (curr != null) {
            System.out.print(curr.data + " , ");
            curr = curr.next;
        }
        System.out.println("");
    }

    void display(Node curr) {
        if (curr == null) {
            return;
        }
        System.out.print(curr.data + ",");
        display(curr.next);
    }

    int getSize() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        Node curr = Top;
        while (curr != null) {
            ++size;
            curr = curr.next;
        }
        return size;
    }

    void deleteItem(int value) {
        if (isEmpty()) {
            System.out.println("Stack underFlow");
            return;
        }
        StackByLinkedList s = new StackByLinkedList();
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
