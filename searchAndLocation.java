package com.practice.all;

public class searchAndLocation {
	
	public searchAndLocation(boolean presence, int location){
		if(presence!=false && location != 1){
		System.out.println("Your number present or not - :" +presence );
		System.out.println("Your desired number found at :"+location);
		}
		else
		{
			System.out.println("Your number is not present");
			System.out.println("Your desired number location can't be found");
		}
		
	}
}
