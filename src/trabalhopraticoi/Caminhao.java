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

    /**
     * Metodo Construtor da classe Caminhao.
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
     * Metodo que retorna o numero de eixos do caminhao.
     * @return the numEixo
     */
    public int getNumEixo() {
        return numEixo;
    }
    /**
     * Metodo que retorna a carga maxima suportada pelo caminhao.
     * @return the cargMax
     */
    public float getCargMax() {
        return cargMax;
    }
    /**
     * Metodo modificador da carga maxima do caminhao.
     * @param cargMax the cargMax to set
     */
    public void setCargMax(float cargMax) {
        this.cargMax = cargMax;
    }
    /**
     * Metodo modificador do numero de eixos do caminhao.
     * @param numEixo the numEixo to set
     */
    public void setNumEixo(int numEixo) {
        this.numEixo = numEixo;
    }

    /**
     * 
     * Metodo toString que serve para retornar o numero de eixos e a carga maxima de um caminhao
     */
    @Override
    public String toString() {
        return super.toString() + "\nNumero de Eixos: " + getNumEixo() + "\nCarga Maxima: " + getCargMax() ;
    }
    
    
}
