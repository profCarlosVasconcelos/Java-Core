package collection;

import java.util.Arrays;

public class Alistamento {
	
	private String recruta[] = new String[8]; ;
	
	public Alistamento() {
	}	

	public String getRecruta(int index) {
		return recruta[index];
	}
	
	public void setRecruta(int index, String dado) {
		recruta[index] = dado;
	}
	
	public void addRecruta(String nome, String anoNascimento, String nomeMae, String nomePai,
			String telefone, String email, String altura, String peso) {
		this.recruta[0] = nome;
		this.recruta[1] = anoNascimento;
		this.recruta[2] = nomeMae;
		this.recruta[3] = nomePai;
		this.recruta[4] = telefone;
		this.recruta[5] = email;
		this.recruta[6] = altura;
		this.recruta[7] = peso;		
	}
	
	
		
	@Override
    public String toString() {
        return "Dados do Recruta " + Arrays.toString(recruta);
    }
	
	

}
