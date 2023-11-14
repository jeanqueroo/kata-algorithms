import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ConverRoman {

    public String intToRoman(int num) {

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }

        }
        return roman.toString();
    }
    public int romanToInt(String s) {


        int result = 0;
        Map<Character, Integer> values = new HashMap<>();
        values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L',50);
        values.put('X',10);
        values.put('V', 5);
        values.put('I', 1);
        values.put(' ', 0);
        if(s.length() < 2) {
           return values.get(s.charAt(0));
        }
        char[] roman = s.toCharArray();

        char before = ' ';

        for (int i = 0; i < roman.length; i++) {

            if(i < roman.length - 1) {
                if(values.get(roman[i]) >= values.get(roman[i+1])) {
                    result += (values.get(roman[i]) - values.get(before));
                    before = ' ';
                } else {
                    before = roman[i];
                }
            } else {
                if(values.get(roman[i]) > values.get(roman[i - 1])) {
                    result += (values.get(roman[i]) - values.get(before));
                    before = ' ';
                } else {
                    result += values.get(roman[i]);
                }
            }

        }

        return result;
    }

    public static int romanToInt2(String str) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        final int[] number = {0};
        map.put('I', 1);map.put('V', 5);map.put('X', 10);map.put('L', 50);map.put('C', 100);map.put('D', 500);map.put('M', 1000);
        IntStream.range(0, str.length())
                 .forEach(i -> {
                     if (i+1 == str.length() || map.get(str.charAt(i)) >= map.get(str.charAt(i + 1))) {
                         number[0] += map.get(str.charAt(i));
                     } else {
                         number[0] -= map.get(str.charAt(i));
                     }
                 });
        return number[0];
    }


}
