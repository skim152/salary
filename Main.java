/*
Name: Shinyeob Kim
Project 1
Date: Nov- 3 - 2017

Computes the salaries for a collection of employees of different types.
Consists of four classes.  

This Employee class contains employee's name and monthly salary,
which is specified in whole dollars.
*/

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        final int MAXEMP = 10; 

        Employee [] yr2014 = new Employee[MAXEMP]; 
        Employee [] yr2015 = new Employee[MAXEMP]; 

        Scanner file = new Scanner(new File("data.txt")); 

        int cnt2014 = 0; 
        int cnt2015 = 0;

        while(file.hasNext()) {
            int year = Integer.parseInt(file.next());
            String employeeType = file.next();
            String name = file.next();
            int monthlySalary = Integer.parseInt(file.next());
            Employee employee = null;

            switch (employeeType) { 
                case "Employee":
                    employee = new Employee(name, monthlySalary);
                    break;
                case "Salesman": 
                    int annualSales = Integer.parseInt(file.next());
                    employee = new Salesman(name, monthlySalary, annualSales);
                    break;
                case "Executive": 
                    int currentStockPrice = Integer.parseInt(file.next());
                    employee = new Executive(name, monthlySalary, currentStockPrice);
                    break;
            } 

            switch (year) { 
                case 2014:
                    yr2014[cnt2014++] = employee;
                    break;
                case 2015:
                    yr2015[cnt2015++] = employee;
                    break;
            } 
        } 

        
        display(2014, yr2014, cnt2014);
        display(2015, yr2015, cnt2015);

        
        file.close();

    } 
    private static void display(int year, Employee [] employees, int count) {

        int totalSalary = 0; 

        System.out.printf("\nInformation for %d Employees\n\n", year);
        for (int i = 0 ; i < count; i++)
        {
            Employee employee = employees[i];
            System.out.println(employee + " Annual Salary: " + employee.annualSalary());
            totalSalary += employee.annualSalary();
        }
        System.out.printf("\nAverage Annual Salary = %d\n\n", totalSalary/count);
    } 
} 