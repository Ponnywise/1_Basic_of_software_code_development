/********************************
Compilation: task.java
Execution: task  0.05
Result: 1.4666923868312758


*********************************/

public class task {
    public static void main(String[] args) {
    double e = Double.parseDouble(args[0]);
    int n=1;
    double sum = 0;
    double a=Double.MAX_VALUE;
     while (e<=a)
     {
     a = (Math.pow(2, -n)+Math.pow(3, -n));
     sum += a;
     n++;
     }
     System.out.println(sum);
      }      
}




