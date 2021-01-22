/********************************
Compilation: task.java
Execution: task  -4 -2 
Result: true

*********************************/
public class task {
    public static void main(String[] args) {
     int x = Integer.parseInt(args[0]);
     int y = Integer.parseInt(args[1]);
     System.out.println(y>=0 && y<=4 && x>=-2 && x<=2 || y<=0 && y>=-3 &&x>=-4&& x<=4);
      }      
}




