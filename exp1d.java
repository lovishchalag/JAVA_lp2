/*Write a Java program to find and print the prime factors of a given number.
Use loops to iterate through possible factors.*/
package lp2;
public class exp1d {
    public static void main(String[] args) {
        int number = 315;
        for(int i = 2; i <= number; i++) {
            while(number % i == 0) {
                System.out.println(i + " ");
                number /= i;
            }
        }
    }
}
