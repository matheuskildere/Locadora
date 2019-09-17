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
Número de passageiros, número de portas, média de kilometros por
litro e ar-condicionado (sim ou não).
 */
public class Carro extends Veiculo{
    
    private int numPass;
    private int numPort;
    private float medKmLt;
    private boolean arCond;

    public Carro(String placa, int ano, float valorDiaria, int numPass, int numPort, float medKmLt, boolean arCond) {
        super(placa, ano, valorDiaria);
        this.numPass = numPass;
        this.numPort = numPort;
        this.medKmLt = medKmLt;
        this.arCond = arCond;
    }

    public int getNumPass() {
        return numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    public int getNumPort() {
        return numPort;
    }

    public void setNumPort(int numPort) {
        this.numPort = numPort;
    }

    public float getMedKmLt() {
        return medKmLt;
    }

    public void setMedKmLt(float medKmLt) {
        this.medKmLt = medKmLt;
    }

    public boolean isArCond() {
        return arCond;
    }

    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Passageiros: " + getNumPass() + "\nNúmero de Portas: " + getNumPort() + "\nMédia Km por Litro: " + getMedKmLt() + "\nArcondicionado: " + isArCond() ;
    }
}
