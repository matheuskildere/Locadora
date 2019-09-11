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

    public Onibus(String placa, int ano, float valorDiaria) {
        super(placa, ano, valorDiaria);
    }

    private int numPass;
    private String categoria;
    private boolean netSFio;
    private boolean arCond;

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

    public boolean isNetSFio() {
        return netSFio;
    }

    public void setNetSFio(boolean netSFio) {
        this.netSFio = netSFio;
    }

    public boolean isArCond() {
        return arCond;
    }

    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }
    
    
}
