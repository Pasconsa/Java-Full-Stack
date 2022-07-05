package a02Poliformismo.servico;

import a02Poliformismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void Salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
