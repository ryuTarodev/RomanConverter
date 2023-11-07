package util;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static Map<String, Integer> createRomanToNumberMap(){
        Map<String,Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        return romanMap;
    }
    public static int romanToNumber(String input) {
        //TODO: Check String Form Last, If currentChar is less than previousChar subtract result else add value to result.
        Map<String, Integer> romanMap = createRomanToNumberMap();
        int result = 0;
        int prevValue = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(input.substring(i, i + 1)); //String[] inputSplit = input.split("");
            if (currentValue < prevValue) {
                result -= currentValue;
            } else { // if(currentValue >= preValue);
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
