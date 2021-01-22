public class sin {
    public static void main(String[] args) {
     int x1 = 1;
     int x2 = 5;
     int x3 = 3;
     int y1 = 3;
     int y2 = 2;
     int y3 = 3;
     // ѕровер€етс€ принадлежность третьей точки к пр€мой построенной по первым двум точкам по формуле y=kx+b
     if(y3==((y1-y2)/(x1-x2)*x3) + y1 - ((y1-y2)/(x1-x2))*x1)
     System.out.println("¬се точки на одной линии ");
     else System.out.println("“очки не на одной пр€мой ");
     } 

} 


