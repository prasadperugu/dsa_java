package com.basicprograms;

import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter your salary");
    int salary = input.nextInt();
        if(salary>10000){
        salary += 2000;
    }
        else{
        salary +=1000;
    }
        System.out.println(salary);

}
}
