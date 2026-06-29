package Loops;

import java.util.Scanner;

public class SequencePrinting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int x=n;
        for(int i=0;i<=n;i++)
        {
            x=n-i;
            System.out.print(i+" "+x+" ");
        }
    }
}
