import java.util.*;
class Average{
    public static void main(String args[]){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int result=0;
        for(int i=0;i<5;i++){
            int val=sc.nextInt();
            result+=val;
        }
        System.out.println(result/5);
    }
}