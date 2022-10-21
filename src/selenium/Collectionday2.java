package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collectionday2 
{
public static void main(String[] args) 
{
Set a=new HashSet();
	a.add(100);
	a.add(200);
	a.add("atul");
	System.out.println(a);
//	System.out.println(a.size());

	
	//iterator ---> interface
	              //method of Hashset
	
	Iterator y=a.iterator();
//	System.out.println(y.next());
//	System.out.println(y.next());
//	System.out.println(y.next());
	
	for(int i=1;i<=3;i++)
	{
		System.out.println(y.next());
	}
	
	//Difference between List and Set(Interfaces):-
	
	//1.list ---->sequentially value printed.
	//2.duplicate value --->Multiple same value accepted.
	//3.null value:-------->many null value accepted. 
	
	
	//1.set --->Sequentially value not printed.
	
	//2.Duplicate value----->Multiple not same value accepted.
	//3.null value:------->only one null value accepted.
	
	
}
}
