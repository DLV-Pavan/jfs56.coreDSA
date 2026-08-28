package DSA;

import java.util.*;

public class list {
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(12,89,37,20,47,28,12);
	List<String> names = Arrays.asList("keerthi","suresh","pavan");
	numbers.stream()
	.map(l->l*2).
	forEach(System.out::println);
	long failedStudents = numbers.stream()
	.filter(marks->marks<40)
	.count();
	System.out.println(failedStudents);
	
	names.stream()
	.sorted()
	.forEach(System.out::println);
	names.stream()
	.sorted(Comparator.reverseOrder())
	.forEach(System.out::println);
	
	
	numbers.stream()
		   .filter(n->n%2==0)
		   .distinct()
		   .forEach(System.out::println);
	
	numbers.stream()
	.limit(3)
	.forEach(System.out::println);
	numbers.stream()
	.skip(3)
	.forEach(System.out::println);
	
	Integer maxValue = numbers.stream()
	.min((i1,i2)->i1
	.compareTo(i2))
	.get();
	
	System.out.println(maxValue);
	Integer minValue = numbers.stream()
	.min((i1,i2)->i1.compareTo(i2))
	.get();
	System.out.println(minValue);


}
}
