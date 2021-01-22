/********************************
Compilation: task.java
Execution: task -0.5 3.0 0.2
Result: 
0.5
0.3
0.09999999999999998
-0.10000000000000003
-0.30000000000000004
-0.5
-0.7
-0.8999999999999999
-1.0999999999999999
-1.2999999999999998
-1.4999999999999998
-1.6999999999999997
-1.8999999999999997
2.0999999999999996
2.3
2.5
2.7
2.9000000000000004


*********************************/
public class task {
    public static void main(String[] args) {
     double a = Double.parseDouble(args[0]);
     double b = Double.parseDouble(args[1]);
     double h = Double.parseDouble(args[2]);
     double y = 0;
     for(double x=a; x<=b;x+=h) 
     {
     if (x>2) y=x;
     else y=-x;
     System.out.println(y);
     }
     
                
    } 
} 


