import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        while (true) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas++;
            
            if (tentativa < 1 || tentativa > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
            } else if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é maior. Tente novamente.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
                break;
            }
        }
        
        scanner.close();
    }
}
