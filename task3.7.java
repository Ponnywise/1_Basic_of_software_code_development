/********************************
Compilation: task.java
Execution: task  40 50
Result: 
�������� 40: 20 10 8 5 4 2
�������� 41:
�������� 42: 21 14 7 6 3 2
�������� 43:
�������� 44: 22 11 4 2
�������� 45: 15 9 5 3
�������� 46: 23 2
�������� 47:
�������� 48: 24 16 12 8 6 4 3 2
�������� 49: 7
�������� 50: 25 10 5 2


*********************************/

public class task {
    public static void main(String[] args) {
     int m = Integer.parseInt(args[0]);
     int n = Integer.parseInt(args[1]);
     int c = 0;
     if (m>n) {c=m; m=n; n=c;}
     for (int i=m; i<=n; i++)
      {
     	System.out.print("�������� " + i +":");
     	for (int j=i-1; j>1; j--)
     		if (i%j==0) System.out.print(" " + j);
     	System.out.println();
      }
    
      }      
}




