package Loops;

import java.util.Scanner;

public class AnyArthematicProgression
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit of the Arithemetic Progression: ");
        int a=sc.nextInt();
        System.out.print("Enter the second digit of the Arithematic Progression: ");
        int b=sc.nextInt();
        System.out.print("Enter the Nth term: ");
        int n=sc.nextInt();
        int d=b-a;
        for (int i=a;i<=(a+(n-1)*d);i=i+d)
        {
            System.out.print(i+" ");
        }
    }
}
