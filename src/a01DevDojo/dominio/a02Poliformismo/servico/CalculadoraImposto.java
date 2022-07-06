package a01DevDojo.dominio.a02Poliformismo.servico;

import a01DevDojo.dominio.a02Poliformismo.dominio.Produto;
import a01DevDojo.dominio.a02Poliformismo.dominio.Tomate;

public class CalculadoraImposto { //se voce não estiver usando nenhyum atributo de classe voce pode usar static
/*

    public static void calculadoraImpostoComputador(Computador computador) { //transformando static não precisa tranformar em new calculando imposto
        System.out.println("Relatorio imposto computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calculadoraImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio imposto tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }    */


    //codigo mais generico desacoplado
    public static void calculadoraImposto(Produto produto) {
        System.out.println("Relatorio imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if (produto instanceof Tomate) {  //Quando fazer Cast verifica se o tipo da variavel que esta fazendo cast é uma
                                          // instancia que voce esta esperando para não dar erro.
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }


    }


}
