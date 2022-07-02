package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Integer> integerList = new LinkedList<>();
    public static int count = 0;

    public static void main(String[] args) {
        System.out.print("Sonni kiriting: ");
        int n = scanner.nextInt();
        check(n);
        int m = multi();
        result(String.valueOf(m));

    }

    public static void check(int n) {
        int m = 0;
        for (int i = 1; i <= n; i++) {
            m = 0;
            for (int y = 1; y <= i; y++) {
                if (i % y == 0) {
                    m++;
                }
            }
            if (m == 2) {
                integerList.add(i);
            }
        }
    }

    public static int multi() {
        int n = 1;
        for (int m : integerList) {
            n = n * m;
        }
        return n;
    }

    public static void result(String number) {
        if (number.endsWith("0")) {
            count++;
            int m = Integer.parseInt(number);
            number = String.valueOf(m / 10);
            result(number);
        } else System.out.println(count + " Ta");
    }
}
