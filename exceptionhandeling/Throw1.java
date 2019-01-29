class Throw1{
	public static void main(String args[]){
	String s="Null";
	try{
	if(s==null){
	throw new Exception("u entered a null string");
	}
    else{
    System.out.println("the entered string is " +s);
    }
	}
	catch(Exception e){
	System.out.println(e);
	}
	finally{
	System.out.print("the program is executed");
	}
	}
}