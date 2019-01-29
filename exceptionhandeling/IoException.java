import java.io.*; 
class IoException { 
public static void main(String args[]) 
    { 
        FileInputStream f = null; 
        f = new FileInputStream("abc.txt"); 
        int i; 
        while ((i = f.read()) != -1) { 
            System.out.print((char)i); 
        } 
        f.close(); 
    } 
} 