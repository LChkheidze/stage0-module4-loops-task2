package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;

        while(number<=printToInclusive){
            System.out.println(factorial(number));
            number++;
        }

    }

    public long factorial(int n){
        int fact = 1;
        int multiplier = 1;

        while(multiplier <= n){
            fact *= multiplier;
            multiplier++;
        }
        return fact;
    }
}
