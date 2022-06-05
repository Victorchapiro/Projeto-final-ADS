public class Calculadora {

    public double soma() {
        return 0.0;
    }

    public double subtracao() {
        return 0.0;
    }

    public double multiplicacao() {
        return 0.0;
    }

    public double piso(double numeroA) {
        return Math.floor(numeroA);
    }

    public double teto() {
        return 0.0;
    }

    public double exponencial() {
        return 0.0;
    }

    /** @author Geraldo Giovani Pinho da Ponte (mat. 2124713) */
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

    /** @author Geraldo Giovani Pinho da Ponte (mat. 2124713) */
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
 
}