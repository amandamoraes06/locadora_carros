package model;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    // atributos
    private String nome;
    private String endereco;
    private String telefone;
    private List<Veiculo> listadeVeiculos;
    private List<Locacao> listadeLocacoes;
    
    // construtor
    public Locadora(String nome, String endereco, String telefone, List<Veiculo> listadeVeiculos, List<Locacao> listadeLocacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listadeVeiculos = listadeVeiculos;
        this.listadeLocacoes = listadeLocacoes;
    }
    
    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getListadeVeiculos() {
        return listadeVeiculos;
    }

    public void setListadeVeiculos(List<Veiculo> listadeVeiculos) {
        this.listadeVeiculos = listadeVeiculos;
    }

    public List<Locacao> getListadeLocacoes() {
        return listadeLocacoes;
    }

    public void setListadeLocacoes(List<Locacao> listadeLocacoes) {
        this.listadeLocacoes = listadeLocacoes;
    }
    
    // Metodo para mostrar os veiculos disponiveis de um fabricante específico
    public List<Veiculo> veiculosDisponiveisPorFabricante(Fabricante fabricante) {
        List<Veiculo> veiculosDisponiveis = new ArrayList<>();
        
        // Loop através da lista para verificar os disponíveis do fabricante
        for (Veiculo veiculo :  listadeVeiculos) {
            if (veiculo.getFabricante().equals(fabricante) && veiculo.isDisponibilidade()) {
                veiculosDisponiveis.add(veiculo);
            }
        }
        return veiculosDisponiveis;
    }
}