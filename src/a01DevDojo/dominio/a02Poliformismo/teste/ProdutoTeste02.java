package a01DevDojo.dominio.a02Poliformismo.teste;

import a01DevDojo.dominio.a02Poliformismo.dominio.Computador;
import a01DevDojo.dominio.a02Poliformismo.dominio.Produto;
import a01DevDojo.dominio.a02Poliformismo.dominio.Tomate;

public class ProdutoTeste02 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 8",3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------");
        Produto produto2 = new Tomate("Tomate",3);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
