package Control_Statement;

import java.util.Scanner;

public class Quadrant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the X coordinate: ");
        int x=sc.nextInt();
        System.out.print("Enter the Y coordinate: ");
        int y=sc.nextInt();
        if (x>0 && y>0)
            System.out.println("("+x+","+y+") lies in the First Quadrant");
        else if (x<0 && y>0)
            System.out.println("("+x+","+y+") lies in the Second Quadrant");
        else if (x<0 && y<0)
            System.out.println("("+x+","+y+") lies in the Third Quadrant");
        else if (x>0 && y<0)
            System.out.println("("+x+","+y+") lies in the Fourth Quadrant");
        else if (x!=0 && y==0)
            System.out.println("("+x+","+y+") lies in the X Axis");
        else if (x==0 && y!=0)
            System.out.println("("+x+","+y+") lies in the Y Axis");
        else if (x==0 && y==0)
            System.out.println("("+x+","+y+") lies in the Origin");
    }
}
