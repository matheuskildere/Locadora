/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

/**
 * Caminhao
 * @author Bruno and Matheus
 */
/**
 Número de eixos e carga máxima.
 */
public class Caminhao extends Veiculo{
    private int numEixo;
    private float cargMax;

    public Caminhao(String placa, int ano, float valorDiaria) {
        super(placa, ano, valorDiaria);
        numEixo = 0;
        cargMax = 0;
    }

    /**
     * @return the numEixo
     */
    public int getNumEixo() {
        return numEixo;
    }
    /**
     * @return the cargMax
     */
    public float getCargMax() {
        return cargMax;
    }
    /**
     * @param cargMax the cargMax to set
     */
    public void setCargMax(float cargMax) {
        this.cargMax = cargMax;
    }
    /**
     * @param numEixo the numEixo to set
     */
    public void setNumEixo(int numEixo) {
        this.numEixo = numEixo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()  ;
    }
    
    
}
