package Control_Statement;

import java.util.Scanner;

public class divisibility_by_3_or_5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        if (n%3==0 || n%5==0)
            System.out.println(n+" is either divisible by 3 or by 5");
        else
            System.out.println(n+" is not nither divisible by 3 nor by 5");
    }
}
