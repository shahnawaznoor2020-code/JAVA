package Control_Statement;

import java.util.Scanner;

public class Integer_checking
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n=sc.nextDouble();
        int x=(int)n;
        if (n-x >0)
        {
            System.out.println("The number "+n+" is not an integer");
        }
        else
        {
            System.out.println("The number "+n+" is an integer");
        }
    }
}
