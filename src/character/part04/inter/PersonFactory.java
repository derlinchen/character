package character.part04.inter;

import character.part04.bean.Person;

@FunctionalInterface
public interface PersonFactory<P extends Person> {

	P create(String firstName, String lastName);
	
}
