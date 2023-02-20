package com.review;
import java.util.Scanner;
public class NumberSwap
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Entered numbers are a:-"+a+"     b:-"+b);

        NumberSwap n=new NumberSwap();
        n.swap(a,b);
    }
    void swap(int a,int b)
    {
        System.out.println("Swapped numbers are :-");

        System.out.println("Number a is :-"+b);
        System.out.println("Number b is :-"+a);

    }
}
