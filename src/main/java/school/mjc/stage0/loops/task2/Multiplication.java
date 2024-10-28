package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0 ;
        while (i <= multiplyByAndToInclusive || i <= multiplyByAndToInclusive * -1) {
               
            if(multiplyByAndToInclusive == 0){
                System.out.print("");
            } else {
                System.out.println(multiplyByAndToInclusive * i);
                   
            }
            i++;
        }
    }
}
