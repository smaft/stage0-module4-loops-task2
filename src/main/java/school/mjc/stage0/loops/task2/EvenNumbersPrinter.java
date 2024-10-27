package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        if (counter % 2 == 0){
            while (printTillInclusive >= counter ) {
                System.out.println(counter);
                counter++;
            }
            
        }else{
            System.out.println("odd");
        }

    }
}
