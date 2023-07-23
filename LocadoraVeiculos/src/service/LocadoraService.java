
package service;

import model.Cliente;
import model.Locacao;

import java.util.List;

public class LocadoraService {
    private final List<Locacao> listadeLocacoes; // armazenar a lista
    
    public LocadoraService(List<Locacao> listadeLocacoes) {
        this.listadeLocacoes = listadeLocacoes;
    }
    
    public Cliente buscarClientePorLocacao(int numeroLocacao){
        // logica para buscar o cliente por numero de locacao aqui.
        for (Locacao locacao : listadeLocacoes) {
            if (locacao.getNumeroLocacao() == numeroLocacao) {
                return locacao.getCliente();
            }
        }
        return null;
    }
}
