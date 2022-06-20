package main.java;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println("Сумма четных значений чисел фибоначи, не превышающих 4 млн " + evenFibonacciNumbers(4000000));
    }

    public static Integer evenFibonacciNumbers(int valuesNotExceed) {
        int previous = 1;
        int current = 2;
        int next = 0;
        int sum = 2;

        while (next < valuesNotExceed) {
            next = previous + current;
            previous = current;
            current = next;
            if (next % 2 == 0) {
                sum += next;
            }
        }
        return sum;
    }

}
