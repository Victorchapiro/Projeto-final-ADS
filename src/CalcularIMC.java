/** @author Geraldo Giovani Pinho da Ponte (2124713) 
*/

package src;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.Imc;

public class CalcularIMC {

    private static double peso = 0.0;
    private static int altura = 0;

    private static void readParamsFromArgs(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Quantidade de argumentos incorreta.");
        }
        peso = Double.valueOf(args[0]);
        altura = Integer.valueOf(args[1]);
    }

    private static void readParamsFromConsole(Scanner in) {

        boolean argumentoValido = false;

        do {
            System.out.print("Informe seu peso (em Kg): ");
            try {
                peso = in.nextDouble();
                argumentoValido = true;
            } catch (InputMismatchException e) {
                in.nextLine();
                argumentoValido = false;
            }
        } while (!argumentoValido);

        do {
            System.out.print("Informe sua altura (valor inteiro em cm): ");
            try {
                altura = in.nextInt();
                argumentoValido = true;
            } catch (InputMismatchException e) {
                in.nextLine();
                argumentoValido = false;
            }
        } while (!argumentoValido);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            readParamsFromArgs(args);
        } catch (Exception e) {
            readParamsFromConsole(in);
        }

        try {
            Imc imc = new Imc(peso, altura);
            System.out.println(imc.getTabelaIMC());
            System.out.println(imc.toString());
        } finally {
            if (in != null) {
                in.close();
            }
        }

    }


}
