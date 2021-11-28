package com.bridgelabz;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class is for Employee payRoll service to get the exact details of the Employee salary etc.
 * @author Kiran
 * @dated : 28-11-2021
 */
public class EmployeePayRollService {
    List<EmployeePayRoll> employeePayRollList = new ArrayList<>();
    //Scanner class to read the data from the console
    Scanner consoleReader = new Scanner(System.in);
    public void readData(){
        //Print the statement to enter the id of the Employee
        System.out.println("Enter the id of the Employee");
        //Taking the input from user and storing it in id
        int id = consoleReader.nextInt();
        //Print to enter the name
        System.out.println("Enter the Name");
        //storing the input in the name
        String name = consoleReader.next();
        //print statement
        System.out.println("Enter the salary");
        //storing it in salary variable
        long salary = consoleReader.nextLong();
        //instantiation of EmployeePayRoll
        EmployeePayRoll employeePayRoll = new EmployeePayRoll(id,name,salary);
        //Adding it to the List
        employeePayRollList.add(employeePayRoll);
    }
    public void writeData(){
        System.out.println("Console writing : " + employeePayRollList.toString());
    }
    public void storeDataInToFile(EmployeePayRoll employeePayRoll){
        File file = new File("E:\\JAVA\\java.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(employeePayRoll);
            System.out.println("Success!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
