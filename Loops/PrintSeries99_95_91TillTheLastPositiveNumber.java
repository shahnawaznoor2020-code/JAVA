package Loops;

public class PrintSeries99_95_91TillTheLastPositiveNumber
{
    public static void main(String args[])
    {
        int a=99,b=95;
        int d=a-b;
        for (int i=a;i>=0;i=i-d)
        {
            System.out.print(i+" ");
        }
    }
}
