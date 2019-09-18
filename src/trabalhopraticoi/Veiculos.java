package trabalhopraticoi;

import java.util.ArrayList;
/**
 * Classe que representa todos Veiculos
 * @author Bruno and Matheus
 */
public class Veiculos implements IVeiculos {
    /**
     * Lista de veiculos cadastrados no sistema
     */
    public ArrayList<Veiculo> listVeiculos;

    public Veiculos(){
        listVeiculos = new ArrayList<>();
    }

    /**
     * Adiciona um veiculo na relação de veiculos.
     * @param v Veiculo a ser inserido.
     */
    @Override
    public void add(Veiculo v) {
        listVeiculos.add(v);
    }

    /**
     * Captura o veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return Veiculo com a placa informada ou null em caso da placa não ser encontrada.
     */
    @Override
    public Veiculo get(String placa) {
        for (Veiculo veiculoCadastrado : listVeiculos){
            if (veiculoCadastrado.getPlaca().equals(placa)) {
                return veiculoCadastrado;
            }
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes do veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return String com as informaçoes do veiculo com a placa informada por parâmetro 
     * ou null em caso da placa não ser encontrada.
     */
    @Override
    public String getInfo(String placa) {
        Veiculo veiculoCapturado = get(placa);
        if (veiculoCapturado != null) {
            return veiculoCapturado.toString();
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes de todos os veiculos.
     * @return String com as informaçoes de todos os veiculos 
     * ou null caso não exista nenhum veiculo.
     */
    @Override
    public String getInfo() {
        String dados = "";
        for(Veiculo veiculosCapturados : listVeiculos){
            dados += veiculosCapturados.toString()+ "\n\n";
        }
        if(dados != ""){
            return dados;
        } 
        return null;
    }

    /**
     * Captura uma String com a placa, o ano e o valor da diaria de todos os veiculos.
     * @return String com a placa, o ano e o valor da diaria de todos os veiculos 
     * ou null caso não exista nenhum veiculo.
     */
    @Override
    public String getResumoInfo() {
        String dados = "";
        for(Veiculo veiculosCapturados : listVeiculos){
            dados += veiculosCapturados.resumoInfo() + "\n\n";
        }
        if(dados != ""){
            return dados;
        } 
        return null;
    }

    /**
     * Modifica as informações do veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser modificado.
     * @param v Veiculo com as modificações.
     * @return True se o veiculo com a placa informada por parâmetro for modificado ou
     * false caso não exista nenhum veiculo com a placa informada.
     */
    @Override
    public boolean set(String placa, Veiculo novoVeiculo) {
        Veiculo antigoVeiculo = get(placa);
        if(get(placa) != null){
            antigoVeiculo = novoVeiculo;
            return  true;
        }
        return false;
    }

    /**
     * Remove o veiculo com placa igual a informada por parâmetro.
     * @param placa Placa do veiculo a ser capturado.
     * @return True se o veiculo com a placa informada por parâmetro for removido ou
     * false caso não exista nenhum veiculo com a placa informada. 
     */
    @Override
    public boolean remove(String placa) {
        Veiculo veiculoRemove = get(placa);
        if(veiculoRemove != null){
            listVeiculos.remove(veiculoRemove);
            return  true;
        }
        return false;
    }

    /**
     * Verifica se existe um veiculo com a placa informada por parâmetro.
     * @param placa Placa do veiculo a ser verificada.
     * @return True se um veiculo com a placa informada for encontrado ou 
     * false caso não exista nenhum veiculo com a placa informada.
     */
    @Override
    public boolean existe(String placa) {
        if (get(placa) != null) {
            return true;
        }
        return false;
    }
    
}