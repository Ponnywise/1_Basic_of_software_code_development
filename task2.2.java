public class sin {
    public static void main(String[] args) {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int c = Integer.parseInt(args[2]);
     int d = Integer.parseInt(args[3]);
     if (a>b) a=b;
     if (c>d) c=d;
     if (a<c) a=c;
     System.out.println("max = "+a);        
    } 

} 


