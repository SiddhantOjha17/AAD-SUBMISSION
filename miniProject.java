package com.company;
import java.util.*;//IMPORTING UTIL PACKAGE
import java.lang.*;//IMPORTING LANG PACKAGE
public class miniProject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int guess =0;
        int max=100;
        int min = 1;

        double rand = Math.random()*100;
        int num = (int)rand;
        System.out.println("THE NUMBER IS "+num);
        System.out.println("ENTER YOU NUMBER : ");
        while (true)
        {
            guess = sc.nextInt();
            if (guess<0)
            {
                System.out.println("INVALID INPUT");
                break;
            }
            else if (guess>num )
            {
                System.out.println("TOO LARGE");
            }
            else if(guess<num)
            {
                System.out.println("TOO SMALL");
            }
            else if( guess == num)
            {
                System.out.println("YOU WIN!!!");
                break;
            }
            else
            {
                System.out.println("INVALID INPUT");
                break;
            }
        }
    }


}