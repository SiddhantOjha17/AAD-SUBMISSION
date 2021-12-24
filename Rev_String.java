package com.company;
import java.util.*;
public class Rev_String
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING : ");
        String string = sc.nextLine();
        //Stores the reverse of given string
        String reversedStr = "";
        int n=string.length();
        //Iterate through the string from last and add each character to variable reversedStr
        for(int i = n-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }
        System.out.println("Reverse of given string : " + reversedStr);
    }
}