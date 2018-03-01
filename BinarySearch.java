package com.practice.all;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] intArray = new int[]{1,5,10,13,17,19,21};
		int length = intArray.length;
		BinarySearch bs = new BinarySearch();
		bs.printArray(intArray);
		int result = bs.binarySearch(intArray , 0, length-1, 19);
		if(result == 0){
			System.err.println("Number not found-----");
		}
		else{
			System.out.println("Number found at position :"+result);
		}
	}
	
	public void printArray(int[] array){
		for(int i=0; i<=array.length-1; i++)
			System.out.println(array[i]);
	}
	
	public int binarySearch(int[] array, int left, int right, int numberToBeFound){
		
		if(right>=left){
			
			int middle = left+(right-1)/2;
			if(array[middle]== numberToBeFound)
				return middle;
			
			if(array[middle]> numberToBeFound){    // Will make sure that number to be found is at left side  
				return binarySearch(array, left, middle-1, numberToBeFound);
			}  
			
				return binarySearch(array, middle+1, right, numberToBeFound);
		}
		return 0;
		
	}
	
	

}
