// Task: Compute Pi using its "continued fraction" representation.
// Recursion is used.
import java.lang.*;
public class PiContinuedFraction {
     public static int recursiveMethod(int i, double value) {        
        if(i == 0) {  
            value = value - 3.0;
            System.out.printf("Pi = %.5f (limited to six s.f.)\n", value);
        }
        else {
            value = 6.0 + Math.pow(2.0*i-1, 2.0)/value;
            recursiveMethod(--i, value);
        }
        return 0;
    }
    public static void main(String args[]) {         
       int a = recursiveMethod(50, 1.0); // 50 iterations is OK.
    }
}
