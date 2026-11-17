package Basics;

import java.util.Scanner;

public class Simple_interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal=sc.nextDouble();
        System.out.print("Enter the Time period: ");
        double time=sc.nextDouble();
        System.out.print("Enter Rate of Interest in p.a.: ");
        double rate=sc.nextDouble();
        double si=(principal*time*rate)/100;
        double amount=principal+si;
        System.out.println("The Simple Interest is: "+si);
        System.out.println("The total amount is: "+amount);
    }
}
