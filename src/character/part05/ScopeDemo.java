package character.part05;

import character.part03.inter.Converter;

public class ScopeDemo {

	public static void main(String[] args) {
		// �������ֲ�����
		final int num = 1;
		Converter<Integer, String> conv = (value)-> String.valueOf(value + num);
		System.out.println(conv.convert(2));
		
		
		// Ĭ��ʹ����final��������
		int count = 2;
		Converter<Integer, String> convert = (value)->String.valueOf(value + count);
		System.out.println(convert.convert(5));
		// Ĭ��ʹ����final���Σ��ʲ��ɶ�count�����޸�
		//count = 2;
	}
	
}
