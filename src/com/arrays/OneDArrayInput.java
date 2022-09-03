package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            System.out.println("enter the values for array");
            arr[i] = input.nextInt();
        }
        System.out.print(Arrays.toString(arr));


    }
}
