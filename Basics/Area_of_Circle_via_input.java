package Basics;

import java.util.Scanner;

public class Area_of_Circle_via_input
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double area=3.14159*radius*radius;
        System.out.println("Area of Circle is "+area);
    }
}
