package character.part05;

import character.part05.inter.Converter;

public class LambdaScope {
	
	// lambda内部对于实例的字段以及静态变量是即可读又可写
	
	static int outerStaticNum;
	
    int outerNum;
    
    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from + outerNum);
        };
        
        System.out.println(stringConverter1.convert(22));

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from + outerStaticNum);
        };
        
        System.out.println(stringConverter2.convert(22));
    }
    
    public static void main(String[] args) {
    	LambdaScope scope = new LambdaScope();
    	scope.testScopes();
	}
    
}
