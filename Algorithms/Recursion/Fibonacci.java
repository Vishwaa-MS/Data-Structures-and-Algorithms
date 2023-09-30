public class Fibonacci {
    public static void main(String[] args) {
        //for(int i = 0; i<=10; i++) {
            System.out.print(fib(1500) + " ");
        //}

    }

    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }
}
