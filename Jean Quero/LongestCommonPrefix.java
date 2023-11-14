import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix2(String[] strs) {
        StringBuilder longest = new StringBuilder();

        String first = strs[0];
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            prefix.append(first.charAt(i));
            boolean noMatch = false;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].contains(prefix.toString())) {
                    noMatch = true;
                    break;
                }
            }

            if (longest.length() < prefix.length() && !noMatch) {
                longest = new StringBuilder();
                longest.append(prefix.toString());
            } else if (noMatch) {
                prefix = new StringBuilder();
            }
        }

        return longest.toString();

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder longest = new StringBuilder();

        String first = strs[0];
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            prefix.append(first.charAt(i));
            boolean noMatch = false;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i+1) {
                    noMatch = true;
                    break;
                }
                if (!strs[j].substring(0,i+1).equals(prefix.toString())) {
                    noMatch = true;
                    break;
                }
            }

            if (longest.length() < prefix.length() && !noMatch) {
                longest = new StringBuilder();
                longest.append(prefix.toString());
            } else if (noMatch) {
                prefix = new StringBuilder();
            }
        }

        return longest.toString();

    }

    public String longestCommonPrefix3(String[] strs) {
        StringBuilder pre = new StringBuilder();
        String st = "";
        Arrays.sort(strs);
        for(int i = 0;i<strs[0].length();i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                pre.append(strs[0].charAt(i));
            }
            else break;
        }
        return pre.toString();
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower","flow","flight"});
       // longestCommonPrefix(new String[]{"ab","a"});
    }
}
