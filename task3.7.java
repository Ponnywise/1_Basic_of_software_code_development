/********************************
Compilation: task.java
Execution: task  40 50
Result: 
Делители 40: 20 10 8 5 4 2
Делители 41:
Делители 42: 21 14 7 6 3 2
Делители 43:
Делители 44: 22 11 4 2
Делители 45: 15 9 5 3
Делители 46: 23 2
Делители 47:
Делители 48: 24 16 12 8 6 4 3 2
Делители 49: 7
Делители 50: 25 10 5 2


*********************************/

public class task {
    public static void main(String[] args) {
     int m = Integer.parseInt(args[0]);
     int n = Integer.parseInt(args[1]);
     int c = 0;
     if (m>n) {c=m; m=n; n=c;}
     for (int i=m; i<=n; i++)
      {
     	System.out.print("Делители " + i +":");
     	for (int j=i-1; j>1; j--)
     		if (i%j==0) System.out.print(" " + j);
     	System.out.println();
      }
    
      }      
}




