
public class OperatorsExample {

	public static void main(String[] args) {
		System.out.println(Add(5, 5));
		System.out.println(Multiply(5, 5));
		System.out.println(Divide(10, 5));
		Exam(150, 150, 150);

	}
// Create a method that accepts two integers as input, then returns an integer
// that is the sum of these two parameters. (Addition)

	private static int Add(int numOne, int numTwo) {
		return numOne + numTwo;
	}
//Multiplication - which takes two numbers and returns the product.

	private static int Multiply(int numOne, int numTwo) {
		return numOne * numTwo;
	}
//Division - which takes two numbers, then returns the result of the division.

	private static double Divide(double numOne, double numTwo) {
		return numOne / numTwo;
	}

	public static void Exam(int numOne,int numTwo, int numThree) {
		String myStr = "PHYSICS Mark out of 150 = ";
		String myStr1 = "CHEMISTRY Mark out of 150 = ";
		String myStr2 = "BIOLOGY Mark out of 150 = ";
		String myStr3 = "Overall all percentage = ";
		String myStr4 = "%";
		int Total = numOne + numTwo + numThree;
		System.out.println(myStr + numOne);
		System.out.println(myStr1 + numTwo);
		System.out.println(myStr2 + numThree);
		System.out.println(myStr3 + ((Total*100)/450) + myStr4);


	}

}
