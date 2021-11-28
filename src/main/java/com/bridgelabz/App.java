package com.bridgelabz;

public class App {
    public static void main(String[] args) {
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        EmployeePayRoll employeePayRoll = new EmployeePayRoll(1,"kiran",10000);
        EmployeePayRoll employeePayRoll1 = new EmployeePayRoll(2,"kiran2",100000);

        employeePayRollService.storeDataInToFile(employeePayRoll);
        employeePayRollService.storeDataInToFile(employeePayRoll1);

    }
}
