package java.v.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<String> ls = Arrays.asList("hell", "mama", "Java", "PHP", "");
		// List<Integer> newList =ls.stream().filter(n ->
		// n.isEmpty()).collect(Collector<T, A, R>);
		List<String> filtered = ls.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println(filtered);

		l.forEach(k -> {
			int f = k + 1;
			System.out.println(f);

		});
		l.forEach(n -> {
			if (n.equals(3)) {
				System.out.println("Hello Mani");
			}
		});

		Predicate<Integer> p = n -> true;

		// evnl(l,n->true);

	}

}
