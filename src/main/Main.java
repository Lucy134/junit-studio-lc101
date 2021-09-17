package main;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to test for bracket balance: ");
        String test = scanner.next();
        if(BalancedBrackets.hasBalancedBrackets(test)){
            System.out.println("Brackets are balanced");
        }
        else System.out.println("Imbalanced brackets");
        scanner.close();

    }
}
