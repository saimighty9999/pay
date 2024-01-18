package CollectionsbyUSingMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FMapAndFlatmap {

	public static void main(String[] args) {

		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 3, 5));
		list.add(Arrays.asList(2, 4, 6, 8, 0));
		list.add(Arrays.asList(1, 3, 5, 7, 9, 11));

		System.out.println("Odd numbers :" + "Even numbers :" + "Prime Numbers :" + list);

		List<Integer> flatMap = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

		System.out.println("flatmap" + flatMap);

		// Map

		
		List<String>li=new ArrayList<>();
		
		li.add("fruits");
		li.add("orange");
		li.add("grapes");
		li.add("Bananas");
		
		System.out.println(li+"list of fruits");
		
		   List<Integer> collect = li.stream().map(l->l.lastIndexOf("a")).collect(Collectors.toList());
		   System.out.println(collect);
		   
		
		
//		Difference Between map() and flatmap()
//
//        map()	                                           flatMap()
//The function passed to map() operation returns a single value for a single input.	
//The function you pass to flatmap() operation returns an arbitrary number of values as the output.
//One-to-one mapping occurs in map().	
//One-to-many mapping occurs in flatMap().
//Only perform the mapping.
//Perform mapping as well as flattening.
//Produce a stream of value.
//Produce a stream of stream value.
//map() is used only for transformation.
//flatMap() is used both for transformation and mapping

	}

}
