
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Concatenate both values, capitalise both strings and print out the result.
		// The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		System.out.println(str1.toUpperCase() + ", " + str2.toUpperCase());

		// Now use the substring method to print out: `TODAY IT IS RAINING`
		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);

		// When given a String, count and return how many words there are in that
		// String.
		int stringLength = str1.length();
		System.out.println("string legnth is " + stringLength);

		// When given a String, print out this String in a vertical fashion, each word
		// on a different line.
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		// When given a String, print out this String in a vertical fashion, each word
		// on a different line.

	}
}
