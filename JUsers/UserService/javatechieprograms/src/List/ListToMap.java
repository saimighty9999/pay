package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
		List<Emp>list=Arrays.asList(new Emp("sa", "gft", 33,55),
				new Emp("fdda", "fhf", 2, 677));
		System.out.println(list);
		
		
		
		// list to map
		
		java.util.Map<Integer,String> map=list.stream().collect(Collectors.toMap(Emp::getId,Emp::getDept));
		System.out.println(map);
		
		map.entrySet().forEach(e->System.out.println(e.getValue()+""+e.getKey()));
	}
}
