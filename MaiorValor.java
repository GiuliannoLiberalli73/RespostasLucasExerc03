import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 100;
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }
}
