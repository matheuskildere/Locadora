package trabalhopraticoi;

import trabalhopraticoi.Cliente;
import trabalhopraticoi.Veiculo;

/**
 * Classe representa a Locação.
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
    
    /**
     * Construtor da Classe Locação, é responsável por criar o objeto em memória.
     * @param locador
     * @param dataLocacao
     * @param dataDevolucao
     * @param veiculoLocado
     * @param seguro
     * @param valorDiaria 
     */
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
     * Método de acesso ao Codigo da Locação.
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método de acesso a Data da devolução do Veiculo.
     * @return dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Método de acesso a data da locação do veiculo.
     * @return dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }

    /**
     * Método de acesso ao cliente responsável pela locação.
     * @return locador
     */
    public Cliente getLocador() {
        return locador;
    }

    /**
     * Método de acesso ao veículo da locação.
     * @return the veiculoLocado
     */
    public Veiculo getVeiculoLocado() {
        return veiculoLocado;
    }

    /**
     * Método de acesso a informação sobre o seguro do veiculo.
     * @return seguro
     */    
    public boolean getSeguro() {
        return seguro;
    }


    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * Método modificador da data de devolução do veiculo.
     * @param dataDevolucao 
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * Método modificador do veiculo de uma locação.
     * @param veiculoLocado 
     */
    public void setVeiculoLocado(Veiculo veiculoLocado) {
        this.veiculoLocado = veiculoLocado;
    }

    /**
     * Método toString retorna os dados de uma locação.
     * @return dados
     */
    @Override
    public String toString() {
        String dados = "";
        dados += "Codigo: "+getCodigo () +"\nData locacao: "+getDataLocacao() +"\nData devolucao: "+getDataDevolucao() + "\nSeguro: " + getSeguro();
        dados += " \n" +locador.resumoInfo();
        dados += " \n" + veiculoLocado.resumoInfo();
        return dados;
    }
}