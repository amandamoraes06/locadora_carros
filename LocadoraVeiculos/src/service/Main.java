package service;

import model.Cliente;
import model.Locacao;
import model.Veiculo;
import model.Fabricante;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        // Lista de locacoes para testar
        List<Locacao> locacoes = new ArrayList<>();
        
        // objetos classe e locacao
        Cliente cliente1 = new Cliente("João", "123456789", "Rua A, 123", 99999999);
        Cliente cliente2 = new Cliente("Maria", "456789123", "Rua B, 456", 88888888);
        
        // objetos veiculos
        Fabricante fabricante1 = new Fabricante("FIAT", "Italia");
        Fabricante fabricante2 = new Fabricante("Ferrari", "Italia");
        
        Veiculo veiculo1 = new Veiculo(fabricante1, "Uno", 2023, "ABC123", true);
        Veiculo veiculo2 = new Veiculo(fabricante2, "812 GTS", 2023, "DEF456", true);
        
        Locacao locacao1 = new Locacao(veiculo1, cliente1, new Date(), new Date(), 100.0, 1);
        Locacao locacao2 = new Locacao(veiculo2, cliente2, new Date(), new Date(), 1000.0, 2);
        
        // adicionar locações à lista
        locacoes.add(locacao1);
        locacoes.add(locacao2);
        
        // crie uma instância de LocadoraService com a lista de locações
        LocadoraService locadoraService = new LocadoraService(locacoes);
        
        // teste o metodo buscarClientePorLocacao
        int numeroLocacao = 1;
        Cliente clienteEncontrado = locadoraService.buscarClientePorLocacao(numeroLocacao);
        
        // veriricar se o cliente retornado é o esperado.
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado!\nNome: " + clienteEncontrado.getNome() + "\nCPF: " + clienteEncontrado.getCpf() + "\nEndereço: " + clienteEncontrado.getEndereco() + "\ntelefone: " + clienteEncontrado.getTelefone());
        } else {
            System.out.println("Cliente não encontrado para a locação " + numeroLocacao);
        }
    }   
}
