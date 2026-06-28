package Control_Statement;

import java.util.Scanner;

public class GreatestOfThree
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if (a==b && b==c)
            System.out.println("All numbers are equal");
        else if (a==b)
        {
            if (a>c)
                System.out.println(a+" & "+b+" is greater than "+c);
            else
                System.out.println((c+" is the greatest number among the three"));
        }
        else if (a==c)
        {
            if (a>b)
                System.out.println(a+" &"+c+" is greater than "+b);
            else
                System.out.println(b+" is the greatest number among the three");
        }
        else if (b==c)
        {
            if (b>a)
                System.out.println(b+" & "+c+" is greater than "+a);
            else
                System.out.println(a+" is the greatest number among the three");
        }
        else if (a>b && a>c)
            System.out.println(a+"is the greatest number among the three");
        else if (b>a && b>c)
            System.out.println(b+"is the greatest number among the three");
        else if (c>a && c>b)
            System.out.println(c+"is the greatest number among the three");
    }
}