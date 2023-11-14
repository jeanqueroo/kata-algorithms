public class StrStr {

    public static int strStr(String haystack, String needle) {

        int result = -1, i = 0, j = 0, point = 0;
        boolean found = false;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) {
                    point = i;
                }

                if (j == needle.length() -1) {
                    found = true;
                    break;
                }
                j++;
            } else {
                i = i - j;
                j = 0;
            }



            i++;
        }

        return found ? point : result;
    }

    public static void main(String[] args) {
        strStr("mississippi", "issip");
    }

}
