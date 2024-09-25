import java.util.Scanner;

// Classe para armazenar os números
class NumeroAb {
    double n1;
    double n2;

    // Construtor
    public NumeroAb(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
}

// Classe para calcular a potência
class Potencia {
    // Método para elevar o número 
    public double eleva(NumeroAb numeros) {
        return Math.pow(numeros.n1, numeros.n2);  //Math.pow calcula a potência
    }
}

// Classe principal pública
public class Elevado{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite o expoente: ");
        double n2 = scan.nextDouble();

        //Cria o objeto da classe NumeroAb
        NumeroAb numeros = new NumeroAb(n1, n2);

        //Objeto da classe Potencia
        Potencia potencia = new Potencia();

        // Calculo de potencia
        double resultado = potencia.eleva(numeros);

    
        System.out.println(n1 + " elevado a " + n2 + " é: " + resultado);

        scan.close();
    }
}
