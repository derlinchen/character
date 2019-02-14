package character.part03;

import character.part03.inter.Converter;

public class FunctionDemo {

	public static void main(String[] args) {
		// lambda���ʽΪ�Գ��󷽷���ʵ��
		Converter<String, Integer> conv = (from)->Integer.valueOf(from);
		Integer converted = conv.convert("12");
		System.out.println(converted);
		System.out.println(conv.int2String(12222));
	}
	
}
