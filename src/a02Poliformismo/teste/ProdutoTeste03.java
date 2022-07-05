package a02Poliformismo.teste;

import a02Poliformismo.dominio.Computador;
import a02Poliformismo.dominio.Produto;
import a02Poliformismo.dominio.Tomate;
import a02Poliformismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 8",3000);

        Tomate tomate = new Tomate("Tomate",3);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calculadoraImposto(tomate);
        CalculadoraImposto.calculadoraImposto(produto);

    }
}
