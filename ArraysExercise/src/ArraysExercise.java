
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysExercise {

	public static void main(String[] args) {

		// forArray();
		arrayList();

		// TODO Auto-generated method stub
		// initialise empty array of longs that can store up to 10 values

		long[] ageArray = new long[10];

		// assign value to ageArray at index 2
		ageArray[2] = 16;
		// assign value to ageArray at index 5
		ageArray[5] = 17;

		ageArray[0] = 10;
		ageArray[1] = 12;
		ageArray[3] = 6;
		ageArray[4] = 10;
		ageArray[6] = 15;
		ageArray[7] = 20;
		ageArray[8] = 30;
		ageArray[9] = 31;

		// use for-each loop to print out all values to console

		for (long i : ageArray) {
			// System.out.print(i + " ");
		}

		// create multi-dimensional array that can store up to three arrays of three
		// values

		int[][] multiArray = new int[3][3];

		// assign values to multiArray at index [2][0]
		multiArray[2][0] = 10;

	}

	// Create a for loop that populates an integer array with values, outputting
	// them at each iteration.
	public static void forArray() {
		int[] ageArray = new int[20];
		for (int i = 0; i < 20; i++) {
			ageArray[i] = i + 1;
			System.out.print(ageArray[i] + " ");

		}

	}

	private static void arrayList() {
		// create a new ArrayList
		List<String> names = new ArrayList<>();
		// add() several elements
		names.add("Mike");
		names.add("Mark");
		names.add("Kyrone");
		names.add("Jack");
		names.add("Aceu");
		names.add("Syndicate");
		names.add("Jenny");
		// print out array
		System.out.println(names);
		// get() specific elements
		System.out.println(names.get(0));
		System.out.println(names.get(3));
		// set() different elements
		names.set(0, "Tony");
		names.set(1, "Sony");
		// remove() elements
		names.remove(6);

		// iterate through the ArrayList and print out each element (with both normal
		// and enhanced for-loops)
		for (String Students : names) {
			System.out.print(Students + " ");
		}

		// sort() the ArrayList (try this with several object types)
		Collections.sort(names);
		System.out.println("");
		System.out.println(names);

		// reverse
		Collections.reverse(names);
		System.out.println(names);

		//swap
		Collections.swap(names,0,5);
		System.out.println(names);


	}

}
