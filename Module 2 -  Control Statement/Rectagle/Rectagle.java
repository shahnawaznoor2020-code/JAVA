package Control_Statement;

import java.util.Scanner;

public class Rectagle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The length of Rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enter The breadth of rectangle: ");
        double breadth=sc.nextDouble();
        double perimeter=2*(length+breadth);
        double area=length*breadth;
        System.out.println("The perimeter of rectangle is: "+perimeter);
        System.out.println("The area of rectangle is: "+area);
        if (perimeter<area)
            System.out.println("The perimeter is less than the area of reactangle");
        else if (perimeter>area)
            System.out.println("The perimeter is greater than area of rectangle");
        else
            System.out.println("The perimeter is equal to area of rectangle");
    }
}
