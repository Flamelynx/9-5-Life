package com.github.killakilla4k.9-5-Life-Clock-in-and-Out-Breaks;

public class tuna {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		
		//hours check
		if (h >=0 && h<24) {
			hour = h;
		}
		else {
			System.out.println("That is not a valid time!");
			System.exit(0);
		}
		
		//minutes now
		if (m >=0 && m<60) {
			minute = m;
		}
		else {
			System.out.println("That is not a valid time!");
			System.exit(0);
		}	
		
		//seconds now
		if (s >=0 && s<60) {
			second = s;
		}
		else {
			System.out.println("That is not a valid time!");
			System.exit(0);
		}		
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
		
	}
	
	
	
}
