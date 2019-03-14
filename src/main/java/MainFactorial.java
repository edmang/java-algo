public class MainFactorial {

    public static void main(String[] args) {
        int k = 3;
        int m = 20;
        System.out.println("k! = " + factorialRecursive(k));
        System.out.println("m! = " + factorialRecursive(m));
        System.out.println("m (bottom up) = " + factorialBottomUp(m));
    }

    private static long factorialRecursive(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    private static long factorialBottomUp(int n) {
        long result = 1;
        for(int i = 1; i < n+1; i++) {
            result *= i;
        }
        return result;
    }
}
