package character.part04.inter;

// �ӿڣ���Ĭ�Ϸ����⣬����ֻ��һ�����󷽷�
@FunctionalInterface
public interface StartWith<F, T> {
	T startswith(F from);
	
	default String int2String(int value){
		return String.valueOf(value);
	}
}
