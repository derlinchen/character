package character.part05;

import character.part03.inter.Converter;

public class ScopeDemo {

	public static void main(String[] args) {
		// 访问外层局部变量
		final int num = 1;
		Converter<Integer, String> conv = (value)-> String.valueOf(value + num);
		System.out.println(conv.convert(2));
		
		
		// 默认使用了final进行修饰
		int count = 2;
		Converter<Integer, String> convert = (value)->String.valueOf(value + count);
		System.out.println(convert.convert(5));
		// 默认使用了final修饰，故不可对count进行修改
		//count = 2;
	}
	
}
