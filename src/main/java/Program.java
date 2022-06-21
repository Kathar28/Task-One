package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        System.out.println("Сумма всех значений, кратных 3 и 5 ниже 1000 равна :" +
                multiplesOfThreeOrFive(1000, 3, 5));

        System.out.println("Сумма всех значений, кратных 4 и 7 ниже 1000 равна :"+
                multiplesOfThreeOrFive(1000, 4, 7));


        System.out.println("Суммы четных значений чисел фибоначи, не превышающих 100 и 4 млн. : " +
                Arrays.toString(evenFibonacciNumbers(4000000, 100)).
                        replaceAll("^\\[|\\]$", ""));
    }

    public static Integer multiplesOfThreeOrFive(int valuesBelow, int firstMultiple, int secondMultiple) {
        int sum = 0;

        for (int i = 1; i < valuesBelow; i++) {
            if ((i % firstMultiple == 0) || (i % secondMultiple == 0)) {
                sum += i;
            }
        }
        return sum;
    }

    public static Integer[] evenFibonacciNumbers(int maxNotExceed, int minNotExceed) {
        int previous = 1;
        int current = 2;
        int next = 0;
        int sumOfMax = 2;
        int sumOfMin = 2;

        while (next < minNotExceed){
            next = previous + current;
            previous = current;
            current = next;
            System.out.println(next);
            if (next % 2 == 0) {
                sumOfMin += next;
            }
        }

        while (next < maxNotExceed) {
            next = previous + current;
            previous = current;
            current = next;
            if (next % 2 == 0) {
                sumOfMax += next;
            }

        }
        return new Integer[]{sumOfMax + sumOfMin, sumOfMin};
    }
}
