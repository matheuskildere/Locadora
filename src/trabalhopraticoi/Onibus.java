/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

/**
 *
 * @author Bruno
 */

/**
Número de passageiros, categoria (leito, executivo ou convencional),
serviço de internet sem fio (sim ou não) e ar-condicionado (sim ou não).
 */
public class Onibus extends Veiculo{
    private int numPass;
    private String categoria;
    private boolean wifi;
    private boolean arCond;

    public Onibus(String placa, int ano, float valorDiaria, int numPass, String categoria, boolean wifi, boolean arCond) {
        super(placa, ano, valorDiaria);
        this.numPass = numPass;
        this.categoria = categoria;
        this.wifi = wifi;
        this.arCond = arCond;
    }

    public int getNumPass() {
        return numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isArCond() {
        return arCond;
    }

    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }
    
    public String toString(){
        return super.toString() + "\nNúmero Passageiros: " + getNumPass() + "\nCategoria: " + getCategoria() + "\nInternet: " + isWifi() + "\nArcondicionado: " + isArCond();
    }
    
}
