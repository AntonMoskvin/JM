package com.company;

import java.util.Scanner;

public class Calculator {
    private static int a, b;
    private static String r1, r2, op;

//Инкапсулируем
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getR1() {
        return r1;
    }

    public String getR2() {
        return r2;
    }

    public String getOp() {
        return op;
    }

//////////////////////////

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ввод от 1 до 10: ");

        if (sc.hasNextInt()) {
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            NumsCheck nc = new NumsCheck();
            nc.numCheck();
        } else {
            r1 = sc.next();
            op = sc.next();
            r2 = sc.next();

            RomanNumsCheck rn = new RomanNumsCheck();
            rn.romanNumCheck();
        }
        sc.close();


    }

}