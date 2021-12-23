package com.company;
import java.util.*;//IMPORTING UTIL PACKAGE
public class Neon {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int num = sc.nextInt();
        int sq = num*num;
        int sum=0;
        while (sq!=0)
        {
            int digit = sq %10;
            sum = sum +digit;
            sq=sq/10;
        }
        if (num == sum)
        {
            System.out.println(num +" is a Neon Number");
        }
        else
        {
            System.out.println(num +" is not a Neon Number");

        }
    }
}
