package collection;

import java.util.Objects;

public class Titulos {
	String idLivro;
	String nomeLivro;
	String autorLivro;
	String anoPublicacao;
	
	public Titulos(String idLivro, String nomeLivro, String autorLivro, String anoPublicacao) {
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.anoPublicacao = anoPublicacao;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(anoPublicacao, autorLivro, idLivro, nomeLivro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulos other = (Titulos) obj;
		return Objects.equals(anoPublicacao, other.anoPublicacao) && Objects.equals(autorLivro, other.autorLivro)
				&& Objects.equals(idLivro, other.idLivro) && Objects.equals(nomeLivro, other.nomeLivro);
	}
	
	
	
	
}
