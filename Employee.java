/*
Name: Shinyeob Kim
Project 1
Date: Nov- 3 - 2017

Computes the salaries for a collection of employees of different types.
Consists of four classes.  

This Employee class contains employee's name and monthly salary,
which is specified in whole dollars.
*/

public class Employee {

    private static final int months = 12;

    private String name;
    private int monthSalary = 0;

    /*
    . A constructor that allows the name and monthly salary to be initialized. 
    */
    public Employee(String name, int monthlySalary) {
        this.name = name;
        this.monthSalary = monthlySalary;
    } 

    /*
    A method named annualSalary that returns the salary for a whole year. 
    */
    
    public int annualSalary() {
        return monthSalary * months;
    } 

    /*
    A toString method that returns a string containing the name and monthly 
    salary, appropriately labeled. 
    */
    public String toString() {
        return "Name: " + name + " Monthly Salary: " + monthSalary;
    } 

} 