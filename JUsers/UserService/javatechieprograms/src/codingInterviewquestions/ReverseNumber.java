package codingInterviewquestions;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 1234;

//		int reverse;   4321
//
//		StringBuilder ss = new StringBuilder(String.valueOf(number));
//		ss.reverse();
//		System.out.println(ss.toString());
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;

			reverse = reverse * 10 + remainder;

			number = number / 10;

		}
		System.out.println(reverse);

	}

}
