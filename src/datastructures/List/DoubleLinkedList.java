/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.List;

/**
 *
 * @author mohameed khaled
 *
 */
public class DoubleLinkedList {

    private DNode Head, Tail;

    public DoubleLinkedList() {
        this.Head = null;
        this.Tail = null;

    }

    boolean isEmpty() {
        return (Head == null && Tail == null);
    }

    void addFirst(DNode node) {
        if (isEmpty()) {
            this.Head = this.Tail = node;
            return;
        }
        node.setNext(Head);
        Head.setPrev(node);
        Head = node;
    }

    public void addLast(DNode node) {
        if (isEmpty()) {
            this.Head = this.Tail = node;
            return;

        }
        Tail.setNext(node);
        node.setPrev(Tail);
        Tail = node;
    }

    public void addAfter(DNode node, long after) {
        if (isEmpty()) {
            //Maseege 
            return;
        }
        DNode curr = find(after);
        if (curr != null) {
            node.setNext(curr.getNext());
            node.setPrev(curr);
            node.getNext().setPrev(node);
            curr.setNext(node);
            return;
        }
        System.out.println("The Element is not found :( ");
    }

    public void addBefor(DNode node, long befor) {
        if (isEmpty()) {
            //Maseege 
            return;
        }
        DNode curr = find(befor);
        if (curr != null) {
            node.setNext(curr);
            node.setPrev(curr.getPrev());
            curr.setPrev(node);
            node.getPrev().setNext(node);
            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    int getSize() {
        if (isEmpty()) {
            //.....
            return 0;
        }
        DNode curr = Head;
        int size = 0;
        while (curr != null) {
            ++size;
            curr = curr.getNext();
        }
        return size;
    }

    public void addAt(DNode node, int post) {
        if (isEmpty()) {
            //.....
            return;
        }
        if (!((getSize() + 1) >= post)) {
            System.out.println("Sorry ,Site exceeded !");
            return;
        }
        if (post == 1) {
            addFirst(node);
            return;
        }
        DNode curr = find(post-1);
       if (curr != null) {
            node.setNext(curr.getNext());
            node.setPrev(curr);
            node.getNext().setPrev(node);
            curr.setNext(node);
            return;
        }
        System.out.println("position OutOfBoundList :( ");
    }

    private DNode find(long id) {
        DNode current = Head;
        for (; current != null; current = current.getNext()) {
            if (current.getStudentData().getID() == id) {
                break;
            }
        }
        return current;
    }

    private DNode find(int post) {
        DNode current = Head;
        boolean flage = false;
        int counter = 0;
        for (; current != null; current = current.getNext()) {
            counter++;
            if ((counter) == post) {
                flage = true;
                break;
            }
        }
        return flage == true ? current : null;
    }

    private void removeHead() {
        if (isEmpty()) {
            //......
            return;
        }
        Head.getNext().setPrev(null);
        Head = Head.getNext();

    }

    public void deleteItemPos(String leter){
        if (isEmpty()) {
           //....
           return ;
        }
        DNode temp = Head;
        while (temp != null) {
            if (temp.getStudentData().getName().toString().startsWith("O")) {
                removeNode(temp.getStudentData().getID());
            }
            temp = temp.getNext();
        }
    }
    private void removeTail() {
        DNode curr = Head;
        while (curr.getNext() != Tail) {
            curr = curr.getNext();
        }
        curr.setNext(null);
        Tail = curr;
    }

    public void removeNode(long id) {
        if (isEmpty()) {
            //......
            return;
        }
        DNode curr = find(id);
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

    public void removeAfter(long data) {
        if (isEmpty()) {
            //....
            return;
        }
        DNode curr = find(data);
        if (curr != null) {
            curr.getNext().getNext().setPrev(curr);
            curr.setNext(curr.getNext().getNext());

            return;
        }
        System.out.println("Empty List || Element not found :( ");
    }

    public void removeBefor(long data) {
        if (isEmpty()) {
            //....
            return;
        }
        DNode curr = find(data);
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

    public void removeAt(long post) {
        if (isEmpty()) {
            //Maseege ......
            return;
        }
        if (post == 1) {
            removeHead();
            return;
        }
        DNode curr = find(post);
        if (Tail == curr.getNext()) {
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

    public void display() {
        for (DNode curr = Head; curr != null; curr = curr.getNext()) {
            System.out.print(curr.toString());
        }
        System.out.println("");
    }

}
