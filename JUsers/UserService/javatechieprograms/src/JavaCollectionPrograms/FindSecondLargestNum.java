package JavaCollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class FindSecondLargestNum {

	public static void main(String[] args) {

		// sorting order
		int arr[] = { 1, 2, 3, 4, 5, 6, 21, 11, 39, 10, 10, 30, 1, 1, 2, 2, 2 };

		List<Integer> sort = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		System.out.println("sorting order" + sort);

		// reverse order

		List<Integer> sort1 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.collect(Collectors.toList());
		System.out.println("reverse order" + sort1);

		// find second HighestNumber

		System.out.println("find second HighestNumber");
		Integer sec = Arrays.stream(arr).boxed().sorted().skip(3).findFirst().get();
		System.out.println(sec);

		// unique elements

		List<Integer> unique = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		System.out.println("Unique elements " + unique);

		// duplicate elements

		List<Integer> duplicateele = Arrays.asList(1, 2, 3, 4, 5, 6, 21, 11, 39, 10, 10, 30, 1, 1, 2, 2, 2);

		Set<Integer> set = new HashSet<>();
		duplicateele.stream().filter(v -> !set.add(v)).forEach(System.out::println);

		// fina all elements from array who starts with 1 or 2
        System.out.println("fina all elements from array who starts with 1 or 2");
		List<String> collect = Arrays.stream(arr).boxed().map(f -> f + "").filter(d -> d.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println("starts with 2:" + collect);

		// string join method
         System.out.println("string join method");
		List<String> asList = Arrays.asList("1", "2", "3", "4", "5");

		String join = String.join(",", asList);
		System.out.println(join);

		
		// limit and skip
		
		IntStream.rangeClosed(1, 10)
		.skip(1)
		.limit(3)
		.forEach(System.out::println);
		
		
		
		// duplicate values
		
		List<Integer>list=new ArrayList<>();
		Collections.addAll(list, 1,2,3,3,4,4,5,6,6,7,8,9);
		Set<Integer> set1=new HashSet<>();
		                    List<Integer> duplictevalue = list.stream().filter(d->!set1.add(d))
		                    .collect(Collectors.toList());
		                    System.out.println(duplictevalue);
		      
		
		
		
	}

}
