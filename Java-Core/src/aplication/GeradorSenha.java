package aplication;
import java.security.SecureRandom;

public class GeradorSenha {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";

    // Método para gerar uma senha aleatória com base no tamanho especificado
    public static String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(index));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        int tamanhoSenha = 10;
        String senhaGerada = gerarSenha(tamanhoSenha);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}
