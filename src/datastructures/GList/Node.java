/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

 

/**
 *
 * @author mohammed khaled
 * 
 */
public class Node<T>{
    
    T data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(T data) {
        this();
        this.data = data;
    }

    public Node(T data, Node node) {
        this.data = data;
        this.next = node;
    }
}
