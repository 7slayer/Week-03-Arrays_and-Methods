package arraysAndMethods;

import java.util.Arrays;
import java.util.Scanner;

public class method {

	public static void main(String args[]) {
		//Declare all the variables used in my program
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//Creating a new variable to add a random age to the original age array
		int[] newAges = addAge(ages);
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		//Using a method to create an integer array of the name lengths
		int[] nameLengths = nameLength(names);
		Scanner in = new Scanner(System.in);
		String inputWord = "";
		int inputNumber = 0;
		String inputFirstName = "";
		String inputLastName = "";
		boolean randomBoolean = randomBoolean();
		double inputMoney = 0.0;
		
		//Prints the numerical difference from the fist and last number in the array
		System.out.println("Age diffrence of static int array: " + ageDiffrence(ages));
		
		//Shows that my code for calculating age difference is dynamic since this array has an added element
		System.out.println("Age diffrence of static and random int array: " + ageDiffrence(newAges));
		
		//Prints result of the method used to calculate the average of an array
		System.out.println("Average age of static int array: " + averageAge(ages));
		
		//Prints the result of the method used to calculate the average of an array with a random value added
		System.out.println("Average age of static and random int array: " + averageAge(newAges));
		
		System.out.println("Average length of static String array: " + nameAvLength(names));
		
		System.out.println("Concatination of static String array: " + nameConcat(names));
		
		System.out.println("Sum Total of all the name Lengths: " + nameLengthSum(nameLengths));
		
		/* 3. How do you access the Last element of any array?
		 * 		array[array.length - 1]
		 * 
		 * 4. How do you access the first element of any array? 
		 * 		array[0]
		 */
		
		System.out.println("Input in a Word you want Repeated");
		inputWord = in.next();
		
		
		System.out.println("Input the amount of times you want the word to repeat");
		inputNumber = in.nextInt();
		
		System.out.println("Your input repeated: " + inputRepeat(inputWord, inputNumber));
		
		System.out.println("Input a first name");
		inputFirstName = in.next();
		
		System.out.println("Input a last name");
		inputLastName = in.next();
		
		System.out.println("Your first and last name put together: " + fullName(inputFirstName, inputLastName));
		
		System.out.println("How much money do you have in your pocket?");
		inputMoney = in.nextDouble();
		
		if (willBuyDrink(randomBoolean, inputMoney) == true) {
			System.out.println("Its hot outside and you have " + inputMoney + " in your pocket so you get a drink.");
		} else if(randomBoolean == false && inputMoney > 10.50) {
			System.out.println("You have " + inputMoney + " in your pocket but its not very warm, a drink isnt a good idea");
		} else {
			System.out.println("It's blazing outside but you only have " + inputMoney + " so much for a drink");
		}
		
		in.close();
	}
	
	static int ageDiffrence(int[] ages) {
		// Subtracts the last value of an array by the first value of an array
		int value1 = ages[0];
		int value2 = ages[ages.length - 1];
		
		int ageDif = value2 - value1;
		
		return ageDif;
	}
	
	static int[] addAge(int[] oldAges) {
		//created this method to add a random age to an array. This way instead of hard coding an additional
		// value to the ages array a new array can be created with a random number added
		double randomNum = Math.random() * 100;
		int oldLength = oldAges.length;
		int newLength = oldLength + 1;
		int[] newAges = new int[newLength];
		int newAge = (int)randomNum;
		
		for (int count = 0; count < oldAges.length; count++) {
			newAges[count] = oldAges[count];
			
		}
		
		newAges[newAges.length - 1] = newAge;

		return newAges;
		
	}
	
	static int averageAge(int[] ages) {
		// Calculates the average number within an array
		int totalAge = 0;
		int averageAge = 0;
		for (int i = 0; i < ages.length; i++) {
			totalAge += ages[i];
		}
		
		averageAge = totalAge / ages.length;
		
		return averageAge;
	}
	
	static int nameAvLength(String[] names) {
		// Calculates the average number within an array
		int nameLength = 0;
		int averageLength = 0;
		for (String i : names) {
			nameLength += i.length();
		}
		
		averageLength = nameLength / names.length;
		
		return averageLength;
	}
	
	static String nameConcat(String[] names) {
		// adds all elements in a String array to a single String
		String allNames = "";
		
		for(String i : names) {
			allNames += i + " ";
		}
		
		return allNames;
	}
	
	static int[] nameLength(String[] names) {
		//creates an Int array based on the length of the stings in a String array
		int[] nameLength = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLength[i] = names[i].length();
		}
		
		return nameLength;
	}
	
	static int nameLengthSum(int[] nameLength) {
		// Adds all the numbers within an array
		int nameLengthSum = 0;
		
		for (int i : nameLength) {
			nameLengthSum += i;
		}
		
		return nameLengthSum;
	}
	
	static String inputRepeat(String word, int n) {
		//Takes in a String and Int in order to repeat the String a specified amount of times
		String repeatedWord = "";
		for (int count = 0; count < n; count++) {
			repeatedWord += word;
		}
		
		return repeatedWord;
		
	}
	
	static String fullName(String firstName, String lastName) {
		//Method takes two strings and adds them together into one
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	
	static boolean randomBoolean() {
		// I created this method to randomly see if its hot outside
		double randomNum = Math.random() * 100;
		
		if (randomNum <= 50.00) {
			return false;
		} else {
			return true;
		}
	}
	
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//Method will tell me if I can buy a drink by seeing if it is hot outside and if I have more than 10.50
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
}
