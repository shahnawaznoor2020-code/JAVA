package Loops;

import java.util.Scanner;

public class AnyGeometricProgression
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n=sc.nextInt();
        System.out.print("Enter First number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second number: ");
        int b=sc.nextInt();
        int r=b/a;
        int c=a;
        for(int i=1;i<=n;i++)
        {
            c=c*r;
            System.out.print(c+" ");
        }
    }
}
