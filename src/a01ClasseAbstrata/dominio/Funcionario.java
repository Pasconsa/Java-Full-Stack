package a01ClasseAbstrata.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override                        //clasee abstrato pessoa
    public void imprime() {
        System.out.println("imprimindo....");
    }

    public abstract void calculaBonus();   //"Prover o metodo sub class a calcular todos os bonus diferentes profissoes"

}
