package Basics;

import java.util.Scanner;

public class Surface_Area_of_Cuboid
{
    public static void main(String args[])
    {
        double length=12,breadth=5,height=15;
        double surface_area=2*(length*breadth + length*height +breadth*height);
        System.out.println("Surface Area is "+surface_area);
    }
}
