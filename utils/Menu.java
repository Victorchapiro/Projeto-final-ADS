//package utils;

import java.util.Scanner;
import static java.lang.System.in;

//import java.io.Console;
import java.util.InputMismatchException;

public class Menu {
    private Scanner teclasDigitadas = new Scanner(System.in);
    private int opcao = 0;
    private double numeroA;
    private double numeroB;
    
    public void apresentarOpcoes (){

        while (opcao != 9) {
            System.out.println("Escolha a operação desejada:");
            System.out.println("Digite 1 para IRPF");
            System.out.println("Digite 2 para Ração do Cavalo");
            System.out.println("Digite 3 para calcular as raízes de uma Equação do Segundo Grau");
            System.out.println("Digite 4 para calcular o IMC");
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
                    System.out.println("Você escolheu calcular as raízes de uma equação do 2o grau:");
                    ConsoleReader in = new ConsoleReader(teclasDigitadas);

                    String leiaute = EquacaoSegundoGrau.LEIAUTE_DA_EQUACAO;
                    double a = in.readDouble(
                            "Informe o valor de 'a' para a equação " + leiaute + ": ");
                    double b = in.readDouble(
                            "Informe o valor de 'b' para a equação " + leiaute + ": ");
                    double c = in.readDouble(
                            "Informe o valor de 'c' para a equação " + leiaute + ": ");
                    EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);
                    System.out.println(eq.getRelatorioDoResultado(" "));
                    if (in.respondeuSim("Deseja exibir uma amostra dos cenários possíveis? (S/N)")) {
                        System.out.println(eq.getExemplos());
                    }

                    break;
                }                
                case 4: {
                    System.out.println("Você escolheu calcular o IMC:");
                    ConsoleReader in = new ConsoleReader(teclasDigitadas);
                    double peso = in.readDouble("Informe seu peso (em Kg): ");
                    int altura = in.readInteger("Informe sua altura (valor inteiro em cm): ");
                    Imc imc = new Imc(peso, altura);
                    System.out.println(imc.getTabelaIMC());
                    System.out.println(imc.toString());
                    break; 
                }                
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

                case 7: {
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
    
                case 8: {
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
