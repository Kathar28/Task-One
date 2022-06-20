package main.java;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("Сумма всех значений, кратных 3 и 5 ниже 1000 равна " + multiplesOfThreeOrFive(1000));
    }

    public static Integer multiplesOfThreeOrFive(int valuesBelow) {
        int sum = 0;

        for (int i = 1; i < valuesBelow; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

}
