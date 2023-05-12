package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power < 0){
            System.out.println("too much power");
        }else{
            int num = 0;
            while(num<=power){
                System.out.println(twosPow(num));
                num++;
            }
        }
    }

    public int twosPow(int n){
        int pow2 = 1;
        int multiplier = 1;

        while(multiplier<=n){
            pow2 *= 2;
            multiplier++;
        }

        return pow2;
    }
}
