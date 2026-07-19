package Basics;

public class Urany_operator
{
    public static void main(String []args)
    {
        int a=10;
        int x=20;
        System.out.println(x+"x");
        System.out.println(x+++"x++");   //Post increment -- phele use phir increase
        System.out.println(x+"x");
        System.out.println(++x+"++x");   //Pre increment -- phele increase phir use
        System.out.println(x+"x");
        System.out.println(a);
        a++;
        System.out.println(a);
        a+=567;
        System.out.println(a);
        System.out.println(x);

        int y=20;
        System.out.println(y+"y");
        System.out.println(y--+"y--");   //Post decrement -- phele use phir increase
        System.out.println(y+"y");
        System.out.println(--y+"--y");   //Pre decrement -- phele increase phir use
        System.out.println(x+"y");
    }
}
