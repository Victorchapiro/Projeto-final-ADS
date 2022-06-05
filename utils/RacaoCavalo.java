package utils;

/**
 * Para calcular a quantidade (kg) de ração que devemos dar para os cavalos diariamente,
 * devemos dividir o peso do animal por 50.
 * @return quantos quilos de ração deve ser colocado para o cavalo
 */

public class racaoCavalo{
    
    public double calculaRacao (double peso){
        Calculadora calc = new Calculadora();
        return calc.teto((peso / 50));
    }

}