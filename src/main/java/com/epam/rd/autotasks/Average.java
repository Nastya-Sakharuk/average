package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int count = 0;
        int currValue;
        int sum = 0;
        do {
            currValue = scanner.nextInt();
            sum += currValue;
            count ++;
        } while (currValue != 0);
//        System.out.println(sum);
//        System.out.println(count-1);
        int average = sum / (count-1);
        System.out.println(average);
    }

}