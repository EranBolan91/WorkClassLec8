package com.homework.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        MathClass.factorial(num);

    }
}
