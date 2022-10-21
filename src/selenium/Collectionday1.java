package selenium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collectionday1
{
public static void main(String[] args)
{
	//variales:-
	//int a=100;
	//int b=200;
	
	//array cocept:-more than 5 variables
//	int c[]= {10,30,50,70,80};
	
	//collection concept  ----> 1
	//array list----> class--------->2
	//ArrayList d=new ArrayList(); ------->3
	//LinkedList<Integer> d=new LinkedList<Integer>();---->4
	Vector<Integer> d=new Vector<Integer>();//----->5
	//Stack d=new Stack();//------->6
	d.add(10);
	d.add(20);
	d.add(60);
	//d.add('a');
	d.add(78);
	d.add(79);
	d.add(100);
	d.add(60);
	d.add(90);
	d.add(789);
	d.add(45);
	d.add(45);
	
	//d.add("atul");
	
	//System.out.println(d);
	//System.out.println(d.get(3));
	
	//ele size-size method
	//System.out.println("ele size of array list"+d.size());
	
	//start index=0
	//end index=size-1
//	for(int i = 0;i<d.size();i++)
//	{
//		System.out.println(d.get(i));
//	}

d.set(0, 700);
System.out.println(d);

}
}
