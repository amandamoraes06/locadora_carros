
package model;

public class Veiculo {
    
    // atributos
    private Fabricante fabricante;
    private String modelo;
    private int ano;
    private String placa;
    private boolean disponibilidade;
    
    // construtor
    public Veiculo(Fabricante fabricante, String modelo, int ano, String placa, boolean disponibilidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.disponibilidade = disponibilidade;
    }
    
    // getters e setters
    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
}
