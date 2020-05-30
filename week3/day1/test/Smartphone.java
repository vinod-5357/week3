package week3.day1.test;

import week3.day1.classroom1.Androidphone;

public class Smartphone extends Androidphone {
	
	public void Connectwhats() {
		
System.out.println("Conneted to whatsapp");
	}
	
	public static void main(String[] args) {
		

		
		Smartphone obj= new Smartphone();
		
		obj.SaveContact();
		obj.SendMessgae();
		obj.Takevideo();
		obj.Makecall();
		obj.Connectwhats();
		
	}

}
