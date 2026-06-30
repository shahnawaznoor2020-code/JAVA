package Loops;

import java.util.Scanner;

public class ARaisedToPowerToB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        int power=1;
        for(int b=1;b<=exponent;b++)
        {
            power=power*base;
        }
        System.out.println(power+" is "+base+" raised to the power of "+exponent);
    }
}
