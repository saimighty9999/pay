package JavaCollectionPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find all duplicate in a given Siring//

		String s1 = "ILOVEMYFATHERA";
		List<String> duplicateElements = Arrays.stream(s1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(s2 -> s2.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElements);

		// find all Unique in a given Siring//

		String s3 = "I LOVE INDIA";

		List<String> unique = Arrays.stream(s3.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(a -> a.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(unique);
		
		
		

	}

}
