import javax.lang.model.util.ElementScanner6;

public class FizzBuzz {
    public static void main(String args[]){
        for (int i=1;i<=100;i++){
            if (i%3==0)
              System.out.println("Fizz"+"\n");
            else if (i%5==0)
              System.out.println("Buzz"+"\n");
            else if (i%15==0)
              System.out.println("FizzBuzz"+"\n");
            else   
              System.out.println(i+"\n");
        }
    }
}
