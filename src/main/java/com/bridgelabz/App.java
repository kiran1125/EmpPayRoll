package com.bridgelabz;

public class App {
    public static void main(String[] args) {
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        employeePayRollService.readData();
        employeePayRollService.writeData();
    }
}
