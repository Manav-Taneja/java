class CheckArgument extends Exception{
	
}
class Command {
	public static void main(String arg[]){
	int i,j;
	int ans=0;
	int s[]=new int[5];
	try
	{
	int cnt=0;
	for(i=0;i<s.length;i++)
	{
	s[i]=Integer.parseInt(arg[i]);
	cnt++;
	if(arg.length<5 && arg.length>5){
	throw new  CheckArgument();
	}
}
	for(i=0;i<s.length;i++)
	{
	ans=ans+s[i];
	}
}
	catch(CheckArgument m){
	System.out.println("passed 5 Integer");
	}
	System.out.println("the sum is" +ans);
	}
	}

