package a02Poliformismo.servico;

import a02Poliformismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void Salvar() {
        System.out.println("Salvando na memoria");
    }
}
