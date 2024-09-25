import java.util.Scanner;

// Classe para armazenar os números
class MaiorNumero {
    double n1;
    double n2;
    double n3;

    // Construtor
    public MaiorNumero(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
}

// Classe com o método main
public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Escreva o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.print("Escreva o terceiro número: ");
        double n3 = scan.nextDouble();

        // Cria o objeto
        MaiorNumero numeroMaior = new MaiorNumero(n1, n2, n3);

        // Encontra o maior número no main
        double maior;
        if (numeroMaior.n1 > numeroMaior.n2 && numeroMaior.n1 > numeroMaior.n3) {
            maior = numeroMaior.n1;
        } else if (numeroMaior.n2 > numeroMaior.n1 && numeroMaior.n2 > numeroMaior.n3) {
            maior = numeroMaior.n2;
        } else {
            maior = numeroMaior.n3;
        }

        // Exibe o maior número
        System.out.println("O maior número é: " + maior);

        scan.close();
    }
}
