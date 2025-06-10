package org.example;

public class Student {
    private int rollNo;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", lap=" + lap +
                '}';
    }

    private Laptop lap;

    public Student(int rollNo, String name, Laptop lap) {
        this.rollNo = rollNo;
        this.name = name;
        this.lap = lap;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }


}
