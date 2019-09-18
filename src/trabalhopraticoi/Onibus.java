/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

/**
 * Classe que representa Onibus
 * @author Bruno and Matheus
 */
public class Onibus extends Veiculo{
    private int numPass;
    private String categoria;
    private boolean wifi;
    private boolean arCond;

    /**
     * Construtor da classe Onibus.
     * @param placa
     * @param ano
     * @param valorDiaria
     * @param numPass
     * @param categoria
     * @param wifi
     * @param arCond
     */
    public Onibus(String placa, int ano, float valorDiaria, int numPass, String categoria, boolean wifi, boolean arCond) {
        super(placa, ano, valorDiaria);
        this.numPass = numPass;
        this.categoria = categoria;
        this.wifi = wifi;
        this.arCond = arCond;
    }

    /**
    * Método getNumPass, retorna o número de passageiros do onibus.
    * @return numPass
    */
    public int getNumPass() {
        return numPass;
    }

    /**
    * Método getCategoria, retorna a categoria do onibus.
    * @return categoria
    */
    public String getCategoria() {
        return categoria;
    }
    
    /**
    * Método isWifi, retorna se há wifi no onibus.
    * @return wifi
    */
    public boolean isWifi() {
        return wifi;
    }

    /**
    * Método isArCond, retorna se há ar condicionado no onibus.
    * @return arCond
    */
    public boolean isArCond() {
        return arCond;
    }

    /**
    * Método setNumPass, modifica o número de passageiros do onibus.
    * @param numPass 
    */
    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    /**
    * Método setCategoria, modifica a categoria do onibus.
    * @param categoria 
    */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
    * Método setWifi, modifica a opção de Wifi.
    * @param wifi 
    */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /**
    * Método setArCond, modifica a opção de ar condicionado.
    * @param arCond 
    */
    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }
    
    /**
     * Método toString retorna os dados do onibus.
     * @return String com Dados.
     */
    public String toString(){
        return super.toString() + "\nNúmero Passageiros: " + getNumPass() + "\nCategoria: " + getCategoria() + "\nInternet: " + isWifi() + "\nArcondicionado: " + isArCond();
    }
    
}
