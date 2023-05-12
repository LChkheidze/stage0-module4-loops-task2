package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int num = 0;

        if(multiplyByAndToInclusive==0){
            System.out.print("");
        }else{
            while(num<=Math.abs(multiplyByAndToInclusive)){
                System.out.println(num * multiplyByAndToInclusive);
                num++;
            }
        }
    }
}
