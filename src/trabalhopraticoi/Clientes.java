package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Classe que representa todos clientes.
 * A classe Clientes implementa a interface IClientes.
 * @author Bruno and Matheus
 */
public class Clientes implements IClientes{
    /**
     * ArrayList com todos os clientes cadastrados.
     */
    public ArrayList<Cliente> listClientes;
    
    public Clientes(){
        listClientes  = new ArrayList<>();
    }

    /**
     * Adiciona um cliente na relação de clientes.
     * @param c Cliente a ser inserido.
     */
    @Override
    public void add(Cliente c) {
        listClientes.add(c);
    }

    /**
     * Captura o cliente com o CPF informado por parâmetro.
     * @param CPF CPF do cliente a ser capturado.
     * @return Cliente com o CPF informado ou null caso o CPF não for encontrado.
     */
    @Override
    public Cliente get(long CPF) {
        for(Cliente clienteCadastrado: listClientes){
            if (clienteCadastrado.getCpf() == CPF) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes do cliente com CPF informado por parâmetro.
     * @param CPF CPF do cliente a ser capturado.
     * @return String com as informaçoes do cliente com o CPF informado por parâmetro 
     * ou null caso o CPF não for encontrado.
     */
    @Override
    public String getInfo(long CPF) {
        Cliente cliente = get(CPF);
        if (cliente != null){
                return cliente.toString();
        }
        return null;
    }

    /**
     * Captura uma String com as informaçoes de todos os clientes.
     * @return String com as informaçoes de todos os clientes
     * ou uma string vazia caso não exista nenhum cliente.
     */
    @Override
    public String getInfo() {
        String dados = "";
        for(Cliente clienteCadastrado: listClientes){
            dados += clienteCadastrado.toString();
        }
        return dados;  
    }

    /**
     * Captura uma String com o CPF e o nome de todos os clientes.
     * @return String com o CPF e o nome de todos os clientes
     * ou null caso não exista nenhum cliente.
     */
    @Override
    public String getResumoInfo() {
        String dados = "";
        for(Cliente clienteCadastrado: listClientes){
            dados += clienteCadastrado.resumoInfo();
        }
        return dados;
    }

    /**
     * Modifica as informações do cliente com o CPF informado por parâmetro.
     * @param CPF CPF do cliente a ser modificado.
     * @param novoCliente Cliente com as modificações.
     * @return True se o cliente com o CPF informado por parâmetro for modificado ou
     * false caso não exista nenhum cliente com o CPF informado.
     */
    @Override
    public boolean set(long CPF, Cliente novoCliente) {
        Cliente antigoCliente = get(CPF);
        if(antigoCliente != null){
            antigoCliente = novoCliente;
            return true;
        }
        return false;
    }

    /**
     * Remove o cliente com o CPF igual ao informado por parâmetro.
     * @param CPF CPF do cliente a ser capturado.
     * @return True se o cliente com o CPF informado por parâmetro for removido ou
     * false caso não exista nenhum cliente com o CPF informado. 
     */
    @Override
    public boolean remove(long CPF) {
        Cliente clienteRemovido = get(CPF);
        if (clienteRemovido != null) {
            listClientes.remove(clienteRemovido);
            return true;
        }
        return false;
    }

    /**
     * Verifica se existe um cliente com o CPF informado por parâmetro.
     * @param CPF CPF do cliente a ser verificado.
     * @return True se um cliente com o CPF informado for encontrado ou 
     * false caso não exista nenhum cliente com o CPF informado.
     */
    @Override
    public boolean existe(long CPF) {
        if (get(CPF) != null) {
            return true;
        }
        return false;
    }
    
}