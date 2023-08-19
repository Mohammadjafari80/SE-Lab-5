import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press N: ");
        int n = scanner.nextInt();

        // Recursive method
        long startTimeRecursive = System.currentTimeMillis();
        int resultRecursive = fibonacci(n);
        long endTimeRecursive = System.currentTimeMillis();

        System.out.println("Iterative Fibonacci(" + n + ") = " + resultRecursive);
        System.out.println("Time taken (Iterative): " + (endTimeRecursive - startTimeRecursive) + " ms");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
