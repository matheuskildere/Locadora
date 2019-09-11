/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 *
 * @author Bruno and Matheus
 */
public class Locacao implements ILocacoes{
    private ArrayList<Locacao> listLocacoes;
    private Cliente locador;
    private Veiculo veiculoLocado;
    private int codigo;
    private String dataLocacao;
    private String dataDevolucao;
    private boolean seguro;
    private float valorDiaria;
    
    public Locacao(){
       listLocacoes = new ArrayList<>();
    }
    
    public Locacao (int codigo, Cliente locador, String dataLocacao, Veiculo veiculoLocado, boolean seguro, float valorDiaria){
        this.codigo = codigo;
        this.locador = locador;
        this.dataLocacao = dataLocacao;
        this.veiculoLocado = veiculoLocado;
        this.seguro = seguro;
        this.valorDiaria = valorDiaria;
    }

    @Override
    public void add(Locacao l) {
        listLocacoes.add(l);
    }

    @Override
    public Locacao get(int codigo) {
        for (Locacao locacaoCadastrada : listLocacoes) {
            if (locacaoCadastrada.codigo == codigo) {
                return locacaoCadastrada;
            }
        }
        return null;
    }

    @Override
    public String getInfo(int codigo) {
        Locacao locacaoCapturada = get(codigo);
        if (locacaoCapturada != null) {
            String dados = locacaoCapturada.locador.toString();
            dados += locacaoCapturada.veiculoLocado.toString();
            dados += "\nCodigo da Locacao: "+ locacaoCapturada.codigo;
            dados += "\nData: "+ locacaoCapturada.dataLocacao;
            dados += "\nPossui seguro: "+ locacaoCapturada.seguro;
            return dados;
        }
        return null;
    }

    @Override
    public String getInfo() {
        String dados= "";
        for (Locacao locacaoCapturada : listLocacoes) {
            dados = locacaoCapturada.locador.toString();
            dados += locacaoCapturada.veiculoLocado.toString();
            dados += "\nCodigo da Locacao: "+ locacaoCapturada.codigo;
            dados += "\nData: "+ locacaoCapturada.dataLocacao;
            dados += "\nPossui seguro: "+ locacaoCapturada.seguro;
        }
        return dados;
    }

    @Override
    public boolean set(int codigo, Locacao novaLocacao) {
        Locacao antigaLocacao = get(codigo);
        if (antigaLocacao != null) {
            antigaLocacao = novaLocacao;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int codigo) {
        Locacao locacaoRemovida = get(codigo);
        if (locacaoRemovida != null) {
            listLocacoes.remove(locacaoRemovida);
            return true;
        }   
        return false;    
    }

    @Override
    public boolean existe(int codigo) {
        if (get(codigo) != null) {
            return true;
        }
        return false;
    }
    
    
}
