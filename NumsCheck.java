package com.company;

public class NumsCheck extends Calculator {
    private static final int FROM = 1, TO = 10;


    //Проверка латинских чисел на соответствие
    public void numCheck() {
        if (getA() >= FROM && getA() <= TO) {
            if (getB() >= FROM && getB() <= TO) {
                NumsCheck nc = new NumsCheck();
                nc.result();
            } else {
                System.out.println("2-ое число вне диапазона!");
            }
        } else {
            System.out.println("1-ое число вне диапазона!");
        }
    }


//выполнение соответствующей арифм. операции
    public void result() {

        switch (getOp()) {
            case "-":
                System.out.println(getA() - getB());
                break;
            case "+":
                System.out.println(getA() + getB());
                break;

            case "*":
                System.out.println(getA() * getB());
                break;
            case "/":
                System.out.println(getA() / getB());
                break;

            default:
                System.out.println("неправильный оператор");
        }
    }


}