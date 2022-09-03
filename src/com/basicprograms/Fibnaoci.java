package com.basicprograms;

import java.util.Scanner;

public class Fibnaoci {
    public static void main(String[] args) {
        Scanner nth = new Scanner(System.in);
        int limt = nth.nextInt();
        int first = 0;
        int second = 1;
        for(int i =2;i<=limt;i++){
            int temp = second;
            second = first +  second;
            first = temp;

        }
        System.out.println(second);
    }
}
