import java.util.Scanner;

public class AnaliseIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        
        if (quantidadePessoas <= 0) {
            System.out.println("A quantidade de pessoas deve ser maior que zero.");
            scanner.close();
            return;
        }
        
        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int countMaioresIdade = 0;
        
        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            somaIdades += idade;
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            
            if (idade >= 18) {
                countMaioresIdade++;
            }
        }
        
        double mediaIdades = (double) somaIdades / quantidadePessoas;
        
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + countMaioresIdade);
        
        scanner.close();
    }
}
