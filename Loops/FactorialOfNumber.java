package Loops;

import java.util.Scanner;

public class FactorialOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int factorial=1,x=n;
        while(n!=0)
        {
            factorial=factorial*n;
            n=n-1;
        }
        if (x==0)
            System.out.println("The factorial of "+x+" is  1");
        else
            System.out.println("The factorial of "+x+" is "+factorial);
    }
}
