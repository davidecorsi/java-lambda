import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		// inner class
		Function<Integer, String> function1 = new Function<Integer, String>() {
			@Override
			public String apply(Integer integer) {
				return String.valueOf(integer);
			}
			
		};
		String s = function1.apply(10);
		
		// lambda
		Function<Integer, String> function2 = (integer) -> {
			return String.valueOf(integer);
		};
		
		// riduzione
		Function<Integer, String> function3 = integer -> String.valueOf(integer);
		
		Consumer<String> function4 = s1 -> System.out.println(s1);
		
		BiFunction<String, String, String> function5 = (s3, s4) -> s3 + " " + s4;
		
		Predicate<String> function6 = s5 -> s5 != null;
		
		System.out.println(function6.test("pippo"));
	}
}
