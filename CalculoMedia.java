import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeValores = 500;
        double soma = 0;
        
        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            double valor = scanner.nextDouble();
            
            soma += valor;
        }
        
        double media = soma / quantidadeValores;
        
        System.out.println("A média dos " + quantidadeValores + " valores é: " + media);
        
        scanner.close();
    }
}
