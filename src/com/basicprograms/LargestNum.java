package com.basicprograms;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        int a = n1.nextInt();
        int b = n2.nextInt();
        int c = n3.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);


    }
}
