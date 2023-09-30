import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            if (verificarNumeroPerfeito(numero)) {
                System.out.println(numero + " é um número perfeito.");
            } else {
                System.out.println(numero + " não é um número perfeito.");
            }
        }
        
        scanner.close();
    }
    
 
    public static boolean verificarNumeroPerfeito(int num) {
        int somaDivisores = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        
        return somaDivisores == num;
    }
}
