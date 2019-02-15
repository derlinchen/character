package character.part06;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import character.part06.bean.Person;

public class Interfaces {

	public static void main(String[] args) {
		// Predicate�ӿڣ�ֵ��һ�����������ص��Ǹ�boolean����
		Predicate<String> pre = (s) -> s.length() > 0;
		System.out.println(pre.test("ssss"));
		System.out.println(pre.negate().test("ssss"));

		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		System.out.println(nonNull.test(true));
		System.out.println(isNull.test(true));

		// Function�ӿڣ������е�һ��Ϊ�����ֵ���ڶ���Ϊ���ص�ֵ
		Function<String, Integer> toint = Integer::valueOf;
		System.out.println(toint.apply("1111"));
		Function<String, String> tostring = toint.andThen(String::valueOf);
		System.out.println(tostring.apply("121"));
		Function<Integer, String> int2string = String::valueOf;
		System.out.println(int2string.apply(111));

		// Supplier �ӿڷ���������ֵ
		Supplier<Person> personsupplier = Person::new;
		Person person = personsupplier.get();
		System.out.println(person.getFirstName());

		// Consumer�ӿڱ�ʾִ���ڵ��������ϵĲ�����
		Consumer<Person> greeter = (value) -> System.out.println("hello" + value.getFirstName());
		greeter.accept(new Person("����", "����"));

		// Comparator�ӿ�
		Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Person p1 = new Person("ali", "jack");
		Person p2 = new Person("tencent", "pony");
		System.out.println(comparator.compare(p1, p2));
		System.out.println(comparator.reversed().compare(p1, p2));

		// Optional�ӿ�
		Optional<String> optional = Optional.ofNullable("111");
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("fallback"));
		if(optional.isPresent()){
			System.out.println(optional.get());
		}
	}

}
