package CollectionsbyUSingMap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {

		// List of Empolyees

		List<Empolyee> list = Arrays.asList(new Empolyee("A", 1, 25), new Empolyee("d", 2, 29),
				new Empolyee("c", 3, 25), new Empolyee("b", 4, 26), new Empolyee("e", 5, 21), new Empolyee("f", 6, 24));
		System.out.println("employeelist" + list);

		// list into map

		// key:empid , value:name

		java.util.Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(Empolyee::getEmpid, Empolyee::getName));

		System.out.println(map);

		// sort Map Natural Sorting order

		java.util.Map<Integer, String> mapsorting = new LinkedHashMap<>();
		map.entrySet().stream().sorted(java.util.Map.Entry.comparingByKey())
				.forEachOrdered(e -> mapsorting.put(e.getKey(), e.getValue()));
		System.out.println(mapsorting);

		// sort Map Revere order

		java.util.Map<Integer, String> reversorderMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(java.util.Map.Entry.<Integer, String>comparingByValue().reversed())
				.forEachOrdered(es -> reversorderMap.put(es.getKey(), es.getValue()));
		System.out.println(reversorderMap);

		// toMap sortingorder

		java.util.Map<Integer, String> fmap = map.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue())
				.collect(Collectors.toMap(java.util.Map.Entry::getKey, java.util.Map.Entry::getValue,
						(oldvalue, newvalue) -> oldvalue, LinkedHashMap::new));
		System.out.println(fmap);

	}

}
