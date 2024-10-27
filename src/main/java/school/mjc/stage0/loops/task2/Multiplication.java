package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = multiplyByAndToInclusive * (-1);
        while (multiplyByAndToInclusive >= i ) {
            multiplyByAndToInclusive = multiplyByAndToInclusive * i;
            System.out.println(multiplyByAndToInclusive);
            i++;            
        }
    }
}
