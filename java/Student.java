

import java.util.Scanner;

public class Student {
	    public static String name;
	    public static String rollno;
	    public static int marks1;
	    public static int marks2;
	    public static int marks3;
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollno=" + rollno +"]";
		}
		public Student(String name, String rollno, int marks1, int marks2, int marks3) {
			super();
			this.name = name;
			this.rollno = rollno;
			this.marks1 = marks1;
			this.marks2 = marks2;
			this.marks3 = marks3;
		}
		
}
