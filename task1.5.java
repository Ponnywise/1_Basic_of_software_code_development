public class sin {
    public static void main(String[] args) {
     int ss = Integer.parseInt(args[0]);
     int hh = ss/3600;
     int mm = (ss-hh*3600)/60;
     ss = ss-hh*3600-mm*60; 
     System.out.printf("%d÷ %dìèí %dñ.", hh, mm, ss);               
    } 

} 


