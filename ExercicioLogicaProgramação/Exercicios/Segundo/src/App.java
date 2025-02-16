import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // TÍTULO DO DESAFIO
        String titulo = """
                Me fale um número positivo e eu irei informar se ele é primo ou não.
        \n""";

        System.out.println(titulo);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual número deseja verificar? ");
        int numeroDesejado = scanner.nextInt();

        if (numeroDesejado <= 1) {
            System.out.println(numeroDesejado + " não é um número primo!");
        } else {
            int contadorDeDivisores = 0;

            // Testar todos os números de 1 até o número desejado
            for (int i = 1; i <= numeroDesejado; i++) {
                if (numeroDesejado % i == 0) {
                    contadorDeDivisores++; // Contamos quantos números são divisores
                }
            }

            // Se tiver exatamente 2 divisores (1 e ele mesmo), é primo
            if (contadorDeDivisores == 2) {
                System.out.println(numeroDesejado + " é um número primo!");
            } else {
                System.out.println(numeroDesejado + " não é um número primo!");
            }
        }

        scanner.close();
    }
}
