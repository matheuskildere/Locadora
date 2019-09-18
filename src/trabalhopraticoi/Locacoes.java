/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Classe que representa todas Locações.
 * @author Bruno and Matheus
 */
public class Locacoes implements ILocacoes{
    /**
     * Declaração de uma lista de locações do tipo Locacao.
     */
    public ArrayList<Locacao> listLocacoes;
    
    public Locacoes(){
       listLocacoes = new ArrayList<>();
    }
    
    /**
     * Adiciona uma locação na relação de locações.
     * @param l Locação a ser inserido.
     */
    @Override
    public void add(Locacao l) {
        listLocacoes.add(l);
    }

    /**
     * Captura a locação com o codigo informado por parâmetro.
     * @param codigo Codigo do locação a ser capturado.
     * @return Locação com o codigo informado ou null caso o codigo não for encontrado.
     */
    @Override
    public Locacao get(int codigo) {
        for (Locacao locacaoCadastrada : listLocacoes) {
            if (locacaoCadastrada.getCodigo() == codigo) {
                return locacaoCadastrada;
            }
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes da locação com o codigo informado por parâmetro.
     * @param codigo Codigo da locação a ser capturada.
     * @return String com as informaçoes da locação com o codigo informado por parâmetro 
     * ou null caso o codigo não for encontrado.
     */
    @Override
    public String getInfo(int codigo) {
        Locacao locacaoCapturada = get(codigo);
        if (locacaoCapturada != null) {
            return locacaoCapturada.toString();
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes de todas as locações.
     * @return String com as informaçoes de todas as locações
     * ou null caso não exista nenhuma locação.
     */
    @Override
    public String getInfo() {
        String dados= "";
        for (Locacao locacaoCapturada : listLocacoes) {
            dados += locacaoCapturada.toString();
        }
        return dados;
    }
    
    /**
     * Modifica as informações da locação com o codigo informado por parâmetro.
     * @param codigo Codigo da locação a ser modificada.
     * @param l Locação com as modificações.
     * @return True se a locação com o codigo informado por parâmetro foi modificada ou
     * false caso não exista nenhuma locação com o codigo informado.
     */
    @Override
    public boolean set(int codigo, Locacao novaLocacao) {
        Locacao antigaLocacao = get(codigo);
        if (antigaLocacao != null) {
            antigaLocacao = novaLocacao;
            return true;
        }
        return false;
    }

    /**
     * Remove a locação com o codigo igual ao informado por parâmetro.
     * @param codigo Codigo da locação a ser capturada.
     * @return True se a locação com o codigo informado por parâmetro foi removida ou
     * false caso não exista nenhuma locação com o codigo informado. 
     */
    @Override
    public boolean remove(int codigo) {
        Locacao locacaoRemovida = get(codigo);
        if (locacaoRemovida != null) {
            listLocacoes.remove(locacaoRemovida);
            return true;
        }   
        return false;    
    }

    /**
     * Verifica se existe uma locação com o codigo informado por parâmetro.
     * @param codigo Codigo da locação a ser verificada.
     * @return True se uma locação com o codigo informado for encontrada ou 
     * false caso não exista nenhuma locação com o codigo informado.
     */
    @Override
    public boolean existe(int codigo) {
        if (get(codigo) != null) {
            return true;
        }
        return false;
    }
    
    
}
