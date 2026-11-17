package Basics;

import java.util.Scanner;

public class square_of_a_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The square of "+num+" is "+num*num);
    }
}
