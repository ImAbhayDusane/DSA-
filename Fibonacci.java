/*
Q1: Find the nth fibonacci number

 */
public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(71);
        System.out.println(result);
    }
    static int fibonacci(int n){
        // base condition .
        // base condition can be derived from the answer we already have
        // here we know that fib(0) = 0 ; fib(1) = 1.
        // So we implemented that below
        if(n < 2){
            return n;
        }
        // this is not a tail recursion
        // Recurrence Relation :-
        return fibonacci(n-1 ) + fibonacci(n-2);
        // Fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

    }
}
