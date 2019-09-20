import java.util.*; 

public class Algorithms {
	
	private static int list_length = 3;

	public static void main(String[] args) {

        // Create an arrayList
        ArrayList<String> arrL = new ArrayList<String>(); 
        arrL = add_array_elements(arrL);
        
        output(arrL, "List Contains");
        
        //Reverse(using Collection method) and display the list
        Collections.sort(arrL, Collections.reverseOrder());
        
        output(arrL, "After Calling Reverse, List Contains:");
        
        //Create copy list((using Collection method)) from an array of the three Characters
        ArrayList<String> arrL_copy = new ArrayList<String>(3);
        initialize_list(arrL_copy);
        //Copy the contents of list((using Collection method)) in step one into copy list of the step three.
        Collections.copy(arrL_copy, arrL);
        
        output(arrL_copy, "After Copying, CopyList Contains:");
        
        //Fill list((using Collection method) with letter R
        Collections.fill(arrL, "R");
        
        output(arrL, "After Calling Fill, List Contains:");
		
	}
	
	
	public static ArrayList<String> add_array_elements(ArrayList<String> arrL) {
	    //Use try & catch to trap errors
		try { 
			Scanner scanner_in = new Scanner(System.in);
	        // Add elements to ArrayList    
	        for (int counter = 0; counter < list_length; counter++) {
	            
	            System.out.print("Enter a Character:");  
	            String input = scanner_in.nextLine();
	            arrL.add(input);
        	}
	        scanner_in.close();
	    }catch (NoSuchElementException e) { 
	            System.out.println("Exception thrown : " + e); 
	        } 

        return arrL;
	}
	
	//If you do not initialize list you will receive a capacity error when trying to use copy method.
	public static ArrayList<String> initialize_list(ArrayList<String> arrL) {

        for (int counter = 0; counter < list_length; counter++) {  
            arrL.add(counter, "O");
        } 
        return arrL;
	}
	
	//Create a method named output and display at it shown below
	public static void output(ArrayList<String> arrL, String output_title) {

    	System.out.println("");
    	System.out.println(output_title);
    	System.out.println(arrL);
    	System.out.println("Max:" + Collections.max(arrL) + "  Min:" + Collections.min(arrL));

	}
	
}
