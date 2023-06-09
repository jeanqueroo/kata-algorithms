import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        //lengthOfLongestSubstring("aab");
        //findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        //longestPalindrome("babad");
        convert("PAYPALISHIRING", 3);

    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }

        char[] letter = s.toCharArray();
        int result = 1;
        Set<Character> longer = new HashSet<Character>();
        for (int i = 0; i < letter.length; i++) {

            for (int j = i; j < letter.length; j++) {
                if (longer.contains(letter[j])) {
                    if (longer.size() > result) {
                        result = longer.size();
                    }
                    break;
                } else {
                    longer.add(letter[j]);

                }

                if (longer.size() > result) {
                    result = longer.size();
                }
            }
            longer.clear();
        }
        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;

        while (i < nums1.length) {
            merged[i] = nums1[i];
            i++;
        }

        int j = 0;

        while (i < merged.length) {
            merged[i] = nums2[j];
            i++;j++;
        }
        if(merged.length == 1) {
            return merged[0];
        }
        for (int k = 0; k< merged.length; k++){
            for (int p =k+1; p< merged.length; p++) {
                if(merged[p] < merged[k]) {
                    int x = merged[k];
                    merged[k] = merged[p];
                    merged[p] = x;
                }
            }
        }
        double result;
        if (merged.length % 2 == 1) {
            result = merged[(merged.length / 2)];
        } else {
            double r1 = merged[(merged.length / 2)];
            double r2 = merged[(merged.length / 2)-1];
            result = (r2 + r1)/2;
        }
        return result;
    }

    public static String longestPalindrome(String s) {

        char[] value = s.toCharArray();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < value.length; i++) {
            for(int j=i; j < value.length; j++) {
                if(value.length < result.length()) {
                    break;
                }
                if (isPalisdrome(s.substring(i,j+1))) {
                    if(s.substring(i,j+1).length() >= result.length()) {
                        result = new StringBuffer(s.substring(i,j+1));
                    }
                }


            }
        }

        return result.toString();
    }

    private static boolean isPalisdrome(String s) {
        int i = 0, j = s.length()-1;
        char[] palis = s.toCharArray();
        while (i< palis.length){
            if(palis[i] != palis[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String convert(String s, int numRows) {
          char[] letters = s.toCharArray();
          StringBuffer[] row = new StringBuffer[numRows];
        int i = 0;
        int j = 0;
          while (i < letters.length) {
              while (j < numRows && i < letters.length) {
                  if(row[j] == null) {
                      row[j] = new StringBuffer().append(letters[i]);
                      i++;
                      j++;
                  } else {
                      row[j].append(letters[i]);
                      i++;
                      j++;
                  }
              }
              j = numRows -2;
              while (j > 0 && i < letters.length) {
                  row[j].append(letters[i]);
                  i++;
                  j--;
              }
              j = 0;
          }
        StringBuffer r = new StringBuffer();
          for (int k = 0; k  < row.length; k++) {
              if(row[k] != null)
                  r.append(row[k].toString());
          }
          return r.toString();
    }
}
