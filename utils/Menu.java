package utils;

import java.util.Scanner;
import static java.lang.System.in;
import java.util.InputMismatchException;

public class Menu {
    Scanner teclasDigitadas = new Scanner(in);
    int opcao = 0;
    double numeroA;
    double numeroB;
    
    public void apresentarOpcoes (){

        while (opcao != 9) {
            System.out.println("Escolha a operação desejada:");
            System.out.println("Digite 1 para IRPF");
            System.out.println("Digite 2 para Raçao do Cavalo");
            System.out.println("Digite 3 para IMC");
            System.out.println("Digite 4 para Equação do Segundo Grau");
            System.out.println("Digite 5 para Km percorrido");
            System.out.println("Digite 6 para Funcao zzzzzz");
            System.out.println("Digite 7 para Função XXXXX");
            System.out.println("Digite 8 para Função YYYY");
            System.out.println("Digite 9 para sair");
       
            try{
                opcao = teclasDigitadas.nextInt();
            }catch (InputMismatchException e) {
                teclasDigitadas = new Scanner(in);  // criado novo objeto para limpar o valor que foi digitado
                opcao = 0;
                System.out.println("Permitido apenas números. Tente novamente.");
            }
        
            switch (opcao) {

                case 1: {
                    System.out.println("Você escolheu IRPF:");
                    IRPF imposto = new IRPF();
                    try {
                        System.out.println("Digite o salário");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println(" Você pagará R$ " + imposto.calculoIRPF(numeroA) + " de imposto de renda");
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                   
                }break;

                case 2: {
                    System.out.println("Você escolheu Ração do Cavalo:");
                    RacaoCavalo qtdRacao = new RacaoCavalo();
                    try {
                        System.out.println("Digite o peso do cavalo");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Esse cavalo necessita de " + qtdRacao.calculaRacao(numeroA) + " kg de ração");
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                    
                }break;

                case 3: {
                    System.out.println("Você escolheu IMC:");
                    try {
                        System.out.println("Digite o seu peso");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite a sua altura em centimetro");
                        numeroB = teclasDigitadas.nextInt();
                        
                        /*
                         * digitar o código para chamar a classe do GERALDO
                         */
                      
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                    }break;

                case 4: {
                    System.out.println("Você escolheu IMC:");
                    try {
                        System.out.println("Digite o seu peso");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite a sua altura em centimetro");
                        numeroB = teclasDigitadas.nextInt();
                            
                            /*
                             * digitar o código para chamar a classe do GERALDO e ajustar o texto
                             */
                          
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                }break;
                
                case 5: {
                    System.out.println("Você escolheu km percorrido:");
                    kmPercorrido km1 = new kmPercorrido();
                    try {
                        System.out.println("Digite a km inicial");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite o km final");
                        numeroB = teclasDigitadas.nextDouble();
                        System.out.println(km1.mostrardistancia(numeroA, numeroB));   
                             
                          
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                }break;
    
                case 6: {
                    System.out.println("Você escolheu IMC:");
                    try {
                        System.out.println("Digite o seu peso");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite a sua altura em centimetro");
                        numeroB = teclasDigitadas.nextInt();
                                
                                /*
                                 * digitar o código para chamar a classe do GERALDO e ajustar o texto
                                 */
                              
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                }break;    

                case 5: {
                    System.out.println("Você escolheu IMC:");
                    try {
                        System.out.println("Digite o seu peso");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite a sua altura em centimetro");
                        numeroB = teclasDigitadas.nextInt();
                            
                            /*
                             * digitar o código para chamar a classe do GABRIEL
                             */
                          
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                }break;
    
                case 6: {
                    System.out.println("Você escolheu IMC:");
                    try {
                        System.out.println("Digite o seu peso");
                        numeroA = teclasDigitadas.nextDouble();
                        System.out.println("Digite a sua altura em centimetro");
                        numeroB = teclasDigitadas.nextInt();
                                
                                /*
                                 * digitar o código para chamar a classe do GABRIEL e ajustar o texto
                                 */
                              
                    }catch (InputMismatchException exception) {
                        System.out.println("Digite apenas números.Tente novamente");
                        teclasDigitadas = new Scanner(in);
                        numeroA = 1;
                    }                 
                }break;  


                case 9: {
                System.out.println("Você escolheu sair");
                }break;

                default: {
                    System.out.println("Opção inválida");
                }break;
            }

        }
        teclasDigitadas.close();
    }
}
