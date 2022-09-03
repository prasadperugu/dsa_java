package com.basicprograms;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();
        String department = in.next();
        switch (fruit) {
            case "mango":
                switch (department){
                    case "IT":{
                        System.out.println("cse student he is");
                    }
                }

                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("good for health");
                break;
            default:
                System.out.println("this is me");
                break;
        }
    }
}
