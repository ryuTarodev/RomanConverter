package org.example;

import util.NumberToRoman;
import util.RomanToNumber;

public class Main {
    public static void main(String[] args) {
        testRomanToNumber();
        testNumberToRoman();
    }


    public static void testRomanToNumber(){
        System.out.println(RomanToNumber.romanToNumber("IIV"));
        System.out.println(RomanToNumber.romanToNumber("VII"));
        System.out.println(RomanToNumber.romanToNumber("XXII"));
        System.out.println(RomanToNumber.romanToNumber("IX"));
        System.out.println(RomanToNumber.romanToNumber("MMLXXIX"));
    }

    public static void testNumberToRoman(){
        System.out.println(NumberToRoman.numberToRoman(9));
        System.out.println(NumberToRoman.numberToRoman(300));
        System.out.println(NumberToRoman.numberToRoman(592));
        System.out.println(NumberToRoman.numberToRoman(2022));
        System.out.println(NumberToRoman.numberToRoman(2079));
    }
}