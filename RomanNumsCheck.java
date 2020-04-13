package com.company;

public class RomanNumsCheck extends Calculator {
    private int error = 0;
    private int num1, num2, resultNum;


    public void romanNumCheck() {
    int num1 = romeToLatin(getR1());
    int num2 = romeToLatin(getR2());
    romeOpCheck(num1, num2);
    ArabicToRoman ltr = new ArabicToRoman();
    System.out.println(ltr.arabicToRoman(resultNum));
    }


//проверка на римские числа
    public int romeToLatin(String romanaToNama) {
        String r = romanaToNama;
        if (r.equals("I")) {
            return 1;
        }else if (r.equals("II")){
                return 2;
            }else if (r.equals("III")){
                return 3;
            }else if (r.equals("IV")){
                return 4;
            }else if (r.equals("V")){
                return 5;
            }else if (r.equals("VI")){
                return 6;
            }else if (r.equals("VII")){
                return 7;
            }else if (r.equals("VIII")){
                return 8;
            }else if (r.equals("IX")){
                return 9;
            }else if (r.equals("X")){
                return 10;
            }else{
            error ++;
            System.out.println(error + " - NUM is WRONG");
            }

        return 0;
    }


//проверка оператора + вычисление
    public int romeOpCheck(int num1, int num2) {

        switch(getOp()) {
            case "+":
                resultNum = num1 + num2;
                break;
            case "-":
                resultNum = num1 - num2;
                break;
            case "*":
                resultNum = num1 * num2;
                break;
            case "/":
                resultNum = num1 / num2;
                break;

            default:
                System.out.println("OP is WRONG");
        }
        return 0;
    }


}
