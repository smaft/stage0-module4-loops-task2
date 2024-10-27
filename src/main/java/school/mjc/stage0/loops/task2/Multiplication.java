package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while (multiplyByAndToInclusive >= i || multiplyByAndToInclusive >= i && i < 0) {
            multiplyByAndToInclusive = multiplyByAndToInclusive * i;
            System.out.println(multiplyByAndToInclusive);
            i++;            
        }
    }
}
