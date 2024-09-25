import java.util.Scanner;

// Classe da média
class MediaAritmetica {
    double n1;
    double n2;
    double n3;

    // Construtor da classe
    public MediaAritmetica(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (n1 + n2 + n3) / 3;
    }
}

public class MediaAritmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Escreva o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.print("Escreva o terceiro número: ");
        double n3 = scan.nextDouble();

        // Cria uma instância da classe MediaAritmetica com os dados necessários
        MediaAritmetica media = new MediaAritmetica(n1, n2, n3);

        // Calcula o resultado com base no método criado anteriormente
        double resultado = media.calcularMedia();

        // Exibe resultados
        System.out.println("\nA média aritmética é: " + resultado);

        scan.close();
    }
}
