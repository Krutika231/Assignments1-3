package Assignment1;

import java.util.Scanner;

public class Employee {
    private int no_of_hrs_per_day;
    private int hourly_salary;
    private double base_salary;
    private String employeeName;

    public void getInfo(String employeeName,int hourly_salary,int no_of_hrs_per_day){
        this.employeeName=employeeName;
        this.hourly_salary=hourly_salary;
        this.no_of_hrs_per_day=no_of_hrs_per_day;
        System.out.println(" Hourly salary is " + hourly_salary +" and "+ " No of hours per day  "+no_of_hrs_per_day);
    }
    double computeBaseSalary(){
        base_salary=hourly_salary*no_of_hrs_per_day*20;
        System.out.println("Base Salary :"+base_salary);
        return base_salary;
    }
    double addSal(double base_salary){
        if(this.base_salary<500){
            base_salary+=10;
            System.out.println("Base salary updated with $10 " + base_salary);
        }
        return base_salary;
    }
    double addWork(double no_of_hrs_per_day){
        if(no_of_hrs_per_day>6){
            base_salary=base_salary+5;
            System.out.println("Daily $5 added for Extra Work " +base_salary);
        }
        return base_salary;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String employeeName;
        int hourly_salary,no_of_hrs_per_day;
        Employee employee=new Employee();
        System.out.print("Enter Name");
        employeeName=s.toString();
        System.out.print("Hourly Salary");
        hourly_salary = s.nextInt();
        System.out.print("Enter no of hours of work per day of Employee");
        no_of_hrs_per_day = s.nextInt();
        employee.getInfo(employeeName,hourly_salary,no_of_hrs_per_day);
        double r=employee.computeBaseSalary();
        double sal=employee.addSal(r);
        employee.addWork(no_of_hrs_per_day);
    }
}
