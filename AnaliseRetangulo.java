import java.util.Scanner;

public class AnaliseRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as coordenadas do primeiro ponto (superior esquerdo):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Digite as coordenadas do segundo ponto (inferior direito):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
      
        String tipoRetangulo = verificarTipoRetangulo(x1, y1, x2, y2);
        System.out.println("Tipo de figura: " + tipoRetangulo);
        
        if (tipoRetangulo.equals("Retângulo")) {
        
            double area = calcularAreaRetangulo(x1, y1, x2, y2);
            System.out.println("Área do retângulo: " + area);
            
           
            System.out.println("Digite as coordenadas de um terceiro ponto:");
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            
 
            String posicao = determinarPosicaoPonto(x1, y1, x2, y2, x3, y3);
            System.out.println("Posição do terceiro ponto em relação ao retângulo: " + posicao);
        }
        
        scanner.close();
    }
    public static String verificarTipoRetangulo(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            if (x1 == x2 && y1 == y2) {
                return "Ponto";
            } else if (x1 == x2) {
                return "Reta Vertical";
            } else if (y1 == y2) {
                return "Reta Horizontal";
            }
        }
        return "Retângulo";
    }
    
   
    public static double calcularAreaRetangulo(double x1, double y1, double x2, double y2) {
        double largura = Math.abs(x2 - x1);
        double altura = Math.abs(y2 - y1);
        return largura * altura;
    }
    public static String determinarPosicaoPonto(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x3 < x1 && y3 > y2) {
            return "Acima e à esquerda";
        } else if (x3 >= x1 && x3 <= x2 && y3 > y2) {
            return "Acima";
        } else if (x3 > x2 && y3 > y2) {
            return "Acima e à direita";
        } else if (x3 < x1 && y3 >= y1 && y3 <= y2) {
            return "À esquerda";
        } else if (x3 > x2 && y3 >= y1 && y3 <= y2) {
            return "À direita";
        } else if (x3 < x1 && y3 < y1) {
            return "Embaixo e à esquerda";
        } else if (x3 >= x1 && x3 <= x2 && y3 < y1) {
            return "Embaixo";
        } else if (x3 > x2 && y3 < y1) {
            return "Embaixo e à direita";
        } else if (x3 >= x1 && x3 <= x2 && y3 >= y1 && y3 <= y2) {
            return "Dentro do retângulo";
        } else {
            return "Na linha do retângulo";
        }
    }
}
