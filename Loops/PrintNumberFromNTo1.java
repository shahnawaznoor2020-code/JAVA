package Loops;

import java.util.Scanner;

public class PrintNumberFromNTo1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number less than 1: ");
        int n=sc.nextInt();
        for (int i=n;i<=1;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for (int i=1;i>=n;i--)
        {
            System.out.print(i+" ");
        }
    }
}
