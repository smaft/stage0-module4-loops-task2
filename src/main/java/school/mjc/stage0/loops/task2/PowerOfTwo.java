package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i =0;
        int result = 2;
        while (power >=i) {
            result = result*power;
            System.out.println(result);   
            i++;         
        }

    }
}
