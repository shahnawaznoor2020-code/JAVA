package Loops;

import java.util.Scanner;

public class ReverseOfANumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int r,rev=0,x=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev+" is the reverse of the number "+x);
    }
}
