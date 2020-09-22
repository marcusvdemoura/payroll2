package com.company;

import java.util.Scanner;

public class Main {

    public static void employees (String name, int social_Number, String employee_Type){
        Scanner kb = new Scanner(System.in);
        double overtime_Salary = 0;
        double total_Salary = 0;

        if (employee_Type.equalsIgnoreCase("hourly")){

            System.out.println ("What is the hour rate for this employee?");
            double hour_Rate = kb.nextDouble();
            System.out.println ("How many hours worked this month?");
            int hours_Worked = kb.nextInt();
            if (hours_Worked > 40){
                int overtime = hours_Worked - 40;
                overtime_Salary = overtime * (hour_Rate+(hour_Rate/2));
            }
            total_Salary = ((40*hour_Rate) + overtime_Salary)*1.1;
            System.out.println("Employee = "+name+ "/nSocial Number = "+social_Number+"/nSalary = " + total_Salary);
        }

        if (employee_Type.equalsIgnoreCase("commission")) {

            System.out.println("What is the percentage the employee gets paid of their sales?");
            int percentage = kb.nextInt();
            percentage/=100;
            System.out.println("What is the total of the sales in this month?");
            double totalSales = kb.nextDouble();

            total_Salary = (totalSales * percentage) * 1.1;
            System.out.println("Employee = "+name+ "/nSocial Number = "+social_Number+"/nSalary = " + total_Salary);

        }

        if (employee_Type.equalsIgnoreCase("monthly")) {
            System.out.println("What is the employee monthly salary?");
            double monthlySalary = kb.nextDouble();
            System.out.println("Employee = "+name+ "/nSocial Number = "+social_Number+"/nSalary = " + monthlySalary);

        }


    }


    public static void main(String[] args) {

        employees("Marcus", 0000000000, "hourly");






    }
}
