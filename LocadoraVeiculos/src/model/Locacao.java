
package model;

import java.util.Date;

public class Locacao {
    
    // atributos
    private Veiculo veiculo;
    private Cliente cliente;
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    private int numeroLocacao;
    
    // metodo construtor
    public Locacao(Veiculo veiculo, Cliente cliente, Date dataInicio, Date dataFim, double valor, int numeroLocacao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.numeroLocacao = numeroLocacao;
    }
    
    //métodos getters e setters
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroLocacao() {
        return numeroLocacao;
    }

    public void setNumeroLocacao(int numeroLocacao) {
        this.numeroLocacao = numeroLocacao;
    }
}
