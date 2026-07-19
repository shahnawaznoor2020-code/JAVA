package Basics;

import java.util.Scanner;

public class Sum_of_numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3=sc.nextInt();
        int sum=num1+num2+num3;
        System.out.println("The sum of three numbers is: "+sum);
    }
}
