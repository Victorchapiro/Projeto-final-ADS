public class Calculadora {

    //TODO excluir este atributo global 
    //indicará que os métodos foram devidamente implementados
    public double resultado;

    public double soma(double numeroA, double numeroB) {
        resultado = numeroA + numeroB;

        return resultado;
    }

    public double subtração(double numeroA, double numberoB) {
        resultado = numeroA - numberoB;
        return resultado;
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

    public double multiplicação() {
        return resultado;
    }

    public double piso() {
        return resultado;
    }

    public double teto() {
        return resultado;
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
}
