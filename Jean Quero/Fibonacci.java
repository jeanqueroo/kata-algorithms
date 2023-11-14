public class Fibonacci {
    // Function to print the fibonacci series
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibonacci(int n, int[] memo)
    {
        if (memo[n] != 0)
            return memo[n];
        if (n == 1 || n == 2)
            return 1;
        else {
            memo[n] = fibonacci(n - 1, memo)
                    + fibonacci(n - 2, memo);
            return memo[n];
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Print the first N numbers
        for (int i = 0; i < N; i++) {

            System.out.print(fib(i) + " ");
        }

        int n = 10; // Number of terms to print
        int[] memo = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i, memo) + " ");
        }
    }

}
