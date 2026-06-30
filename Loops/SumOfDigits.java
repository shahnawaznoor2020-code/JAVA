package Loops;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r,sum=0,x=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("The sum of the digits of "+x+" is "+((sum>0) ? sum: -sum));
    }
}
