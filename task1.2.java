/********************************
Compilation: task.java
Execution: task 2 3 1
Result: -0.9880054854934506





*********************************/
public class task {
    public static void main(String[] args) {
     double a = Double.parseDouble(args[0]);
     double b = Double.parseDouble(args[1]);
     double c = Double.parseDouble(args[2]);
     double z = ((b+MAth.sqrt(b*b+4*a*c))/2*a)-a*a*a*c-Math.pow(b,-2);
     System.out.println(z);
                
    } 
} 


