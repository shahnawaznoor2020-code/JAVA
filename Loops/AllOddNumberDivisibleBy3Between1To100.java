package Loops;

public class AllOddNumberDivisibleBy3Between1To100
{
    public static void main(String args[])
    {
        for(int i=3;i<=100;i=i+3)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
