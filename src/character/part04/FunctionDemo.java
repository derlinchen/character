package character.part04;

import character.part03.inter.Converter;
import character.part04.bean.Person;
import character.part04.inter.PersonFactory;
import character.part04.inter.StartWith;

public class FunctionDemo {

	public static void main(String[] args) {
		
		// ��̬�������ã�����(value)->Integer.valueOf(value);
		Converter<String, Integer> conv = Integer::valueOf;
		Integer converted = conv.convert("12");
		System.out.println(converted);
		
		// ���󷽷�����
		String msg = "abcde";
		StartWith<String, Boolean> startswith = msg::startsWith;
		System.out.println(startswith.startswith("a"));
		
		
		// ����������
		PersonFactory<Person> factory = Person::new;
		Person person = factory.create("sss", "ddd");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
	}
	
}
