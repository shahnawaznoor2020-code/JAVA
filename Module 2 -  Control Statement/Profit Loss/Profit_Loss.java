package Control_Statement;

import java.util.Scanner;

public class Profit_Loss
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Cost price: ");
        double cp=sc.nextDouble();
        System.out.print("Enter the Selling price: ");
        double sp=sc.nextDouble();
        if (cp<sp)
        {
            double p=sp-cp;
            System.out.println("The Product made a profit of "+p);
        }
        else if (cp>sp)
        {
            double l=cp-sp;
            System.out.println("the Product made a Loss of "+l);
        }
        else
        {
            System.out.println("The Product made no profit or loss");
        }
    }
}
