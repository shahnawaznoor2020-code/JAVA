package Control_Statement;

import java.util.Scanner;

public class TernaryInVariable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a=sc.nextInt();
        int x= (a>0) ? 100 : 0;
        System.out.println(x);
    }
}
