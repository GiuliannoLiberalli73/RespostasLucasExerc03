import java.util.Scanner;

public class VerificarInterseccaoRetangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite as coordenadas do primeiro retângulo:");
        double x1a = scanner.nextDouble();
        double y1a = scanner.nextDouble();
        double x2a = scanner.nextDouble();
        double y2a = scanner.nextDouble();


        System.out.println("Digite as coordenadas do segundo retângulo:");
        double x1b = scanner.nextDouble();
        double y1b = scanner.nextDouble();
        double x2b = scanner.nextDouble();
        double y2b = scanner.nextDouble();

        
        if (x1a >= x2a || y1a >= y2a || x1b >= x2b || y1b >= y2b) {
            System.out.println("As coordenadas não formam retângulos válidos (possivelmente se sobrepõem).");
        } else {
  
            if (x1a < x2b && x2a > x1b && y1a < y2b && y2a > y1b) {
                System.out.println("Os retângulos se interceptam em algum lugar.");
            } else {
                System.out.println("Os retângulos não se interceptam.");
            }
        }

        scanner.close();
    }
}
