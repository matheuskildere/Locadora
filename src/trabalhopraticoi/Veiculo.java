/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Veiculo
 * @author Bruno and Matheus
 */

/**
 A locadora trabalha com o aluguel de veículos, onde cada veículo tem, no mínimo, os
seguintes dados: placa, ano e valor da diária. Carro, ônibus e caminhão são tipos de veículos
que atualmente podem ser locados. Além dos atributos comuns de todos os veículos, cada
tipo possui um conjunto extra de dados
 */
public abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected float valorDiaria;

    public Veiculo(String placa, int ano, float valorDiaria){
        this.placa = placa;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
     public String resumoInfo() {
       return "\nPlaca: " + getPlaca() + "\nAno: " + getAno() + "\nValor Diaria: " + getValorDiaria(); 
    }

    @Override
    public String toString(){
        return "Placa: " + getPlaca() + "\nAno: "+ getAno() +"\nValor: " +getValorDiaria();
    }

   
}