/********************************
Compilation: task.java
Execution: task 568.654
Result: 654.568





*********************************/
public class task {
    public static void main(String[] args) {
     double R = Double.parseDouble(args[0]);
     int nnn = (int)R;
     double ddd  =Math.round((R-nnn)*1000);
     System.out.print((int)ddd+"."+nnn);               
    } 
} 


