import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
   
        public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);        
            try{
                System.out.println("Digite o 1° número!");
                int argumento1=scan.nextInt();
                System.out.println("Digite o 2° número!");
                int argumento2=scan.nextInt();
                   
                   //chamando o método contendo a lógica de contagem
                contar(argumento1,argumento2 );
                        
            }catch (ParametrosInvalidosException e) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage());
                System.err.println("Pressione 'seta para cima', depois,'enter' e tente novamente!");
            }catch(InputMismatchException e){//adicionei para impedir erros de digitação

                System.out.println("Digite apenas valores númericos!");
                System.err.println("Pressione 'seta para cima', depois, 'enter' e tente novamente!");
            }finally{
                scan.close();
            };
            
        };
    
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    
            if(parametroDois>parametroUm) {            
                   int contagem = parametroDois - parametroUm;       
            //realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem ; i++) {
                 System.out.println("Imprimindo "+ i);          
             };
            }else{
                
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            };         };
    }

