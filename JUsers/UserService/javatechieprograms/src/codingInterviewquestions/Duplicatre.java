package codingInterviewquestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Duplicatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 2, 3, 3, 4, 5, 5, 6 };
		int arr2[] = { 1, 3, 4, 5, 77 };
		printIntersection(arr1, arr2);

		printUnion(arr1, arr2);

	}

	static void printUnion(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);

		}
		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);

		}
		System.out.println("union");
		System.out.println(s);

	}

	static void printIntersection(int arr1[], int arr2[]) {

		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);

		}
		System.out.println("interSection");

		for (int i = 0; i < arr2.length; i++) {
			if (s.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}

		}

	}

}
