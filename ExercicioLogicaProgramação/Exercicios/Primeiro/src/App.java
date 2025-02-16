import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Titulo Desafio
            String titulo ="""
                    Tente adivinhar o número entre 1 e 100
                    """;

        System.out.println(titulo);

        //Métado Scanner e Random
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();


        //Desafio

        //Número aleatorio e quantidade de tentativa
        int numeroDeTentativa = 0;
        int numeroAleatorio = random.nextInt(100) + 1;
        boolean acerto = false;



        while(!acerto){

            System.out.println("Qual número?");
            int numero = scanner.nextInt();
            numeroDeTentativa++;



            if(numero == numeroAleatorio){

                System.out.println("Você acertou!! " + " O número: " + numeroAleatorio);
                System.out.println("Você acertou em " + numeroDeTentativa + " tentativa.");
                acerto = true; 


            }else if (numero < numeroAleatorio){
                System.out.println("Número maior tente novamente");
            }else{
                System.out.println("Número menor tente novamente");
            }
           




        }


        scanner.close();

    
    }
}
