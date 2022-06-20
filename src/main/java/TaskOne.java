package main.java;

public class TaskOne {

    public Integer MultiplesOfThreeOrFive(int n){
        int a = 3;
        int b = 5;
        int sum = 0;

        for(int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                sum += i;
            }
        }

        return sum;
    }
}
