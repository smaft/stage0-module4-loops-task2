package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
       int i = 0;
       while (printToInclusive >= i){
        if (i == 2){
            System.out.println(i);
            i++;
        } else if ( i % 2 == 0) {

            i++;
        }else {
            System.out.println(i);
            i++;
        }
        i++;
    }
  }
        
    }
       
       

       