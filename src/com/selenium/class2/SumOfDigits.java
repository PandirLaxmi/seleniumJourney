package com.selenium.class2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int sum = 0;
        while(i>0) {
                sum += i % 10;
                i = i / 10;
        }
        System.out.println(sum);
    }
}

