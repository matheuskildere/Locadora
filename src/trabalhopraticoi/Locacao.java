package trabalhopraticoi;

import trabalhopraticoi.Cliente;
import trabalhopraticoi.Veiculo;

/**
 * Locacao
 */
public class Locacao {
    public static int numCodigo = 1;

    private Cliente locador;
    private Veiculo veiculoLocado;
    private int codigo;
    private String dataLocacao;
    private String dataDevolucao;
    private boolean seguro;
    private float valorDiaria;
    
    public Locacao (Cliente locador, String dataLocacao, String dataDevolucao ,Veiculo veiculoLocado, boolean seguro, float valorDiaria){
        this.codigo = numCodigo;
        this.locador = locador;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.veiculoLocado = veiculoLocado;
        this.seguro = seguro;
        this.valorDiaria = valorDiaria;
        numCodigo++;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }
    /**
     * @return the locador
     */
    public Cliente getLocador() {
        return locador;
    }
    /**
     * @return the veiculoLocado
     */
    public Veiculo getVeiculoLocado() {
        return veiculoLocado;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean getSeguro() {
        return seguro;
    }

    /**
     * @param veiculoLocado the veiculoLocado to set
     */
    public void setVeiculoLocado(Veiculo veiculoLocado) {
        this.veiculoLocado = veiculoLocado;
    }

    @Override
    public String toString() {
        String dados = "";
        dados += "Codigo: "+getCodigo () +"\nData locacao: "+getDataLocacao() +"\nData devolucao: "+getDataDevolucao();
        dados += " \n" +locador.resumoInfo();
        dados += " \n" + veiculoLocado.resumoInfo();
        return dados;
    }
}