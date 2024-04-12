/*Implement the factorial calculation using recursion instead of loops.
Compare the performance and resource usage with the loop-based version.*/
package lp2;
public class exp1c {
    public static void main(String[] args) {
    	System.out.println("factoria using recursion : ");
        int n = 5;
        System.out.println(factorial(n));
        System.out.println("factorial using loop");
        int x = 5;
        System.out.println(factorial(x));
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static long fact(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
