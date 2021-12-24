package com.company;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        String str = sc.nextLine();
        boolean flag = true;

        //Converts the given str into lowercase
        str = str.toLowerCase();

        //Iterate the str forward and backward, compare one character at a time
        //till middle of the str is reached
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str +" is not a palindrome");
    }
}
