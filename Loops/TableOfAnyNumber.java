package Loops;

import java.util.Scanner;

public class TableOfAnyNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
