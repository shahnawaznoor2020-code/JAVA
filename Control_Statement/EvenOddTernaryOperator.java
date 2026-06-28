package Control_Statement;

import java.util.Scanner;

public class EvenOddTernaryOperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a=sc.nextInt();
        System.out.println((a%2==0) ? a+" is even" : a+" is odd");
    }
}
