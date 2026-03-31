/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import datastructures.ArrayG.ArrayG2D;

/**
 *
 * @author mohammed khaled
 */
public class GDoubleLikedList<T> {

    private GDNode Head, Tail;

    public GDoubleLikedList() {
        this.Head = null;
        this.Tail = null;
    }

    boolean isEnpty() {
        return (Head == null && Tail == null);
    }

    void addFirst(GDNode node) {
        if (isEnpty()) {
            this.Head = this.Tail = node;
            return;
        }
        node.setNext(Head);
        Head.setPrev(node);
        Head = node;
    }

    public void addLast(GDNode node) {
        if (isEnpty()) {
            this.Head = this.Tail = node;
            return;

        }
        Tail.setNext(node);
        node.setPrev(Tail);
        Tail = node;
    }

    public GDNode find(long id) {
        GDNode current = Head;
        for (; current != null; current = current.getNext()) {
            if (current.getData().getID() == id) {
                break;
            }
        }
        return current;
    }

    public void addAfter(GDNode node, long idAfter) {
        if (isEnpty()) {
            //Maseege 
            return;
        }
        GDNode curr = find(idAfter);
        if (curr != null) {
            node.setNext(curr.getNext());
            node.setPrev(curr);
            node.getNext().setPrev(node);
            curr.setNext(node);
            return;
        }
        System.out.println("The Element is not found :( ");
    }

    public void addBefor(GDNode node, long idBefor) {
        if (isEnpty()) {
            //Maseege 
            return;
        }
        GDNode curr = find(idBefor);
        if (curr != null) {
            node.setNext(curr);
            node.setPrev(curr.getPrev());
            curr.setPrev(node);
            node.getPrev().setNext(node);
            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    public void removeTail() {
        GDNode curr = Head;
        while (curr.getNext() != Tail) {
            curr = curr.getNext();
        }
        curr.setNext(null);
        Tail = curr;
    }

    public void removeNode(long id) {
        if (isEnpty()) {
            //......
            return;
        }
        GDNode curr = find(id);
        if (Tail == curr) {
            removeTail();
            return;
        }
        if (Head == curr) {
            removeHead();
            return;
        }

        if (curr != null) {
            curr.getNext().setPrev(curr.getPrev());
            curr.getPrev().setNext(curr.getNext());
            curr.setNext(null);
            curr.setPrev(null);
            return;
        }
        System.out.println("Not found || empty list :( ");
    }

    public GDNode find(int post) {
        GDNode current = Head;
        boolean flage = false;
        int counter = 0;
        for (; current != null; current = current.getNext()) {
            counter++;
            if ((counter + 1) == post) {
                flage = true;
                break;
            }
        }
        return flage == true ? current : null;
    }

    public void addAt(GDNode node, int post) {
        if (isEnpty()) {
            //.....
            return;
        }
        if (post == 1) {
            addFirst(node);
            return;
        }

        GDNode curr = find(post);
        if (Tail == curr) {
            addLast(node);
            return;
        }
        if (curr != null) {
            node.setNext(curr.getNext());
            node.setPrev(curr);
            node.getNext().setPrev(node);
            curr.setNext(node);
            return;
        }
        System.out.println("position OutOfBoundList :( ");
    }

    public void removeHead() {
        if (isEnpty()) {
            //......
            return;
        }
//        Head.getNext().setPrev(null);
        Head = Head.getNext();

    }

    public void removeAfter(long ID) {
        if (isEnpty()) {
            //....
            return;
        }
        GDNode curr = find(ID);
        if (curr.getNext().getNext() == null) {
            removeTail();
            return;
        }
        if (curr != null) {
            curr.getNext().getNext().setPrev(curr);
            curr.setNext(curr.getNext().getNext());

            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    public void removeBefor(long ID) {
        if (isEnpty()) {
            //....
            return;
        }
        GDNode curr = find(ID);
        if (curr == Head) {
            removeHead();
        }
        if (curr != null) {
            curr.getPrev().getPrev().setNext(curr);
            curr.setPrev(curr.getPrev().getPrev());
            curr.getNext().setNext(null);
            curr.getNext().setPrev(null);
            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    public void removeAt(int post) {
        if (isEnpty()) {
            //Maseege ......
            return;
        }
        if (post == 1) {
            removeHead();
            return;
        }
        GDNode curr = find(post);
        if (Tail == curr.getNext()) {
            removeTail();
            return;
        }
        System.out.println(curr.getData());
        if (curr != null) {
            curr.getNext().getNext().setPrev(curr);
            curr.setNext(curr.getNext().getNext());
            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    int getSize() {
        if (isEnpty()) {
            //......
            return 0;
        }
        GDNode curr = Head;
        int counter = 0;
        while (curr != null) {
            counter++;
            curr = curr.getNext();
        }
        return counter;
    }

    public void convertDLLToArray2D() {
        int size = getSize();
        if (size == 0) {
            //....
            return;
        }
        ArrayG2D array = new ArrayG2D(size);
        GDNode temp = Head;
        while (temp != null) {
            array.insert(temp.getData());
            temp = temp.getNext();
        }
        System.out.println("## Data in Array2D ##");
        array.display();
    }

    public void display() {
        if (isEnpty()) {
            System.out.println("List is Empty :(");
            return;
        }
        for (GDNode curr = Head; curr != null; curr = curr.getNext()) {
            System.out.print(curr.getData().toString());
        }
        System.out.println("");
    }

}
