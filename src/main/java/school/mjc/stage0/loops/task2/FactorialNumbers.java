package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            printToInclusive *= i;
            System.out.println(printToInclusive);            
            i++;
        }
    }
}
