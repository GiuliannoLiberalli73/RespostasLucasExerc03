import java.util.Random;
import java.util.Scanner;

public class NumerosSorteadosPersonalizados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidadeNumeros = scanner.nextInt();

        System.out.print("Digite o valor mínimo da faixa de sorteio: ");
        int valorMinimo = scanner.nextInt();

        System.out.print("Digite o valor máximo da faixa de sorteio: ");
        int valorMaximo = scanner.nextInt();

        if (valorMinimo >= valorMaximo) {
            System.out.println("O valor mínimo deve ser menor que o valor máximo.");
            return;
        }

        Random random = new Random();

        System.out.println("Números sorteados:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numeroSorteado = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
            System.out.println(numeroSorteado);
        }
    }
}
