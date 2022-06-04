/** @author Geraldo Giovani Pinho da Ponte (2124713) 
*/

package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import utils.EquacaoSegundoGrau;

public class CalcularRaizesEquacao2oGrau {
    private static ArrayList<Double> coeficientes = new ArrayList<>();
    private static final String[] LETRAS_DO_COEFICIENTE = {"a", "b", "c"};

    private static double a(){
        return coeficientes.get(0);
    }

    private static double b() {
        return coeficientes.get(1);
    }

    private static double c() {
        return coeficientes.get(2);
    }

    private static void readCoeficientesFromConsole(Scanner in){
        coeficientes.clear();

        boolean argumentoValido = false;
        String mensagem = "";

        for (int i=0; i<LETRAS_DO_COEFICIENTE.length; i++){
            argumentoValido = false;
            mensagem = String.format("Informe o coeficiente %s: ", LETRAS_DO_COEFICIENTE[i]);
            do {
                System.out.print(mensagem);
                try {
                    coeficientes.add(in.nextDouble());
                    argumentoValido = true;
                } catch (InputMismatchException e) {
                    in.nextLine();
                    argumentoValido = false;
                }
            } while (!argumentoValido);

        }
    }

    private static void readCoeficientesFromArgs(String[] args) {
        coeficientes.clear();

        if (args.length != 3) {
            throw new IllegalArgumentException("Quantidade de argumentos incorreta.");
        }

        for (int i = 0; i < args.length; i++) {
            coeficientes.add(Double.valueOf(args[i]));
        }
    }

    private static String gerarAmostra(){

        StringBuffer sb = new StringBuffer();
        sb.append(getRelatorioDoResultado("Exemplo 1: duas raízes válidas", 1, -5, 6));
        sb.append(getRelatorioDoResultado("Exemplo 2: uma raíz válida", 4, -4, 1));
        sb.append(getRelatorioDoResultado("Exemplo 3: não existem raízes válidas", 5, 1, 6));
        sb.append(getRelatorioDoResultado("Exemplo 4: não é equação do segundo grau (a = 0)", 0, 2,4));
        return sb.toString();
    }

    private static String getRelatorioDoResultado(String descricao, double a, double b, double c) {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);

        StringBuffer sb = new StringBuffer();
        sb.append(descricao + "\n");
        sb.append("equação: " + eq.toString() + "\n");
        try {
            sb.append("raízes: " + eq.getRaizes().toString() + "\n");
        } catch (IllegalArgumentException e) {
            sb.append("raízes: " + e.getMessage()+ "\n");
        }
        sb.append("\n");
        return sb.toString();
    }

    private static boolean respondeuSim(Scanner in, String pergunta) {
        String resposta = "";
        boolean respostaValida = false;
        do {
            System.out.print(pergunta);
            try {
                resposta = in.nextLine();
                respostaValida = resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("N");
            } catch (InputMismatchException e) {
                in.nextLine();
                respostaValida = false;
            }

        } while (!respostaValida);
        return resposta.equalsIgnoreCase("S");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            readCoeficientesFromArgs(args);
            System.out.println(getRelatorioDoResultado("", a(), b(), c()));
        } catch (Exception e) {
            if ( respondeuSim(in, "Deseja gerar uma amostra com os cenários possíveis? (S/N): ") ) {
                System.out.println(gerarAmostra());
            }

            while ( respondeuSim(in, "Deseja informar uma equação? (S/N): ") ) {
                readCoeficientesFromConsole(in);
                System.out.println(getRelatorioDoResultado("", a(), b(), c()));
                in.nextLine();
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }

}