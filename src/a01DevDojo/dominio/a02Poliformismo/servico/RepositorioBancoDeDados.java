package a01DevDojo.dominio.a02Poliformismo.servico;

import a01DevDojo.dominio.a02Poliformismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void Salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}

