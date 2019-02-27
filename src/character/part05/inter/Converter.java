package character.part05.inter;

//接口，除默认方法外，有且只有一个抽象方法
@FunctionalInterface
public interface Converter<F, T> {
	T convert(F from);
	
	default String int2String(int value){
		return String.valueOf(value);
	}
}
