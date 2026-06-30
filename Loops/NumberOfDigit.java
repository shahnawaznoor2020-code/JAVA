package Loops;

import java.util.Scanner;

public class NumberOfDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        if(num==0)
            num=1;
        int c=0;
        while(num!=0)
        {
            num=num/10;
            c++;
        }
        System.out.println("The number of digits are "+c);
    }
}
