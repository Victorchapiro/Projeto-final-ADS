package utils;

public class Calculadora {
    
    public double soma(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }

    public double subtracao(double numeroA, double numberoB) {        
        return numeroA - numberoB;
    }

    /**
     * @author Geraldo Giovani Pinho da Ponte (2124713)
     */
    public double divisao(double dividendo, double divisor) {
        if (divisor == 0) {
            String sinal = "";
            if (dividendo < 0) {
                sinal = "-";
            }
            throw new IllegalArgumentException(
                    "Não é possível dividir por zero. Java retornaria '" + sinal + "Infinity'.");
        }
        return (dividendo) / divisor;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double piso(double numero) {
        return Math.floor(numero);
    }

    public double teto(double numero) {
        return Math.ceil(numero);
    }

    /**
     * @author Geraldo Giovani Pinho da Ponte (2124713)
     */
    public double raizQuadrada(double radicando) {
        if (radicando < 0) {
            throw new IllegalArgumentException(
                    "\n\n Parâmetro: " + radicando
                            + "\n Não existe raiz quadrada de números negativos no conjunto de números "
                            + "reais.\n "
                            + "Java retornaria 'NaN'.\n");
        }
        return Math.sqrt(radicando);
    }

    public double exponencial(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
