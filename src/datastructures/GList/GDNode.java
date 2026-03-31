/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

/**
 *
 * @author mohammed khaled 
 */
public class GDNode<T> {
    
   private Student studentData;
   private GDNode Next;
   private GDNode Prev;

    public GDNode() {
        this.studentData = null;
        this.Next = null;
        this.Prev = null;
    }

    public GDNode(Student studentData) {
        this.studentData = studentData;
        this.Next = null;
        this.Prev = null;
    }

    public Student getData() {
        return studentData;
    }

    public void setData(Student studentData) {
        this.studentData = studentData;
    }

    public  GDNode getNext() {
        return Next;
    }

    public void setNext( GDNode Next) {
        this.Next = Next;
    }

    public  GDNode getPrev() {
        return Prev;
    }

    public void setPrev( GDNode Prev) {
        this.Prev = Prev;
    }

    @Override
    public String toString() {
        return studentData.toString();
    }
}
