package Pattern_Printing;

import java.util.Scanner;

public class SmallAlphabetrTriangleHorzontallyFlipped
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
