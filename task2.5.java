/********************************
Compilation: task.java
Execution: task 3.0
Result: 9.0
Execution: task 4.0
Result: 0.014285714285714285

*********************************/
public class task {
    public static void main(String[] args) {
     double x = Double.parseDouble(args[0]);
     double F = 0.0;
     if (x<=3) F = x*x-3*x+9;
     else F = 1/(x*x*x+6);
     System.out.println(F);
                
    } 
} 


