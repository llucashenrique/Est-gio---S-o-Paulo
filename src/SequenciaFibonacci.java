import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaFibonacci {
    // Criei um ArrayList para a sequência.
    private static final List<Integer> fibonacciSequencia = new ArrayList<>();

    // Aqui criei um bloco de inicialização static para quando o programa for inicializado ele já estar criado e mostrar a sequência.
    static {
        int t1 = 0, t2 = 1;
        fibonacciSequencia.add(t1);
        fibonacciSequencia.add(t2);

        int nextTerm;
        while (true) {
            nextTerm = t1 + t2;
            if (nextTerm > 1000) {
                break;
            }
            fibonacciSequencia.add(nextTerm);
            t1 = t2;
            t2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Aqui mostrei a sequência Fibonacci
        System.out.println("Sequência de Fibonacci gerada: ");
        for (int term : fibonacciSequencia) {
            System.out.print(term + " ");
        }
        System.out.println();

        // Pedindo para o usuário fornecer um número para comparação
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = input.nextInt();

        // Fazendo a comparação
        if (isFibonacci(num)) {
            System.out.println("Pertence à sequência de Fibonacci: " + num);
        } else {
            System.out.println("Não pertence à sequência de Fibonacci: " + num);
        }

        input.close();
    }

    public static boolean isFibonacci(int num) {
        // Aqui a comparação, já fiz isso diversas vezes em atividades na faculdade.
        int n1 = 0, n2 = 1;

        if (num == n1 || num == n2) {
            return true;
        }

        int nextNum = n1 + n2;

        while (nextNum <= num) {
            if (nextNum == num) {
                return true;
            }
            n1 = n2;
            n2 = nextNum;
            nextNum = n1 + n2;
        }

        return false;
    }
}
