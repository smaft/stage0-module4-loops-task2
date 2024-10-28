package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = -multiplyByAndToInclusive ;
        int result = 0;
        while (i <= multiplyByAndToInclusive ) {
            result = multiplyByAndToInclusive * i;
            System.out.println(result);
            i++;            
        }
    }
}
