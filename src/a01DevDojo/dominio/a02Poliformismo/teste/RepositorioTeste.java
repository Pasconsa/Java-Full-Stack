package a01DevDojo.dominio.a02Poliformismo.teste;

//Este conceito de Programção orientada a interface é muito usada em coleções
    // Não precisa ficar trocando a implementação especifica na variavel de referencia

import a01DevDojo.dominio.a02Poliformismo.repositorio.Repositorio;
import a01DevDojo.dominio.a02Poliformismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.Salvar();
    }
}
