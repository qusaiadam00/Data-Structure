/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.List;

import java.util.Scanner;

/**
 *
 * @author Qusai Almhmoudi
 */
public class SingleLinkedList {

    static Scanner sc = new Scanner(System.in);
    Node Head;

    public SingleLinkedList() {
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

    void addAfter(Node data, String after) {
        if (isEmpty()) {
            System.out.println("List is empty :( ");
            return;
        }
        Node result = find(after);
        if (result != null) {
            data.next = result.next;
            result.next = data;
            System.out.println("addition success :) ");
            return;
        }
        System.out.println("Element not fount");

    }

    void addAt(Node data, int indexPlace) {
        if (isEmpty()) {
            System.out.println("list is empty ");
            return;
        }
        if (!((getSize() + 1) >= indexPlace)) {
            System.out.println("Sorry ,Site exceeded !");
            return;
        }
        if (indexPlace == 1) {
            addFirst(data);
            return;
        }
        Node result = find(indexPlace);
        if (result != null) {

            data.next = result.next;
            result.next = data;
            System.out.println("addition success :) ");
            return;
        }
        System.out.println("list does not have values to reach the place you want !");
    }

    private Node find(String data) {
        Node current = Head;
        while (current != null) {
            if (current.data.equalsIgnoreCase(data)) {
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
            if (++index == posit) {
                break;
            }
            current = current.next;
        }

        return current;
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

    void display() {
        for (Node current = Head; current != null; current = current.next) {
            System.out.print("[" + current.data + "]--> ");
        }
        System.out.println();
    }
    
    public void removeNode(String item){
        if (isEmpty()) {
            System.out.println("Empty List :(");
           return ; 
        }
        Node result = find(item);
        if (result != null) {
            if (Head.data.equalsIgnoreCase(result.data)) {
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
            System.out.println("S orry the List is Empty :( ");
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
        current = Head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("The element " + current.next.data + " deleted success !");
        current.next = null;

    }

    void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("list is empty ");
            return;
        }
        if (index == 1) {
            removeFirst();
            return;
        }
        Node result = find(index - 1);
        System.out.println(result.data);
        if (result.next.next == null) {
            removeLast();
            return;
        }
        if (result.next.next != null) {
            result.next = result.next.next;
            System.out.println("remove successly :) ");
            return;
        }

        System.out.println("list does not have values to reach the place you want !");

    }
    
}
