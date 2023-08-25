package collection;

import java.util.Objects;

public class StratUsuarios {

	public static void main(String[] args) {
		Usuario use1 = new Usuario();
		use1.nome = "Pedro da Silva";
		use1.email = "p.silva@email.com";

		Usuario use2 = new Usuario();
		use2.nome = "Pedro da Silva";
		use2.email = "p.silva@email.com";
			
		if (Objects.equals(use1, use2)) {
		    System.out.println("Os valores dos objetos são iguais.");
		} else {
		    System.out.println("Os valores dos objetos são diferentes.");
		}
	}

}
