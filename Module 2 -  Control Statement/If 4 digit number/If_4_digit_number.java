package Control_Statement;

import java.util.Scanner;

public class If_4_digit_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n=sc.nextInt();
        if (n>999 && n<10000)
            System.out.println(n+" is a four digit number");
        else
            System.out.println(n+" is not a four digit number");
    }
}
