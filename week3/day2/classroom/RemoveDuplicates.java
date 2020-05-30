package week3.day2.classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {



	public static void main(String[] args) {

		String name= "PayPal India";

		char [] strtochararray= name.toCharArray();

		Set<Character> Charset = new LinkedHashSet <Character>();


		Set<Character> dupCharset = new LinkedHashSet <Character>();


		for (Character eachChar : strtochararray) {

			if(!Charset.add(eachChar)) {
				dupCharset.add(eachChar);
			}

		}

		Charset.removeAll(dupCharset);

		for (Character temp : Charset) {

			if(temp!=' ') {

				System.out.print(temp);
			}

		}



	}


}




