package com.company;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        int t=n;
        int x=n;
        int arm=0;
        int rem;
        int len=0;
        int mul=1;

        while(t>0)
        {
            t=t/10;
            len++;
        }
        while(x>0)
        {
            rem=x%10;
            for(int i=1;i<=len;i++)
            {
                mul = mul*rem;
            }
            arm = arm+mul;
            x=x/10;
            mul=1;
        }
        if(arm==n)
        {
            System.out.println(arm+" IS AN ARMSTRONG NUMBER !!");
        }
        else
        {
            System.out.println(arm+" IS NOT AN ARMSTRONG NUMBER");
        }
    }
}