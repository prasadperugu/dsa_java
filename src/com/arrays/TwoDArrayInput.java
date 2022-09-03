package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        int[][] array2d = new int[3][3];
        Scanner input = new Scanner(System.in);
        //input
        for(int r=0;r<array2d.length;r++){
            //arrar2d[r].length gives the size at 0th position
            for(int c =0;c<array2d[r].length;c++){
                array2d[r][c] = input.nextInt();
            }

        }

        //output
        for(int r=0;r<array2d.length;r++){
            for(int c =0;c<array2d[r].length;c++){
                System.out.print(array2d[r][c]+" ");
//                System.out.println(Arrays.toString(array2d[r]));
            }
               System.out.println();

        }

//        System.out.print(Arrays.toString(array2d));
    }
}
