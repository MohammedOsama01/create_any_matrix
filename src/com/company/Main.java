package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" *** Q1 Array [][] ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Size Of Rows : ");
        int rows = scanner.nextInt();
        System.out.println("Please Enter Size Of Cols : ");
        int col = scanner.nextInt();

        int arr[][] = new int[rows][col];
        int min;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter tha value of rows [" + i + "]" + " Enter the value of columns : [" + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        // TODO : Display the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // TODO : the minimum value in the array
        min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        System.out.println("Minimum of array is : " + min);

        sumForEachRow(arr);
        sumOfEachCol(arr);

        int res[]=arrIndex(arr);
        System.out.println("["+res[0]+" , "+res[1]+" ]");
    }


    // TODO: Calculate and print the sum for each row in the 2D array.
    public static void sumForEachRow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            System.out.println("The Summation Of Rows [" + i + "]  " + sum);
            sum = 0;
        }
    }

    // TODO: Calculate and print the sum for each col in the 2D array.
    public static void sumOfEachCol(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("The Summation Of Columns [" + i + "]  " + sum);
            sum = 0;
        }
    }
    // TODO :take 2D array return the index of minimum elements 1D array
    public static int [] arrIndex (int arr [][]){
        int min=arr[0][0];
        int index []=new int[2];
        index[0]=0;
        index[1]=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]<min){
                    min=arr[i][j];
                    index[0]=i;
                    index[1]=j;
                }
            }
        }
        return index;
    }

}





