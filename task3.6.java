/********************************
Compilation: task.java
Execution: task  hello_epam_:) 
Result: 
 h =  104 
 e =  101 
 l =  108 
 l =  108 
 o =  111 
 _ =   95 
 e =  101 
 p =  112 
 a =   97 
 m =  109 
 _ =   95 
 : =   58 
 ) =   41 

*********************************/

public class task {
    public static void main(String[] args) {
    char[] c = args[0].toCharArray();
    for(int i=0; i<c.length; i++)
     System.out.printf("%2c = %4d \n", c[i], (int)c[i]);
    }      
}




