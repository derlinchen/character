package character.part04;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import character.part03.inter.Converter;
import character.part04.bean.Person;
import character.part04.inter.PersonFactory;
import character.part04.inter.StartWith;

public class FunctionDemo {

	public static void main(String[] args) {
		// 静态方法引用，类似(value)->Integer.valueOf(value);
		Converter<String, Integer> conv = Integer::valueOf;
		Integer converted = conv.convert("12");
		System.out.println(converted);
		// 对象方法引用
		String msg = "abcde";
		StartWith<String, Boolean> startswith = msg::startsWith;
		System.out.println(startswith.startswith("a"));
		
		// 构造器引用
		PersonFactory<Person> factory = Person::new;
		Person person = factory.create("sss", "ddd");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		
		
		Map<String, String> map = new HashMap<String, String>();
		Map<String,String> cmap = new ConcurrentHashMap<String,String>();
	}
	
}
