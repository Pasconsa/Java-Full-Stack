package a01ClasseAbstrata.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {  //precisa implementar o contrato o metodo do funcionario
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}



