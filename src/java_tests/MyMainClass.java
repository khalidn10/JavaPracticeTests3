package java_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer a[] = {4,5,5,5,4,6,6,9,4,7,8};
		Set<Integer> s = new HashSet<>(Arrays.asList(a));
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(a));
		for (Integer i : s)
		{
			int j = Collections.frequency(l, i);
	        System.out.print(i + " is present " + j);
	        if (j==1)
	        {
	        	System.out.println(" time so is unique");
	        }
	        else
	        {
	        	System.out.println(" times");
	        }
	    }
		
		
		/*for (int val : a)
		{
			s.add(Integer.valueOf(val));
		}
		
		//System.out.println(s);
		
		Iterator<Integer> i = s.iterator();
		
		for (int val : a)
		{
			l.add(Integer.valueOf(val));
		}
		
		//System.out.println(l);
		
		System.out.println(l.indexOf(5));*/
	}

}
