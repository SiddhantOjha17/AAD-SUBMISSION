package com.company;
import java.util.*;
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int num = sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            int rem = num%10;
            rev= rev*10 +rem;
            num/=10;

        }
        System.out.println("THE NUMBER REVERSED IS : "+rev);
    }
}
