import java.util.Scanner;

class NegativoPositivo {

    double numero;

    // Método para definir o número
    public void parImpar(double numero) {
        this.numero = numero;
    }

    // Método para verificar se o número é positivo ou negativo
    public String operacao() {
        String confirmacao;
        if (numero >= 0) {
            confirmacao = "positivo";
        } else {
            confirmacao = "negativo";
        }
        return confirmacao;
    }
}

public class NegPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scan.nextDouble();

        NegativoPositivo resultado = new NegativoPositivo();
        resultado.parImpar(numero); // Define o número

        String fim = resultado.operacao(); // Verifica se é positivo ou negativo

        System.out.println("O número é " + fim);

        scan.close();
    }
   
}