package Loops;

import java.util.Scanner;

public class FactorsOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Factors Of "+n+" are: ");
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(i==n/i)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.print(i+" ");
                    System.out.println(n/i);
                }
            }
        }
    }
}
