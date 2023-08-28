package teste;

public class ArraysNomes {

	public static void main(String[] args) {
		// Declara o array de nomes com 4 posições
        String nomes[] = new String[4];

        // Preenche o array com dados
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Ana";

        // Percorre os elementos do array e exibe-os no terminal
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        //Percorrendo com ForEach.
        for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
