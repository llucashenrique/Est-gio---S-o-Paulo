import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // solicita a palavra para o usuario.
        System.out.println("Digite uma palavra para inverter: ");
        String palavra = input.nextLine();

        // converte a string para caracteres.
        char[] caracteres = palavra.toCharArray();

        // variavel para armanezar a string invertida fora do for
        String inverte = "";

        // percorre o array de caractres de tras para frente usando o lenght e o - 1.
        for (int i = caracteres.length - 1; i >= 0; i--) {
            inverte += caracteres[i];
        }

        // exibe a string invertida
        System.out.println("String invertida: "+inverte);
    }
}
