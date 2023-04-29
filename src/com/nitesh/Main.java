package com.nitesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        final String age = scanner.nextLine();
        System.out.println("Your age is: " + age);
    }
}