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
public class Locacoes implements ILocacoes{
    private ArrayList<Locacao> listLocacoes;
    
    public Locacoes(){
       listLocacoes = new ArrayList<>();
    }
    

    @Override
    public void add(Locacao l) {
        listLocacoes.add(l);
    }

    @Override
    public Locacao get(int codigo) {
        for (Locacao locacaoCadastrada : listLocacoes) {
            if (locacaoCadastrada.getCodigo() == codigo) {
                return locacaoCadastrada;
            }
        }
        return null;
    }

    @Override
    public String getInfo(int codigo) {
        Locacao locacaoCapturada = get(codigo);
        if (locacaoCapturada != null) {
            return locacaoCapturada.toString();
        }
        return null;
    }

    @Override
    public String getInfo() {
        String dados= "";
        for (Locacao locacaoCapturada : listLocacoes) {
            dados += locacaoCapturada.toString();
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
