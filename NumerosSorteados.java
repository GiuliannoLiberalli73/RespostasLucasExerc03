import java.util.Random;

public class NumerosSorteados {
    public static void main(String[] args) {
        // Crie um objeto Random para gerar números aleatórios
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int numeroSorteado = random.nextInt(100) + 1; // Gera números de 1 a 100
            System.out.println(numeroSorteado);
        }
    }
}
