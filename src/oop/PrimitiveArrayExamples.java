package oop;


public class PrimitiveArrayExamples {

	public static void main(String[] args) {
		// 1. Create an empty array of String
		// By default, array stores 5 names
		String[] names = new String[5];
		
		// 2. Show the total number of items in array
		System.out.println("Total number of items in array: ");
		// @TODO: Write code to output total num items to array
		System.out.println(names.length);
		System.out.println("----------");
		
		// 3. Add something to array
		names[0] = "Jenelle";
		// @TODO: Write code to add someone to position 3
		names[3] = "harman";
		// 4. Output the item in position 0
		System.out.println("Name in pos 0:");
		// @TODO: Write the code to output the the name in pos 0
		System.out.println(names[0]);
		System.out.println("----------");
		
		
		// 5. Output everything in array
		System.out.println("Everything in array: ");
		// @TODO: Write code to output everything
		for(int i =0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		
		
		
		
				
		// 6. Add something to the end of the array
		try{
		names[7] = "Emad";
		// @TODO:  Write code to output names[7] to screen
		System.out.println(names[7]);
		}
		catch(Exception e){
			System.out.println("anni dea mjak e");
			System.out.println(e.toString());
		}
		// 7. Remove someone from the array
		// @TODO: Fill in code here
		names[3]=null;
		for(int i =0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		// 8. Loop through every item in the array and output:
		// HELLO _______ (where ___ is the name)
		names[1] = "Emad";
		names[2] = "Ema";
		names[3] = "Em";
		for(int i =0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		// 9. Shift everyone by 1 position
		// @TODO: Fill in code here
		
		
		
		
	}
}

