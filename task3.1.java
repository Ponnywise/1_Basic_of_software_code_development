/********************************
Compilation: task.java
Execution: task 4
Result: 10


*********************************/
public class task {
    public static void main(String[] args) {
     double n = Integer.parseInt(args[0]);
     int sum = 0;
     for(int i=1; i<=n;i++)  sum+=i;
     System.out.println(sum);
                
    } 
} 


