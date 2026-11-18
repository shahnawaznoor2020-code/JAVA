package Control_Statement;

import java.util.Scanner;

public class Profit_Loss_percentage
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
            double p_percent=(p/cp)*100;
            System.out.println("The Product made a profit of "+p);
            System.out.println("The Profit Percent is "+p_percent+"%");
        }
        else if (cp>sp)
        {
            double l=cp-sp;
            double l_percent=(l/cp)*100;
            System.out.println("the Product made a Loss of "+l);
            System.out.println("The Loss Percent is "+l_percent+"%");
        }
        else
        {
            System.out.println("The Product made no profit or loss");
        }
    }
}
