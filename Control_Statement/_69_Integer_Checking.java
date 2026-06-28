package Control_Statement;

import java.util.Scanner;

public class _69_Integer_Checking
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n=sc.nextInt();
        if (n<69 && -n<69)
            System.out.println("The magnitude of "+n+" is less than 69");
        else if (n==69 && -n==69)
            System.out.println("The magnitude of "+n+" is equal to 69");
        else
            System.out.println("The magnitude of "+n+" is greater than 69");
    }
}
