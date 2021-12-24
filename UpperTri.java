package com.company;

public class UpperTri {
    public static void main(String[] args)
    {
        int a[][] = {
                {1, 2, 3},
                {10, 11, 12},
                {5, 5, 5}
        };

        //Calculates number of rows and columns present in given matrix
        int rows = a.length;
        int cols = a[0].length;

        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else {
            //Performs required operation to convert given matrix into upper triangular matrix
            System.out.println("Upper triangular matrix: ");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(i > j)
                        System.out.print("0 ");
                    else
                        System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
