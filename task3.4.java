/********************************
Compilation: task.java
Execution: task  -4 -2 
Result: true

*********************************/
import java.math.*;
public class task {
    public static void main(String[] args) {
    BigInteger s = BigInteger.valueOf(1);
     for (int i=1; i<=200; i++)
     {
     BigInteger j = BigInteger.valueOf(i);
     j = j.multiply(j);
     s = s.multiply(j);
     }
     System.out.println(s);
      }      
}




