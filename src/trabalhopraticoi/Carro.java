/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

/**
 *
 * @author Bruno e matheus
 */

public class Carro extends Veiculo{
    
    private int numPass;
    private int numPort;
    private float medKmLt;
    private boolean arCond;

    /**
     * Construtor da Classe Carro.
     * @param placa
     * @param ano
     * @param valorDiaria
     * @param numPass
     * @param numPort
     * @param medKmLt
     * @param arCond 
     */
    public Carro(String placa, int ano, float valorDiaria, int numPass, int numPort, float medKmLt, boolean arCond) {
        super(placa, ano, valorDiaria);
        this.numPass = numPass;
        this.numPort = numPort;
        this.medKmLt = medKmLt;
        this.arCond = arCond;
    }

    /**
    * Método de acesso do Número de passageiros do Carro.
    *  
    */
    public int getNumPass() {
        return numPass;
    }

    /**
    * Método de acesso do número de portas do carro.
    * @return 
    */
    public int getNumPort() {
        return numPort;
    }

    /**
    * Método de acesso da média km por litro do carro.
    * @return 
    */
    public float getMedKmLt() {
        return medKmLt;
    }

    /**
    * Método de acesso da opção de ar condicionado do carro.
    * @return 
    */
    public boolean isArCond() {
        return arCond;
    }

    /**
    * Método modificador do némero de passageiros do carro.
    * @param numPass 
    */
    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }

    /**
    * Método modificador do número de portas do carro.
    * @param numPort 
    */
    public void setNumPort(int numPort) {
        this.numPort = numPort;
    }
    
    /**
    * Método modificador da média de km por litro do carro.
    * @param medKmLt 
    */
    public void setMedKmLt(float medKmLt) {
        this.medKmLt = medKmLt;
    }

    /**
    * Método modificador da opção de ar condicionado.
    * @param arCond 
    */
    public void setArCond(boolean arCond) {
        this.arCond = arCond;
    }
    
    /**
     * Método toString, retorna os dados do carro.
     * @return String com dados
     */
    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Passageiros: " + getNumPass() + "\nNúmero de Portas: " + getNumPort() + "\nMédia Km por Litro: " + getMedKmLt() + "\nArcondicionado: " + isArCond() ;
    }
}
