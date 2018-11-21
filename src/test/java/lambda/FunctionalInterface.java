package test.java.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7, 8, 0);
		List<String> ls = Arrays.asList("hell", "mama", "Java", "PHP", "");

		Map<Integer, String> st = new HashMap<Integer, String>();

		List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = l.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

		Random r = new Random();
		IntStream a = r.ints().limit(3);
		int[] a1 = a.toArray();
		// .forEach(System.out::println);
		// r.ints(1, 0, 10).forEach(System.out::println);
		a.forEach(System.out::println);

		// List<Integer> newList =ls.stream().filter(n ->
		// n.isEmpty()).collect(Collector<T, A, R>);
		List<String> filtered = ls.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		List<Integer> ln = l.stream().map(n -> n).distinct().sorted().collect(Collectors.toList());

		System.out.println("LLLLLLnnn" + ln);
		filtered.get(3);

		// int kk= ls.stream().forEach(s -> s.isEmpty()).count();
		long count = ls.stream().filter(string -> !string.isEmpty()).count();
		// System.out.println("Count:"+count);

		l.forEach(k -> {
			int f = k + 1;
			// System.out.println(f);

		});
		l.forEach(n -> {
			if (n.equals(3)) {
				System.out.println("Hello Mani");
			} else {
				// System.out.println(n);
			}
		});

		Predicate<Integer> p = n -> true;

		// evnl(l,n->true);

	}

}
