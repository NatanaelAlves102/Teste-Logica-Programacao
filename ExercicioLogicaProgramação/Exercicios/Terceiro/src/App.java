import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        //TITULO
        System.out.println("CALCULADORA");

        Scanner teclado = new Scanner(System.in);

        //Sair do loop
        boolean SairCalculadora = false;

        //Opção de escolha  +-/* */
        String escolhaDoCalculo = """
            O que deseja fazer ?

            1. Multiplicação
            2. Divisão
            3. Soma
            4. Subtração
            5. Sair
                """;


        while(!SairCalculadora){

             //Escolha da Opção
             System.out.println(escolhaDoCalculo);
             int escolha = teclado.nextInt(); 

            //Escolha do primerio número
            System.out.println("Primeiro Número??");
            int primeiroNumero = teclado.nextInt();

            //Escolha do segundo número
            System.out.println("Segundo Número??");
            int segundoNumero = teclado.nextInt();

           
        

            if(escolha == 5){//Sair da operação
                System.out.println("Até mais ");
                teclado.close();
                SairCalculadora = true;
                
            }else if(escolha == 1){//Multiplicação
                int resultado = primeiroNumero * segundoNumero;
                System.out.println("Valor: " +resultado);


            }else if(escolha == 2){//Divisão
                int resultado = primeiroNumero / segundoNumero;
                System.out.println("Valor: " +resultado);
                
            }else if(escolha == 3){//Soma
                int resultado = primeiroNumero + segundoNumero;
                System.out.println("Valor: "+resultado);

            }else if(escolha ==4){//Subtração 
                int resultado = primeiroNumero - segundoNumero;
                System.out.println("Valor: "+resultado);

            }else {
                System.out.println("Opção inválida! Tente novamente.");
            }

            
        }








        
    }
    }
