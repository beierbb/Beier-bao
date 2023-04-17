package One;
//Write a recursive method to return the solution of fibonacci sequence
//
//The fibonacci sequence is as follows
//1, 1, 2, 3, 5, 8, 13 …..
//This recursive algorithm should be done in 4 lines or 6 lines of code (possible in 2 lines)
public class Recursion {
    public static int fibonacciRecursion(int a) {
        if (a == 0) {return a;}
        if (a == 1 || a == 2) {return 1;}
        return fibonacciRecursion(a - 2) + fibonacciRecursion(a - 1);
    }
}