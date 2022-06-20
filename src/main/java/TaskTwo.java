package main.java;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Сумма четных значений чисел фибоначи, не превышающих 4 млн " + evenFibonacciNumbers(4000000));
    }

    public static Integer evenFibonacciNumbers(int valuesNotExceed) {
        int a = 1;
        int b = 2;
        int fib = 0;
        int sum = 2;

        while (fib < valuesNotExceed) {
            fib = a + b;
            a = b;
            b = fib;
            if (fib % 2 == 0) {
                sum += fib;
            }
        }
        return sum;
    }

}
