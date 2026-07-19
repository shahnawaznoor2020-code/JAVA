package Basics;

public class Type_CAsting
{
    static void main(String[] args)
    {
        //Type Casting
        char ch='a';
        char ch2='A';
        char ch3='0';
        System.out.println(ch+""+ch2+""+ch3);
        int x=ch; //Implicit Type Casting
        System.out.println(x);
        int y=(int)ch2;
        System.out.println(y);
        int z=(int)ch3;
        System.out.println(z);
        System.out.println(ch+0);

        //Integer to character
        int a=8;
        char ch4=(char)a;
        System.out.println(ch4);
    }
}
