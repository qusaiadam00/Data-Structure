/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.List;

import java.util.Objects;

/**
 *
 * @author Qusai Almhmoudi
 */
public class DNode {

    private Student studentData;
    private DNode Next;
    private DNode Prev;

    public DNode() {
        this.Next = null;
        this.Prev = null;
    }

    public Student getStudentData() {
        return studentData;
    }

    public void setStudentData(Student studentData) {
        this.studentData = studentData;
    }

    public DNode(Student studentData) {
        this();
        this.studentData = studentData;

    }

    public DNode getNext() {
        return Next;
    }

    public void setNext(DNode Next) {
        this.Next = Next;
    }

    public DNode getPrev() {
        return Prev;
    }

    public void setPrev(DNode Prev) {
        this.Prev = Prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       sb.append(studentData);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DNode other = (DNode) obj;
        return Objects.equals(this.studentData, other.studentData);
    }
}
