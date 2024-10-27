package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int num = 1;
        while (i <= printToInclusive) {
           num *= i;
            i++;
        }
        System.out.println(num);            
            
    }
}
