package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int num = 1;
        while (i <= printToInclusive) {
            if (i == 0){
                num = num * (i+1);
            }else{
                num *= i;
            }
                i++;
                System.out.println(num);
        }
                    
            
    }
}
