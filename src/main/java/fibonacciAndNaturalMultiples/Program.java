package main.java.fibonacciAndNaturalMultiples;

public class Program {

    public static void main(String[] args) {

        System.out.println("Сумма всех значений, кратных 3 и 5 ниже 1000 равна :" +
                getSumOfNaturalMultiples(1000, 3, 5));

        System.out.println("Сумма всех значений, кратных 4 и 7 ниже 1000 равна :" +
                getSumOfNaturalMultiples(1000, 4, 7));


        System.out.println("Суммы четных значений чисел фибоначи, не превышающих 100 : " +
                getSumEvenFibonacciNumbers(100));

        System.out.println("Суммы четных значений чисел фибоначи, не превышающих 4 млн : " +
                getSumEvenFibonacciNumbers(4000000));

    }

    public static int getSumOfNaturalMultiples(int max, int divider1, int divider2) {
        int sum = 0;

        for (int i = 1; i < max; i++) {
            if ((i % divider1 == 0) || (i % divider2 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int getSumEvenFibonacciNumbers(int max) {
        int previous = 1;
        int current = 2;
        int next = current + previous;
        int sum = 2;

        while (previous + current < max) {
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
