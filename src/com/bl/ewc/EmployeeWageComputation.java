package com.bl.ewc;

public class EmployeeWageComputation {
    public static final int Working_Days = 20;
    public static final int Working_Hours = 100;

    public static void main(String args[]) {
        int wageperhour = 20, wage = 0;
        int hours = 0, totalhours = 0, total = 0;

        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //Calculating the Wage for working days and Total Working hours
        while (totalhours<Working_Hours) {
            //Calculating the Wage for working days
            for (int i = 0; i < Working_Days; i++) {
                //checking the Employee Presence
                int rand = (int) Math.floor(Math.random() * 10) % 3;

                //Solving with Switch Case Statement
                switch (rand) {
                    case 1:
                        System.out.println("Employee is Present");
                        hours = 8;
                        break;
                    case 2:
                        //Adding partTime
                        System.out.println("Employee is PartTime");
                        hours = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                        break;
                }
                wage = wageperhour * hours;
                total += wage;
                totalhours += hours;

            }
            System.out.println("wage is:" + wage + "\ntotal hours" + totalhours + "\ntotal wage:" + total);
        }
    }
}
