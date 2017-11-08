/*
Name: Shinyeob Kim
Project 1
Date: Nov- 3 - 2017

Computes the salaries for a collection of employees of different types.
Consists of four classes.  

This Employee class contains employee's name and monthly salary,
which is specified in whole dollars.
*/

public class Salesman extends Employee {
   /*
    A constructor that allows the name, monthly salary and 
    annual sales to be initialized. 
    */
    private final double rate = .02;
    private final int maxComm = 20000;  
    
    /*
    The commission is computed as 2% of that salesman's annual sales.
    The maximum commission a salesman can earn is $20,000. 
    */
    

    private int annualSales = 0;

    public Salesman(String name, int monthlySalary, int annualSales) {
        super(name, monthlySalary);
        this.annualSales = annualSales;
    } // end constructor

    @Override
    public int annualSalary() {
        
        if (annualSales * rate < maxComm) {
            return (int)(annualSales * rate + super.annualSalary());
        } 
        else {
            return super.annualSalary() + maxComm;
        } 
    } 

    @Override
    
    /*
    An overridden toString method that returns a string containing the name, 
    monthly salary and annual sales, appropriately labeled. 
    */
       public String toString() {
        return super.toString() + " Annual Sales: " + annualSales;
    } 
} // end class