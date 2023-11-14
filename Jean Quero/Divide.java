public class Divide {
    public static int divide(int dividend, int divisor) {

        int result = 0;

        boolean negative = ((divisor < 0 && dividend > 0 ) || (dividend < 0 && divisor > 0));

        long dvd = dividend > Integer.MAX_VALUE ? Integer.MAX_VALUE -1 : Math.abs((long) dividend);


        long dis = divisor > Integer.MAX_VALUE ? Integer.MAX_VALUE -1  : Math.abs((long) divisor);


        if (dis == 1) {
            return (int) (negative ?  -dvd : dvd);
        }
        while (dvd > dis) {
            result++;
            dvd -= dis;
        }

        dvd*= 10;

        int resto = 0;
        while (dvd > dis) {
            resto++;
            dvd -= dis;
        }

        if (resto > 5) {
            result++;
        }
        return negative ?  -result : result;
    }

    public static void main(String[] args) {
        divide(-2147483648, -1);
    }
}
