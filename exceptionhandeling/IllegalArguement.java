class IllegalArguement { 
public static void main(String[] args) 
    { 
        Thread t = new Thread(); 
        Thread t1 = new Thread(); 
        t.setPriority(7); // Correct 
        t1.setPriority(17); // Exception 
    } 
} 