/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Classe que representa Cliente
 * @author Bruno and Matheus
 */
public abstract class Cliente {
    
    protected String nome;
    protected long cpf;
    protected long cnh;
    protected String endereco;
    protected long telefone;

    /**
     * Construtor da Classe Cliente.
     * @param nome
     * @param cpf
     * @param cnh
     * @param endereco
     * @param telefone 
     */
    public Cliente(String nome, long cpf, long cnh, String endereco, long telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Metodo de acesso do n?mero da cnh.
     * @return cnh
     */
    public long getCnh() {
        return cnh;
    }

    /**
     * M?todo de acesso do n?mero do cpf.
     * @return cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * M?todo de acesso do endere?o do cliente.
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * M?todo de acesso do Nome da Classe Cliente.
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * M?todo de acesso do n?mero Telefone da Classe Cliente.
     * @return telefone
     */
    public long getTelefone() {
        return telefone;
    }

    /**
     * M?todo modificador da CNH da Classe Cliente.
     * @param cnh 
     */
    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    /**
     * M?todo modificador do CPF da Classe Cliente.
     * @param cpf 
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * M?todo modificador de Endere?o da Classe Cliente.
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * M?todo modificador do Nome da Classe Cliente.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * M?todo modificador do n?mero do Telefone da Classe Cliente.
     * @param telefone
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    /**
     * M?todo toString, retorna dados da Classe Cliente.
     * @return String com os dados do cliente.
     */
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCNH: " + getCnh() + "\nEndereço: " + getEndereco()+ "\nTelefone: " + getTelefone();
    }
    
    /**
     * M?todo resumoInfo, retorna Nome e CPF do Cliente.
     * @return String com o resumo dos dados do Cliente.
     */
    public String resumoInfo() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf();
    }
}
