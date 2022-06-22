import java.util.*;
class PrintPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        for(int i=first;i<=last;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}