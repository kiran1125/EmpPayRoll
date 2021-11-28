package com.bridgelabz;

/**
 * This class is the data of the employee
 */
public class EmployeePayRoll {
    //Class level Attributes declaring them
    int id;
    String name;
    long salary;

    public EmployeePayRoll(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return ("id : " + id + " name : " + name + " salary : " + salary);
    }
}
