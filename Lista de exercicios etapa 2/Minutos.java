import java.util.Scanner;

// Classe para armazenar minutos e converter para horas
public class Minutos {
    private int minutos;

// Construtor
    public Minutos(int minutos) {
        this.minutos = minutos;
    }

    // Método para converter minutos em horas e minutos
    public String horaMin() {
        int horas = minutos / 60; 
        int min = minutos % 60; 

        // Formata a saída como horas:minutos
        return String.format("%d:%02d", horas, min);
    }

    // Classe principal 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicita a entrada do usuário
        System.out.print("Digite quantos minutos que voce deseja converter em horas: ");
        int minutos = scan.nextInt();

        //Objeto da classe Minutos
        Minutos horasMinutos = new Minutos(minutos);

        String hrFormat = horasMinutos.horaMin();

        System.out.println(minutos + " minutos em horas:" + hrFormat + " horas");

        scan.close();
    }
}
