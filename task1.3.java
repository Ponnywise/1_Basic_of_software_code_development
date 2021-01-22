/********************************
Compilation: task1.3.java
Execution: task 30 45
Result: 3.3124971672




*********************************/
public class task {
    public static void main(String[] args) {
     double x = Double.parseDouble(args[0]);
     double y = Double.parseDouble(args[1]);
     x = Math.toRadians(x);
     y = Math.toRadians(y);
     double F = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
     System.out.println(F);
                
    } 
} 


