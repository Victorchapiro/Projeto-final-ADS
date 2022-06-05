//package utils;

import java.util.Scanner;
//import static java.lang.System.in;

//import java.io.Console;
//import java.util.InputMismatchException;

public class Menu {
    private String menuPrincipal() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n\nDigite 1 para IRPF\n");
        sb.append("Digite 2 para Ração do Cavalo\n");
        sb.append("Digite 3 para calcular as raízes de uma Equação do Segundo Grau\n");
        sb.append("Digite 4 para calcular o IMC\n");
        sb.append("Digite 5 para Km percorrido\n");
        sb.append("Digite 6 para Funcao zzzzzz\n");
        sb.append("Digite 7 para Função XXXXX\n");
        sb.append("Digite 8 para Função YYYY\n");
        sb.append("Digite 9 para sair\n");
        sb.append("Informe a operação desejada: ");
        return sb.toString();
    }

    public void apresentarOpcoes() {
        int opcao = 0;
        double numeroA;
        double numeroB;
        Scanner teclasDigitadas = new Scanner(System.in);
        ConsoleReader in = new ConsoleReader(teclasDigitadas);

        while (opcao != 9) {
            opcao = in.readInteger(menuPrincipal());

            // try{
            // opcao = teclasDigitadas.nextInt();
            // }catch (InputMismatchException e) {
            // teclasDigitadas = new Scanner(in); // criado novo objeto para limpar o valor
            // que foi digitado
            // opcao = 0;
            // System.out.println("Permitido apenas números. Tente novamente.");
            // }

            switch (opcao) {

                case 1: {
                    System.out.println("Você escolheu IRPF:");
                    IRPF imposto = new IRPF();
                    // try {
                    System.out.println("Digite o salário");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println(" Você pagará R$ " + imposto.calculoIRPF(numeroA) + " de imposto de renda");
                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }
                case 2: {
                    System.out.println("Você escolheu Ração do Cavalo:");
                    RacaoCavalo qtdRacao = new RacaoCavalo();
                    // try {
                    System.out.println("Digite o peso do cavalo");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println("Esse cavalo necessita de " + qtdRacao.calculaRacao(numeroA) + " kg de ração");
                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }
                case 3: {
                    System.out.println("Você escolheu calcular as raízes de uma equação do 2o grau:");
                    // ConsoleReader in = new ConsoleReader(teclasDigitadas);

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
                    // ConsoleReader in = new ConsoleReader(teclasDigitadas);
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
                    // try {
                    System.out.println("Digite a km inicial");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println("Digite o km final");
                    numeroB = teclasDigitadas.nextDouble();
                    System.out.println(km1.mostrardistancia(numeroA, numeroB));

                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }
                case 6: {
                    System.out.println("Você escolheu IMC:");
                    // try {
                    System.out.println("Digite o seu peso");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println("Digite a sua altura em centimetro");
                    numeroB = teclasDigitadas.nextInt();

                    /*
                     * digitar o código para chamar a classe do GERALDO e ajustar o texto
                     */

                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }                    
                case 7: {
                    System.out.println("Você escolheu IMC:");
                    // try {
                    System.out.println("Digite o seu peso");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println("Digite a sua altura em centimetro");
                    numeroB = teclasDigitadas.nextInt();

                    /*
                     * digitar o código para chamar a classe do GABRIEL
                     */

                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }                    
                case 8: {
                    System.out.println("Você escolheu IMC:");
                    // try {
                    System.out.println("Digite o seu peso");
                    numeroA = teclasDigitadas.nextDouble();
                    System.out.println("Digite a sua altura em centimetro");
                    numeroB = teclasDigitadas.nextInt();

                    /*
                     * digitar o código para chamar a classe do GABRIEL e ajustar o texto
                     */

                    // }catch (InputMismatchException exception) {
                    // System.out.println("Digite apenas números.Tente novamente");
                    // teclasDigitadas = new Scanner(in);
                    // numeroA = 1;
                    // }
                    break;
                }
                case 9: {
                    System.out.println("Você escolheu sair");
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }

            if (!in.respondeuSim("Deseja continuar (S/N)? ")) {
                opcao = 9;
            }

        }

        teclasDigitadas.close();
    }
}
