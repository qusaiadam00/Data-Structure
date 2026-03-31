/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import java.util.Scanner;

/**
 *
 * @author mohammed khakled
 * 
 */
public class GSingleLinkedList<T> {

    static Scanner sc = new Scanner(System.in);
    public Node Head;

    public GSingleLinkedList() {
        Head = null;
    }

    boolean isEmpty() {
        return Head == null;
    }

    void addFirst(Node node) {

        node.next = Head;
        Head = node;
        System.out.println("Addition sccess :) ");

    }

    void addLast(Node node) {

        if (isEmpty()) {
            addFirst(node);
            return;
        }
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        System.out.println("Addition sccess :) ");
    }

    void addAfter(Node node, T after) {

        if (isEmpty()) {
            System.out.println("List is empty :( ");
            return;
        }
        Node result = find(after);
        if (result != null) {
            node.next = result.next;
            result.next = node;
            System.out.println("addition success :) ");
            return;
        }
        System.out.println("Element not fount");

    }

    private Node find(T after) {
        Node current = Head;
        while (current != null) {
            if (current.data.equals(after)) {
                break;
            }
            current = current.next;
        }
        return current;
    }

    private Node find(int posit) {
        Node current = Head;
        int index = 0;
        while (current != null) {
            if (index++ == posit-1) {
                break;
            }
            current = current.next;
        }

        return current;
    }

    void display() {
        for (Node current = Head; current != null; current = current.next) {
            System.out.print("[" + current.data + "]--> ");
        }
        System.out.println();
    }
    
     public void removeNode(T item){
        if (isEmpty()) {
            System.out.println("Empty List :(");
           return ; 
        }
        Node result = find(item);
        if (result != null) {
            if (Head.data.equals(result.data)) {
                removeFirst();return ;
            }
            Node temp = Head;
            while (temp.next != result) {
                temp = temp.next;
            }
            temp.next = result.next;
            result.next = null;
            return ;
        }
        System.out.println("Element is not found :( ");
    }
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Sorry the List is Empty :( ");
            return;
        }
        Head = Head.next;
        System.out.println("remove success !");

    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Sorry the List is Empty :( ");
            return;
        }
        Node current = Head;
        if (current.next == null) {
            Head = null;
            return;
        }
        current = Head.next;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("The element " + current.next.data + " deleted success !");
        current.next = null;

    }

    void addInSpecificPlace(Node node, int indexPlace) {

        if (isEmpty()) {
            System.out.println("list is empty ");
            return;
        }
        if (indexPlace == 1) {
            addFirst(node);
            return;
        }
        Node result = find(indexPlace );
        System.out.println(result.data);
        if (result != null) {
            node.next = result.next;
            result.next = node;
            System.out.println("addition success :) ");
            return;
        }
        System.out.println("list does not have values to reach the place you want !");
    }

    void removeِAt(int post) {
        if (isEmpty()) {
            System.out.println("list is empty ");
            return;
        }
        if (post == 1) {
            removeFirst();
            return;
        }
        Node result = find(post - 1);
        if (result.next != null) {
            result.next = result.next.next;
            System.out.println("remove successly :) ");
            return;
        }
        System.out.println("list does not have values to reach the place you want !");

    }

    int getSize() {
        if (isEmpty()) {
            //.....
            return 0;
        }
        Node curr = Head;
        int size = 0;
        while (curr != null) {
            ++size;
            curr = curr.next;
        }
        return size;
    }

    public void deleteBtwPos(String item, int post1, int post2) {
         if (isEmpty() || post1 == post2 || post1 < 0 || post2 > getSize()) {
            return;
        }      
        Node temp;
        for (int i = post1+1; i < post2; i++) {
            temp = find(i);             
            removeNode((T)temp.data);
        }
    }
}
