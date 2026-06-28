package Control_Statement;

import java.util.Scanner;

public class Non_negative
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if (n>=0)
        {
            System.out.println("The Number "+n+" is an non-negative number");
        }

    }
}
