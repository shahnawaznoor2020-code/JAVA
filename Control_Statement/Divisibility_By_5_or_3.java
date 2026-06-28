package Control_Statement;

import java.util.Scanner;

public class Divisibility_By_5_or_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if (n%5==0 && n%3==0)
            System.out.println(n+" is divisible by 5 and 3 both");
        else if (n%3==0)
            System.out.println(n+" is divisible by 3");
        else if (n%5==0)
            System.out.println(n+" is divisible by 5");
        else
            System.out.println(n+" is not divisible by 5 and 3 both");
    }
}
