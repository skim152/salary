/*
Name: Shinyeob Kim
Project 1
Date: Nov- 3 - 2017

The second subclass is Executive. It has an additional instance variable that 
reflects the current stock price. 
*/

public class Executive extends Employee {

    private final int BONUS = 30_000;
    private final int STOCKLIMIT = 50;

    private int currentStockPrice = 0;

    public Executive(String name, int monthlySalary, int currentStockPrice) {
        super(name, monthlySalary);
        this.currentStockPrice = currentStockPrice;
    } // end constructor

    @Override
    public int annualSalary() {
        // if the current stock price is over threshold, salary is base + bonus
        // otherwise the salary is just the base

        if (currentStockPrice > STOCKLIMIT) {
            return super.annualSalary() + BONUS;
        } // end if
        else {
            return super.annualSalary();
        } // end else
    } //end annualSalary

    @Override
    public String toString() {
        return super.toString() + "The Current Stock Price is: " + currentStockPrice;
    } // end toString

} // end class