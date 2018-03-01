package com.practice.all;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = new int[]{10,20,30,40,50,60,70};
		LinearSearch ls = new LinearSearch();
		System.out.println("-----Original array----");
		ls.printArray(arr);
		System.out.println("---Searching begains now--------");
		ls.search(333, arr);
	}
	
	public void printArray(int[] array){
		for(int i=0; i<=array.length-1; i++)
			System.out.println(array[i]);
	}
	
	public searchAndLocation search(int toSearched, int[] array){
		for(int i=0; i<=array.length-1; i++){
			if(toSearched==array[i])
				return new searchAndLocation(true, i);
		}
		return new searchAndLocation(false,0);
	}
}
