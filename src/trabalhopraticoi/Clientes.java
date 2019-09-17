package trabalhopraticoi;

import java.util.ArrayList;

/**
 * Clientes
 * @author Bruno and Matheus
 */
public class Clientes implements IClientes{
    private ArrayList<Cliente> listClientes;
    
    public Clientes(){
        listClientes  = new ArrayList<>();
    }


    @Override
    public void add(Cliente c) {
        listClientes.add(c);
    }

    @Override
    public Cliente get(long CPF) {
        for(Cliente clienteCadastrado: listClientes){
            if (clienteCadastrado.getCpf() == CPF) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public String getInfo(long CPF) {
        Cliente cliente = get(CPF);
        if (cliente != null){
                return cliente.toString();
        }
        return null;
    }

    @Override
    public String getInfo() {
        String dados = "";
        for(Cliente clienteCadastrado: listClientes){
            dados += clienteCadastrado.toString();
        }
        return dados;  
    }

    @Override
    public String getResumoInfo() {
        String dados = "";
        for(Cliente clienteCadastrado: listClientes){
            dados += clienteCadastrado.resumoInfo();
        }
        return dados;
    }

    @Override
    public boolean set(long CPF, Cliente novoCliente) {
        Cliente antigoCliente = get(CPF);
        if(antigoCliente != null){
            antigoCliente = novoCliente;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(long CPF) {
        Cliente clienteRemovido = get(CPF);
        if (clienteRemovido != null) {
            listClientes.remove(clienteRemovido);
            return true;
        }
        return false;
    }

    @Override
    public boolean existe(long CPF) {
        if (get(CPF) != null) {
            return true;
        }
        return false;
    }
    
}