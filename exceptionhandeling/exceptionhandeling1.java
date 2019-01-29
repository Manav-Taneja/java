public class exceptionhandeling1
{  
public static void main(String args[]){  
try{   
int data=26/0;  
}catch(ArithmeticException e){System.out.println(e);
}   
System.out.println("rest of the code...");  
 }  
