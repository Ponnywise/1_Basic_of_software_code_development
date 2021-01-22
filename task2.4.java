public class sin {
    public static void main(String[] args) {
     int A = 4;
     int B = 5;
     int x = 6;
     int y = 6;
     int z = 1;
     int D = A*A+B*B; //диагональ отверстия в квадрате
     if (D>x*x+y*y || D>x*x+z*z || D>y*y+z*z)
      System.out.println("Кирпич проходит"); //если диагональ отверстия больше диагонали стороны кирпича то кирпич пройдет
     else System.out.println("Кирпич не проходит");
     } 

} 


