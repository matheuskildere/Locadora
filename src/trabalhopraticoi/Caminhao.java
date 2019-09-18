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
     * M�todo Construtor da classe Caminh�o.
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
     * M�todo que retorna o n�mero de eixos do caminh�o.
     * @return the numEixo
     */
    public int getNumEixo() {
        return numEixo;
    }
    /**
     * M�todo que retorna a carga m�xima suportada pelo caminh�o.
     * @return the cargMax
     */
    public float getCargMax() {
        return cargMax;
    }
    /**
     * M�todo modificador da carga m�xima do caminh�o.
     * @param cargMax the cargMax to set
     */
    public void setCargMax(float cargMax) {
        this.cargMax = cargMax;
    }
    /**
     * M�todo modificador do n�mero de eixos do caminh�o.
     * @param numEixo the numEixo to set
     */
    public void setNumEixo(int numEixo) {
        this.numEixo = numEixo;
    }

    /**
     * 
     * M�todo toString que serve para retornar o n�mero de eixos e a carga m�xima de um caaminh�o
     */
    @Override
    public String toString() {
        return super.toString() + "\nNumero de Eixos: " + getNumEixo() + "\nCarga Maxima: " + getCargMax() ;
    }
    
    
}
