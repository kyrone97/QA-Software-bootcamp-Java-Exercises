
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

		// When given a String, print out this String in a vertical fashion in reverse order,
		//each word on a different line.

		
	}
	
	private static void StringDemo() {
		String str1 = "ThIsIsSoMeTeXt";
        String str2 = "thisissometext";

        // Converts text to lowercase
        System.out.println(str1.toLowerCase());// output will be: thisisometext

        // Converts text to UPPERCASE
        System.out.println(str1.toUpperCase()); // output will be: THISISSOMETEXT

        // Returns the character at the specified index
        System.out.println(str1.charAt(3)); // output will be: s

        // Returns the first position of the character specified.
        System.out.println(str1.indexOf("I")); // output will be: 2

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.startsWith("t")); // output will be: false

        // Returns true or false if the string ends with the specified character
        System.out.println(str1.endsWith("t")); // output will be: true

        // Returns true or false if the string contains the specified characters
        System.out.println(str1.contains("So")); // output will be: true

        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(str1.substring(1, 3)); // output will be: hIs

        // Checks if the values of two strings are the same:
        System.out.println(str1.equals(str2)); // output will be: false

        // Compares two strings ignoring case considerations:
        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true

        //Searches a string for a specified value and then replaces it with another value
        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt
	}
}
