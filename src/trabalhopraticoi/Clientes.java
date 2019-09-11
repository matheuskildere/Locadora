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
                String dados = "\nNome: "+ cliente.nome;
                dados += "\nCpf: "+ cliente.cpf;
                dados += "\nCnh: "+ cliente.cnh;
                dados += "\nEndereco: "+ cliente.endereco;
                dados += "\nTelefone: "+ cliente.telefone;
        
                return dados;
        }
        return null;
    }

    @Override
    public String getInfo() {
        for(Cliente clienteCadastrado: listClientes){
            String dados = "\nNome: "+ clienteCadastrado.getNome();
            dados += "\nCpf: "+ clienteCadastrado.getCpf();
            dados += "\nCnh: "+ clienteCadastrado.getCnh();
            dados += "\nEndereco: "+ clienteCadastrado.getEndereco();
            dados += "\nTelefone: "+ clienteCadastrado.getTelefone();
            return dados;
        }
        return null;  
    }

    @Override
    public String getResumoInfo() {
        for(Cliente clienteCadastrado: listClientes){
            String dados = "\nNome: "+ clienteCadastrado.getNome();
            dados += "\nCpf: "+ clienteCadastrado.getCpf();
            return dados;
        }
        return null;
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