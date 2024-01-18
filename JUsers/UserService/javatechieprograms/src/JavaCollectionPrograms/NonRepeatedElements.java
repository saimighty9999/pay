package JavaCollectionPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //first non repeated elements

		String a = "ILoveMyMotherI";

		String nonRepea = Arrays.stream(a.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(q -> q.getValue() == 1)
				.findFirst().get().getKey();
		System.out.println(nonRepea);	
		
		
	   // first repeated elements
		
		String ee="hfdhsbvdkjfbjvkdn";
		
		String repeatedelm=Arrays.stream(ee.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
				                                      .entrySet().stream()
				                                      .filter(z -> z.getValue()>1)//equals to one difference greaterthan one 
				                                      .findFirst().get().getKey();
		            System.out.println(repeatedelm);

	}

}
