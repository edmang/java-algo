public class Fibonacci {

    public static void main(String[] args) {

        int n = 20;
        int k = 42;
        System.out.println(n + " (Fibonacci with recursion): " + fibonacciRecursive(n));
        System.out.println(k + " (Fibonacci with recursion): " + fibonacciRecursive(k));                                // time consuming shit
        System.out.println(k + " (Fibonacci with memoized recursion): " + fibonacciMemoized(k, new long[k+1]));         // time not bad but strange shit
        System.out.println(k + " (Fibonacci with memoized recursion): " + fibonacciBottomUp(k));                        // straight forward actually, but has a huge array in the memory
    }

    private static long fibonacciRecursive(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    private static long fibonacciMemoized(int n, long[] memo) {
        long result = 0;
        if (memo[n] != 0) {
            return memo[n];
        } else if (n <= 2) {
            return 1;
        } else {
            result = (fibonacciMemoized(n-1, memo) + fibonacciMemoized(n-2, memo));
            memo[n] = result;
        }
        return result;
    }

    private static long fibonacciBottomUp(int n) {
        long[] result = new long[n];
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < n; i ++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }
}
