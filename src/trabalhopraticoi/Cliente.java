/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Cliente
 * @author Bruno and Matheus
 */
public abstract class Cliente {
    
    protected String nome;
    protected long cpf;
    protected long cnh;
    protected String endereco;
    protected long telefone;

    public Cliente(String nome, long cpf, long cnh, String endereco, long telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * @return the cnh
     */
    public long getCnh() {
        return cnh;
    }
    /**
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the telefone
     */
    public long getTelefone() {
        return telefone;
    }
    /**
     * @param cnh the cnh to set
     */
    public void setCnh(long cnh) {
        this.cnh = cnh;
    }
    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nCNH: " + getCnh() + "\nEndereço: " + getEndereco()+ "\nTelefone: " + getTelefone();
    }
    
    public String resumoInfo() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf();
    }
}
