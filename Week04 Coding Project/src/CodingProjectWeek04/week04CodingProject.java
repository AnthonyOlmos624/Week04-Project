package CodingProjectWeek04;

public class week04CodingProject {

	public static void main(String[] args) {
		/*1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		*/
				int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};  
				
		/*a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.	
		 */
			int result = ages[ages.length - 1] - ages[0];
			System.out.println("Result of subtraction: " + result);
				
		/*b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		i. Make sure that there are 9 elements of type int in this new array.
		*/
			int[] ages2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
				
			
		/*ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		*/
			int result2 = ages2[ages2.length - 1] - ages2[0]; 
			System.out.println("Result of subtraction for ages2: " + result2);
			
		/*c. Use a loop to iterate through the array and calculate the average age. Print the result to the console
		*/
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i];
			}
			
			double average = (double) sum / ages.length;
			System.out.println("Average age: " + average);

		/*2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		*/
			String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
		/*a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console
		*/
			int totalLetters = 0;
			for (String name : names) {
				totalLetters += name.length(); 
			}
			double averageLetters = (double) totalLetters / names.length;
			System.out.println("Average number of letters per name: " + averageLetters);
			
		/*b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		*/
			StringBuilder concatenatedNames = new StringBuilder();
			for (String name : names) {
				concatenatedNames.append(name).append(" ");
			}
			System.out.println("Concatenated names: " +       concatenatedNames.toString().trim());
			
		/*3. How do you access the last element of any array?
		*/
			System.out.println("Last elment of any array: array[array.length - 1]");
			
			
		/*4. How do you access the first element of any array?
		*/
			System.out.println("First element of any array: array[0]");
			
		/*5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		*/
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			
		/*6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		*/
			int sumOfLengths = 0;
			for (int length : nameLengths) {
				sumOfLengths += length;
			}
			System.out.println("Sum of all name lengths: " + sumOfLengths);
			
		/*7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		*/
			System.out.println(repeatWord("Hello", 3));
			
			
		/*8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		*/
			System.out.println(getFullName("Anthony", "Olmos"));
			
			
			
		/*9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		*/
			int[] numbers = {30, 40, 50};
				System.out.println("Is the sum greater than 100? " + isSumGreaterThan100(numbers));
			
		/*10. Write a method that takes an array of double and returns the average of all the elements in the array.
		*/
			double[] doubles = {1.5, 2.5, 3.5};
			System.out.println("Average of doubles: " + calculateAverage(doubles));
				
		/*11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		*/
			double[] array1 = {1.5, 2.5, 3.5};
			double[] array2 = {1.0, 2.0, 3.0};
			System.out.println("Is the first array's average greater? " + isFirstAverageGreater(array1, array2));
		 	
		/*12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		*/
			System.out.println("Will buy a drink? " + willBuyDrink(true, 15.0));
					
		/*13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		*/
			//This method checks if a person is eligible for a discount based on 	   	 their age and whether they are a student.
			 	
			 //A person is eligible if they are under 30 or a student.
			//PARAM age - the age of the person.
			//PARAM isStudent - Whether the person is a student.
			//RETURN True if the person is eligible for a discount, otherwise false. 
			
			System.out.println("Is eligible for discount? " + isEligibleForDiscount(25, true));
			
			//7) closing for the repeatWord method
			}
			public static String repeatWord(String word, int n) {
				StringBuilder result = new StringBuilder();
				for (int i = 0; i < n; i++) {
					result.append(word);
				}
				return result.toString();
			}
			//8) closing for the getFullName method
			public static String getFullName(String firstName, String lastName) {
				return firstName + " " + lastName; 
			}
			//9) closing for sum of array is greater than 100
			public static boolean isSumGreaterThan100(int[] array) {
				int sum = 0;
				for (int num : array) {
					sum += num;
				}
				return sum > 100; 
			}
			//10) method to calculate average of an array of doubles
			public static double calculateAverage(double[] array) {
				double sum = 0;
				for (double num : array) {
					sum += num;
				}
				return sum / array.length; 
			}
			//11) Method to compare averages of two arrays
			public static boolean isFirstAverageGreater(double[]array1, double[]array2) {
				double average1 = calculateAverage(array1);
				double average2 = calculateAverage(array2);
				return average1 > average2;
			}
			//12) Method to determine if a drink should be bought
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				return isHotOutside && moneyInPocket > 10.50;
	}
			//13) checks eligibility for a discount
			public static boolean isEligibleForDiscount(int age, boolean isStudent) {
				return age < 30 || isStudent;
			}

}
