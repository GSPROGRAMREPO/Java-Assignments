// Gavin Swiger
// September 20, 2019
// Advanced Java
// Jeho Park


public class Driver {

	public static void main(String[] args) {
		//If you have array of numbers 1, 2, 3 
		//array of strings red, green and blue 
		//array of circles radius 3, 2.9 and 5.9
		Integer[] int_array = {1,2,3};
		String[] str_array = {"red", "green", "blue"};
		Double[] dbl_array = {3.0, 2.9, 5.9};
		
		//Calls method that "returns the maximum element in an array."
		System.out.println(max(int_array));
		System.out.println(max(str_array));
		System.out.println(max(dbl_array));
		
	}
	
	//Name of method requested per directions
	//Accepts any Array Type as a Generic Array called "list"
	public static <E extends Comparable<E>> E max (E [] list) {
		
		java.util.Arrays.sort(list);
		
		//Assigns and returns the last generic item in array as "max_in_array"
		E max_in_array = list[list.length-1];
		return max_in_array;
	}
}
