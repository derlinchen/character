package character.part03.inter;

// �ӿڣ���Ĭ�Ϸ����⣬����ֻ��һ�����󷽷�
@FunctionalInterface
public interface Converter<F, T> {
	T convert(F from);
	
	default String int2String(int value){
		return String.valueOf(value);
	}
}
