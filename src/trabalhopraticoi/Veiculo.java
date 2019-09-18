/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Classe abstrata que representa Veiculo
 * @author Bruno and Matheus
 */
public abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected float valorDiaria;

    /**
     * Construtor da Classe Veiculo.
     * @param placa
     * @param ano
     * @param valorDiaria 
     */
    public Veiculo(String placa, int ano, float valorDiaria){
        this.placa = placa;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    /**
    * Método getPlaca, retorna a placa do Veiculo.
    * @return placa
    */
    public String getPlaca() {
        return placa;
    }

    /**
    * Método getAno retorna o ano do Veiculo.
    * @return ano 
    */
    public int getAno() {
        return ano;
    }

    /**
     * Método getValorDiaria retorna o valor da diaria de um Veiculo.
     * @return valorDiaria 
     */
    public float getValorDiaria() {
        return valorDiaria;
    }

    /**
     * Método setPlaca modifica a placa de um Veiculo.
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Método setAno modifica o ano de um Veiculo.
     * @param ano 
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Método setValorDiaria modifica o valor da diaria de um Veiculo.
     * @param valorDiaria 
     */
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    /**
     * Método resumoInfo retorna o resumo dos dados de um Veiculo.
     * @return String com resumo das informacoes 
     */
    public String resumoInfo() {
       return "Placa: " + getPlaca() + "\nAno: " + getAno() + "\nValor Diaria: " + getValorDiaria(); 
    }

    /**
    * Método toString retorna os dados do Veiculo.
    * @return String com os dados do veiculo. 
    */
    @Override
    public String toString(){
        return "Placa: " + getPlaca() + "\nAno: "+ getAno() +"\nValor: " +getValorDiaria();
    }

   
}