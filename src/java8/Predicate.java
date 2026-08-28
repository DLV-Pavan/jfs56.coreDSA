package java8;
import java.util.*;
import java.util.function.Function;
public class Predicate {
	public static void main(String[] args) {
		Predicate<Integer> p = x->x%2==0;
		System.out.println(p.test(12));
		System.out.println(p.test(67));
		System.out.println(p.test(78));
		System.out.println(p.test(90));
		
		String[] names = {"devasena","bahubali","keer","kattapa","kalyan"};
		Predicate<String> p1 = s.length()>6;
		for(String st:names)
		{
			if(p1.test(st))
			{
				System.out.println(st);
			}
		}
		
		Function<Integer,Integer> f1 = i->i*i;
		System.out.println(f1.apply(2));
		System.out.println(f1.apply(12));
		System.out.println(f1.apply(22));
		System.out.println(f1.apply(32));
		
		Function<String,Integer> f2 = s->s.length();
		System.out.println(f2.apply("pavan"));
		System.out.println(f2.apply("venkat"));
		System.out.println(f2.apply("balla"));

		Function<String,String> f3 = str->str.toUpperCase();
		System.out.println(f3.apply("devasena"));
		System.out.println(f3.apply("lalith"));
		System.out.println(f3.apply("raj"));
		
		Consumer<String> co = c->System.out.println(c);
		co.accept("lalith");
		co.accept("venkat");
		co.accept("pavan");
		
		Supplier<Date> s1 = ()->new Date();
		System.out.println(s1.get());
		
		Supplier<String> s2 = ()->{
			String otp="";
			for(int i = 0;i<5;i++) {
				
			}
		}

	}
}
