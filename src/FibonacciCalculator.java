public class FibonacciCalculator {

    public static void main(String[] args) {
        int n = 50;

        // Recursive method
        long startTimeRecursive = System.currentTimeMillis();
        int resultRecursive = fibonacci(n);
        long endTimeRecursive = System.currentTimeMillis();

        System.out.println("Recursive Fibonacci(" + n + ") = " + resultRecursive);
        System.out.println("Time taken (Recursive): " + (endTimeRecursive - startTimeRecursive) + " ms");
    }

    // Recursive Fibonacci method (inefficient)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
