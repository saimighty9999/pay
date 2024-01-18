package JavaCollectionPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterInaString {

	public static void main(String[] args) {

		// To count the occurrence of each character's in a String//

		String s = "ILOVEINDIA";

		Map<String, List<String>> Charactermap = Arrays.stream(s.split("")).collect(Collectors.groupingBy(S -> s));
		System.out.println(Charactermap);

		Map<String, Long> Charactermap1 = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(Charactermap1);

	}

}
