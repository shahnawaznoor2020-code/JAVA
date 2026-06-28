package Control_Statement;

import java.util.Scanner;

public class Absolut_value
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        if (n>=0)
            System.out.println("The absolut value of "+n+" is "+n);
        else
        {
            int abs = n * (-1);
            System.out.println("The absolut value of " + n + " is " + abs);
        }
        //if (n<0)  abs=-n
        //System.out.println("The absolut value of " + n + " is " + abs);
    }
}
