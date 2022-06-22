
import java.util.*;
public class Test{
public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
             Student arr[]=new Student[2];
		    //  System.out.println("Please Enter first student details");
            //  String name1=sc.next();
            //  String roll1=sc.next();
            //  int m1=sc.nextInt();
            //  int m2=sc.nextInt();
            //  int m3=sc.nextInt();
            //  Student s1=new Student(name1,roll1,m1,m2,m3);
            //  System.out.println("Please Enter first student details");
            //  String name12=sc.next();
            //  String roll2=sc.next();
            //  int m12=sc.nextInt();
            //  int m22=sc.nextInt();
            //  int m32=sc.nextInt();
            //  Student s2=new Student(name2,roll2,m12,m22,m32);
            //  System.out.println("Please Enter first student details");
            //  String name3=sc.next();
            //  String roll3=sc.next();
            //  int m13=sc.nextInt();
            //  int m23=sc.nextInt();
            //  int m33=sc.nextInt();
            //  Student s3=new Student(name3,roll3,m13,m23,m33);
            //  System.out.print(s1.toString());
            //  System.out.print(s2.toString());
            //  System.out.print(s3.toString());
            for(int i=0;i<arr.length;i++){
                String name=sc.next();
                String rollno=sc.next();
                int m1=sc.nextInt();
                int m2=sc.nextInt();
                int m3=sc.nextInt();
                arr[i]=new Student(name,rollno,m1,m2,m3);
                System.out.println(arr[i]);
                
            }
            
            print(arr);
		}
public static void print(Student arr[]){
    for(int i=0;i<arr.length;i++){
        int average=(arr[i].marks1+arr[i].marks2+arr[i].marks3)/3;
        System.out.print(arr[i].toString()+"Avergae"+average);
    }
}
}