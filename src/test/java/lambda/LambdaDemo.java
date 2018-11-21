package test.java.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaDemo {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 34, 5, 3, 4, 5, 678, 99, 0);

		IntSummaryStatistics status = l.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println(status);

		List<String> fl = Arrays.asList("hell", "mama", "Java", "PHP", "", "mama");
		List<String> fl1 = fl.stream().sorted().distinct().sorted().filter(string -> !string.isEmpty()).sorted()
				.collect(Collectors.toList());
		System.out.println(fl1);
		List<Integer> fl2 = l.stream().distinct().filter(n -> n % 2 != 0).sorted().collect(Collectors.toList());
		System.out.println(fl2);

		List<Integer> ln = l.stream().map(n -> n + 1).distinct().sorted().collect(Collectors.toList());
		System.out.println(ln);

		List<Integer> ln1 = l.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ln1);

		// HashMap<String, Integer> hm=fl.stream().findAny()

		Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
		Set<Integer> allItems = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(numbers).filter(n -> !allItems.add(n)) // Set.add()
																						// returns
																						// false
																						// if
																						// the
																						// item
																						// was
																						// already
																						// in
																						// the
																						// set.
				.collect(Collectors.toSet());
		System.out.println(duplicates); // [1, 4]

		List<Integer> d = Arrays.asList(numbers);

		Set<Integer> s = d.stream().filter(n -> !allItems.add(n)).collect(Collectors.toSet());

		System.out.println(s);

		// Duplicate count

		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 34, 5, 3, 4, 5, 678, 99, 0);

		// numbers1.stream().filter(i -> Collections.frequency(numbers1, i) >1)
		// .map(numbers1.stream().filter(i -> ))
		// .collect(Collectors.toSet()).forEach(System.out::println);
		HashMap<Integer, Integer> hd = new HashMap<>();
		int value = 1;
	/*	for (int i : numbers1) {
			if (hd.containsKey(i)) {
				hd.put(i, value + 1);
			} else {
				hd.put(i, value);
			}
		}*/
		// System.out.println(hd);

		numbers1.stream().map(i -> hd.put(i, value + 1));

		
	//	numbers1.stream().map( System.out::println);

		// numbers1.stream().filter(i -> !hd.containsKey(i)).map(i -> hd.put(i, value)).collect(Collectors.toCollection(null));
		System.out.println(hd);
	}
}
