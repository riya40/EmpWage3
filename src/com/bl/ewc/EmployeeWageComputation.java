package com.bl.ewc;

public class EmployeeWageComputation {
    public static void main(String args[]){

        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        int rand = (int) Math.floor(Math.random() * 10) % 3;

        if(rand==0){
            System.out.println("Employee absent");
        }
        else {
            System.out.println("employee present");
            
        }

    }
}
