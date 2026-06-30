package Loops;

import java.util.Scanner;

public class SumAndReverseOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r=0,sum=0,rev=0,x=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("The sum of the digits of "+x+" is "+((sum>0) ? sum:- sum));
        System.out.println("The Reverse of "+x+" is "+rev);
    }
}
