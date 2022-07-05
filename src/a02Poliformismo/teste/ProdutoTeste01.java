package a02Poliformismo.teste;

import a02Poliformismo.dominio.Computador;
import a02Poliformismo.dominio.Televisao;
import a02Poliformismo.dominio.Tomate;
import a02Poliformismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("AcerI7", 11000);
        Tomate tomate = new Tomate ("Italiano", 10);
        Televisao televisao = new Televisao("Samsung 50pol" , 2000);

        CalculadoraImposto.calculadoraImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calculadoraImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calculadoraImposto(televisao);
    }

}
