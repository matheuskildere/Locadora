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
 NÃºmero de eixos e carga mÃ¡xima.
 */
public class Caminhao extends Veiculo{
    private int numEixo;
    private float cargMax;

    /**
     * Método Construtor da classe Caminhão.
     * @param placa
     * @param ano
     * @param valorDiaria
     * @param numEixo
     * @param cargMax 
     */
    public Caminhao(String placa, int ano, float valorDiaria,int numEixo, float cargMax) {
        super(placa, ano, valorDiaria);
        this.numEixo = numEixo;
        this.cargMax = cargMax;
    }

    /**
     * Método que retorna o número de eixos do caminhão.
     * @return the numEixo
     */
    public int getNumEixo() {
        return numEixo;
    }
    /**
     * Método que retorna a carga máxima suportada pelo caminhão.
     * @return the cargMax
     */
    public float getCargMax() {
        return cargMax;
    }
    /**
     * Método modificador da carga máxima do caminhão.
     * @param cargMax the cargMax to set
     */
    public void setCargMax(float cargMax) {
        this.cargMax = cargMax;
    }
    /**
     * Método modificador do número de eixos do caminhão.
     * @param numEixo the numEixo to set
     */
    public void setNumEixo(int numEixo) {
        this.numEixo = numEixo;
    }

    /**
     * 
     * Método toString que serve para retornar o número de eixos e a carga máxima de um caaminhão
     */
    @Override
    public String toString() {
        return super.toString() + "\nNumero de Eixos: " + getNumEixo() + "\nCarga Maxima: " + getCargMax() ;
    }
    
    
}
