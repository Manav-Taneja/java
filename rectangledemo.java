class shape{
	public void display(){
	System.out.println("this is the shape");
	}
	}
	class rectangle extends shape{
	public void display(){
	System.out.println("this is rectangle");
	}
	public void increaselenght(){
	System.out.print("the length is incraese");
	}
}
class rectangledemo{
	public static void main(String[] args){
	shape s;
	s= new rectangle();
	s.display();
   	rectangle c =(rectangle) s;
   	c.increaselenght();
   	//c.display();
   	//s.increaselenght();
	}
}