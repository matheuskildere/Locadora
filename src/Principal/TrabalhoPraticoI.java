/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

import trabalhopraticoi.Cliente;
import trabalhopraticoi.Clientes;
import trabalhopraticoi.Locacao;
import trabalhopraticoi.Veiculo;
import trabalhopraticoi.Veiculos;

/**
 * Classe de teste no console
 * @author Bruno and
 *  Matheus
 */
public class TrabalhoPraticoI {

    
    private static Scanner entrada = new Scanner (System.in);

    private static Locacao locacao = new Locacao();
    private static Veiculos veiculo;
    private static Clientes cliente;

    public static void menu(){
        int opcao;
        do{
            System.out.println("\nLocadora");
            System.out.println("1. Locar Carro");
            System.out.println("2. Consultar Locacao");
            System.out.println("3. Consultar cliente");
            
            System.out.println("Qual a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            
            switch(opcao){
                case 1:
                    locar();
                    break;
                case 2:
                    consulta();
                    break;
                case 3: 
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
            
        }while(opcao != 0);
    }
    public static void consulta() {
        System.out.println(locacao.getInfo()); 
    }

    public static void locar() {
        System.out.printf("\nPlaca do carro: ");
        String placa = entrada.nextLine();
        System.out.printf("\nAno: ");
        int ano = entrada.nextInt();
        System.out.printf("\nValor diaria: ");
        float valorDiaria = entrada.nextFloat();
        entrada.nextLine();
        Veiculo veiculoNovo = new Veiculo(placa, ano, valorDiaria);
        veiculo.add(veiculoNovo);
        System.out.printf("\nNome cliente: ");
        String nome = entrada.nextLine();
        System.out.printf("\nCpf: ");
        long cpf = entrada.nextLong();
        System.out.printf("\nCnh: ");
        long cnh = entrada.nextLong();
        entrada.nextLine();
        System.out.printf("\nEndereco: ");
        String endereco= entrada.nextLine();
        System.out.printf("\nTelefone: ");
        long telefone = entrada.nextLong();
        Cliente clienteNovo = new Cliente(nome, cpf);
        cliente.add(clienteNovo);
        Locacao locacaoNova = new Locacao(213, clienteNovo, "28/09", veiculoNovo, true, valorDiaria); 
        locacao.add(locacaoNova);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
}
