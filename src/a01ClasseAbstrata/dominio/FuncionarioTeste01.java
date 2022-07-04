package a01ClasseAbstrata.dominio;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami",5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("pipi",4000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }

}
