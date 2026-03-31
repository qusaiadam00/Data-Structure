/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.QueueByLinkedList;

/**
 *
 * @author Qusai Almhmoudi
 */
public class Node {
     char data;
    Node next;

    
    public Node() {
        this.next = null;
    }

    public Node(char data) {
        this();
        this.data = data;
    }

    public Node(char data, Node next) {
        this.data = data;
        this.next = next;
    }
    
}
