package com.arrays;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr = {{10,5,0},{10,5,3},{3,35,5,5},{10,5}};
        for(int r=0;r< arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c] + " ");

            }
            System.out.println();
        }

    }
}
