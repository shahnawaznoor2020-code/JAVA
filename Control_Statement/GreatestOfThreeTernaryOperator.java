package Control_Statement;

import java.util.Scanner;

public class GreatestOfThreeTernaryOperator
{
    static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter first number: ");
     int a = sc.nextInt();
     System.out.print("Enter second number: ");
     int b = sc.nextInt();
     System.out.print("Enter third number: ");
     int c = sc.nextInt();
     System.out.println((a>=b) ? (a>=c) ? a+" is the greatest" : c+" is the greatest" : (b>c) ? b+" is the greatest" : c+" is the greatest");
    }
}
