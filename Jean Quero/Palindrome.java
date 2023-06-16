import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        List<Integer> v =  new ArrayList<>();

        if(x < 0) {
            return false;
        } else {
            while (x > 0) {
                v.add(x%10);
                x /= 10;
            }

        }


     int i = 0, j = v.size()-1;

     while(i < v.size() && j > 0) {
         if(v.get(i) != v.get(j)) {
             return false;
         }
         i++;
         j--;
     }
     return true;
    }

    public boolean isPalindrome2(int x) {
        //My original
        //     String xStr = Integer.toString(x);
        //     char[] chArr = xStr.toCharArray();

        //     Stack<Character> s = new Stack<>();

        //     for (char c : chArr) {
        //         s.push(c);
        //     }

        //     int i = 0;
        //     while(!s.isEmpty()) {
        //         if(chArr[i] != s.pop()) {
        //             return false;
        //         }
        //         i++;
        //     }

        //     return true;
        // }

        //Optimal
        String xStr = String.valueOf(x);
        int n = xStr.length();

        for(int i = 0; i < n/2; i++) {
            if (xStr.charAt(i) != xStr.charAt(n - i - 1)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
