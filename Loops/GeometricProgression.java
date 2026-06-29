package Loops;

import java.util.Scanner;

public class GeometricProgression
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int a=1,b=2;
        int r=b/a;
        for(int i=1;i<=n;i++)
        {
            a=a*r;
            System.out.print(a+" ");
        }
    }
}
