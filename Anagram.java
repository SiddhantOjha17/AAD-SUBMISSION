package com.company;
import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST STRING : ");
        String str1=sc.nextLine();
        System.out.println("ENTER SECOND STRING : ");
        String str2=sc.nextLine();

        //Converting both the string to lower case.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Checking for the length of strings
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            //Converting both the arrays to character array
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            //Comparing both the arrays using in-built function equals ()
            if(Arrays.equals(s1, s2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
