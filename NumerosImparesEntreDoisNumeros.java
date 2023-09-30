import java.util.Scanner;

public class NumerosImparesEntreDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números ímpares entre " + numero1 + " e " + numero2 + ":");

  
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
