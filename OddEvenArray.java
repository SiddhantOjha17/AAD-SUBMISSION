package com.company;
import java.util.*;
public class OddEvenArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            arr[i]=sc.nextInt();
        }
        System.out.println("Odd Numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
