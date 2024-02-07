package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    average(3, 5, 7);
    yearlySalary(2500);
    credit(20000, 60);

    }
    public static void average (int numberOne, int numberTwo, int numberThree) {
        int sum = (numberOne + numberTwo + numberThree) / 3;
        System.out.println(sum);
    }

    public static void yearlySalary(int salary) {

        int fullSalary = salary * 12;
        System.out.println(fullSalary);
    }

    public static void credit(int totalCredit, int months) {

        int monthlyPayment = totalCredit / months;
        double interest = (totalCredit * 0.07) + totalCredit;
        System.out.println(monthlyPayment);
        System.out.println(interest);

    }

}
