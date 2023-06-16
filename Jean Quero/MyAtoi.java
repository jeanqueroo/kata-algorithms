public class MyAtoi {

    public static int myAtoi(String s) {

       char[] v =  s.trim().toCharArray();
       long result = 0;

       char sign = ' ';
       boolean findSign = false;
        boolean findNumber = false;

        for (int i = 0; i < v.length; i++) {

            if (!findSign && (v[i] == '-' || v[i] == '+')) {
                sign = v[i];
                findSign = true;
            }

            if (findNumber && (v[i] < 48 || v[i] > 57 || v[i] == '-' || v[i] == '+')) {
                    break;
            }
            if (v[i] > 47 && v[i] < 58) {
                result = (result * 10) + Character.getNumericValue(v[i]);
                findNumber = true;
            }





        }

        if(sign == '-') {
            result *=-1;
        }

        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

       return (int) result;
    }

    public static int myAtoi2(String s) {
        char[] v =  s.trim().toCharArray();
        long result = 0;

        char sign = ' ';
        int i = 0;
        while (i < v.length) {
            if (v[i] == '-' || v[i] == '+') {
                sign = v[i];
                i++;
                break;
            }
            if((v[i] > 47 && v[i] < 58) || (v[i] < 48 || v[i] > 57)) {
                break;
            }
            i++;
        }

        while (i < v.length) {
            if ((v[i] < 48 || v[i] > 57 || v[i] == '-' || v[i] == '+')) {
                break;
            }

            if (v[i] > 47 && v[i] < 58) {
                result = (result * 10) + Character.getNumericValue(v[i]);

            }
            if (result > Integer.MAX_VALUE ||  result < Integer.MIN_VALUE) {
                break;
            }

            i++;
        }

        if(sign == '-') {
            result *=-1;
        }

        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        myAtoi2("9223372036854775808");
    }
}
