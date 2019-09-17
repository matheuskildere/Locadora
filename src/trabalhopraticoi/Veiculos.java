package trabalhopraticoi;

import java.util.ArrayList;
/**
 * Veiculos
 * @author Bruno and Matheus
 */
public class Veiculos implements IVeiculos {
    public ArrayList<Veiculo> listVeiculos;

    public Veiculos(){
        listVeiculos = new ArrayList<>();
    }


    @Override
    public void add(Veiculo v) {
        listVeiculos.add(v);
    }

    @Override
    public Veiculo get(String placa) {
        for (Veiculo veiculoCadastrado : listVeiculos){
            if (veiculoCadastrado.getPlaca().equals(placa)) {
                return veiculoCadastrado;
            }
        }
        return null;
    }

    @Override
    public String getInfo(String placa) {
        Veiculo veiculoCapturado = get(placa);
        if (veiculoCapturado != null) {
            return veiculoCapturado.toString();
        }
        return null;
    }

    @Override
    public String getInfo() {
        for(Veiculo veiculosCapturados : listVeiculos){
            String dados = "\nPlaca: "+ veiculosCapturados.getPlaca();
            return dados;
        }
        return null;
    }

    @Override
    public String getResumoInfo() {
        for(Veiculo veiculosCapturados : listVeiculos){
            String dados = "\nPlaca: "+ veiculosCapturados.getPlaca();
            dados += "\nAno: "+ veiculosCapturados.getAno();
            dados += "\nValor da Diaria: R$"+ veiculosCapturados.getValorDiaria();
            return dados;
        }
        return null;
    }

    @Override
    public boolean set(String placa, Veiculo novoVeiculo) {
        Veiculo antigoVeiculo = get(placa);
        if(get(placa) != null){
            antigoVeiculo = novoVeiculo;
            return  true;
        }
        return false;
    }

    @Override
    public boolean remove(String placa) {
        Veiculo veiculoRemove = get(placa);
        if(veiculoRemove != null){
            listVeiculos.remove(veiculoRemove);
            return  true;
        }
        return false;
    }

    @Override
    public boolean existe(String placa) {
        if (get(placa) != null) {
            return true;
        }
        return false;
    }
    
}