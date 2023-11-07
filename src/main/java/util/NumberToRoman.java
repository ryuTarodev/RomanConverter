package util;

import java.util.HashMap;
import java.util.Map;

public class NumberToRoman {
    public static Map<Integer, String> createNumberToRomanMap(){
        Map<Integer, String> romanMap = new HashMap<Integer, String>();
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");
        return romanMap;
    }
    public static String numberToRoman(Integer input){
        String answer = "";
        Map<Integer, String> romanMap = createNumberToRomanMap();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int value : values) {
            while (input >= value) {
                answer += romanMap.get(value);
                input -= value;
            }
        }
        return answer;
    }
}
