package javaappc;

import java.util.Scanner;

public class Netpay {
    public void getPay(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Rate per Hour: ");
        int rate = input.nextInt();
        System.out.print("Hours Worked: ");
        int hours = input.nextInt();
        System.out.print("Enter total Deductions: ");
        int ded = input.nextInt();
        
        System.out.println("----------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("----------------------------");
        
        System.out.println("Date: August 14, 2024");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("\nTotal Gross: "+(rate*hours));
        System.out.println("Total Deductions: "+ded);
        System.out.println("-----------------------------");
        System.out.println("Net Pay: "+((rate*hours)-ded));
    }
}
