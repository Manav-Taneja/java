import java.util.*;
class LinkedListDemO1{
	public static void main(String[] args)
	{
	linkedList<String> ll=new LinkedList<String>();
	System.out.println("initial size of ll:"+ll.size());
	ll.add("C");
	ll.add("A");
	ll.add("E");
	ll.add("D");
	ll.add(1,"A2");
	ll.addLst("z");
	ll.addFirst("a");

	System.out.println("initial size addition al:"+ll);

	ll.remove("F");
	ll.remove(2);
	System.out.println("after deletion al:" +ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.printyln("after deletion of first and last al:"+ll);
	String val=ll.get(2);
	ll.set(2,"5");
	System.out.print("changed list :" +ll);
	}
}