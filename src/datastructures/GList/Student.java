/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.GList;

import java.util.Arrays;
 import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Qusai Almhmoudi
 */
enum DEPARTMENTS {
    SE,
    IT,
    COM,
    AIDS,
    CNC,
    MRE,
    IMSE,
    RE
}

enum LEVELS {
    LEVEL_ONE,
    LEVEL_TWo,
    LEVEL_THREE,
    LEVEL_FOUR,
    LEVEL_FIVE
}

public class Student {

    private String name;
    private long ID;
    private double average;
    private DEPARTMENTS dept;
    private LEVELS level;
    Scanner sc = new Scanner(System.in);
    public Student() {
        readStudent();
        this.ID = System.currentTimeMillis();
         
    }

    public Student(String name, long ID, double average, DEPARTMENTS dept, LEVELS level) {
        this.name = name;
        this.ID = ID;
        this.average = average;
        this.dept = dept;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public DEPARTMENTS getDept() {
        return dept;
    }
    
    public void setDept(DEPARTMENTS dept) {
        this.dept = dept;
    }

    public LEVELS getLevel() {
        return level;
    }

    public void setLevel(LEVELS level) {
        this.level = level;
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public Student(String name, double average) {
        this(name);
        this.average = average;
    }

    @Override
    public String toString() {
        return "\t<< Student>> " + "\nname= " + name + "\nID = " + ID + "\naverage = " + average + "\ndepartment = " + dept + "\nlevel = " + level +"\n-------------------\n\n";
    }

       @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.average) ^ (Double.doubleToLongBits(this.average) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.dept);
        hash = 59 * hash + Objects.hashCode(this.level);
        return hash;
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
        final Student other = (Student) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (Double.doubleToLongBits(this.average) != Double.doubleToLongBits(other.average)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.dept != other.dept) {
            return false;
        }
        return this.level == other.level;
    }
   private void readStudent() {
         System.out.print("Enter Student Name : ");
        setName(sc.nextLine());
//        System.out.println("Departments = " + Arrays.toString(DEPARTMENTS.values()));
//        System.out.print("Enter Student Department : ");
//        setDept(DEPARTMENTS.valueOf(sc.next().toUpperCase()));
//        System.out.println("Levels = " + Arrays.toString(LEVELS.values()));
//        System.out.print("Enter Student Level : ");
//        setLevel(LEVELS.valueOf(sc.next().toUpperCase().trim()));
//        System.out.println("Enter avrag of student");
//        setAverage(sc.nextDouble());
//        sc.nextLine();
    }
       
}
