import java.util.Random;
import java.util.Arrays;

public class NumerosSorteados42 {
    public static void main(String[] args) {
        Random random = new Random();
        
  
        for (int i = 1; i <= 40; i++) {
            int[] grupo = gerarGrupoDeNumeros(random);
            Arrays.sort(grupo); // Ordenar o grupo em ordem crescente
            
            System.out.print("Grupo " + i + ": ");
            for (int j = 0; j < grupo.length; j++) {
                System.out.print(grupo[j] + " ");
            }
            System.out.println();
        }
    }
    

    public static int[] gerarGrupoDeNumeros(Random random) {
        int[] grupo = new int[3];
        
        for (int i = 0; i < 3; i++) {
            grupo[i] = random.nextInt(60); // Gere números de 0 a 59
        }
        
        return grupo;
    }
}
