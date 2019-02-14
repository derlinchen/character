package character.part01.inter;

public interface Formula {
	
	double calculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
}
