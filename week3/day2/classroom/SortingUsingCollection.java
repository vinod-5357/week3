package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		
		Set<String> values= new HashSet<String>();
		
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire sYSTEMS");
		values.add("CTS");
		
		
		
		ArrayList<String> listvalues= new ArrayList<String>();
		
		listvalues.addAll(values);
		
		Collections.sort(listvalues);
		
		int size = values.size();
		
		for(int i=size-1; i>=0; i--) {
			
			System.out.println(listvalues.get(i));
			
		}
		
		
	}

}
