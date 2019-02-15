package character.part09.inter;

import java.lang.annotation.Repeatable;

@Repeatable(Authorities.class)
public @interface Authority {
	String role();
}
