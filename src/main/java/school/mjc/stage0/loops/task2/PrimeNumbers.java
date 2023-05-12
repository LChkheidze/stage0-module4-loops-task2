package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;

        if(number==0){
            System.out.print("");
        }else{
            while(number<=printToInclusive){
                if(isPrime(number)){
                    System.out.println(number);
                }
                number++;
            }
        }



    }

    public boolean isPrime(int n) {
        int div = 2;

        while(div <= Math.sqrt(n)){
            if(n % div == 0){
                return false;
            }else{
                div++;
            }
        }
        return true;
    }
}
