package Loops;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean flag=true;
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
            else
                flag=true;
        }
        if(n==1)
            System.out.println(n+" is neither Composite nor Prime");
        else if (flag==true)
            System.out.println(n+" is a Prime Number");
        else
            System.out.println(n+" is a Composite Number");
    }
}
