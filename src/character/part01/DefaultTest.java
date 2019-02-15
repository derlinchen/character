package character.part01;

import character.part01.inter.Formula;

public class DefaultTest {

	public static void main(String[] args) {
		Formula formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
		};
		
		System.out.println(formula.calculate(100));
		System.out.println(formula.sqrt(16));
	}

}
