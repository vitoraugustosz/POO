package ads.poo;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    private ArrayList<Conta> contas; //nomeado desta forma para fins educativos

    public App(){
        this.contas = new ArrayList<>();
    }

    public static void main(String[] args){ //Saída inicial, menu de escolha do usuário
        //método "polvo cozinheiro", redirecionando e puxando de acordo com o optado pelo usuário
        App app = new App();
        int entrada;
        do {
            System.out.printf("""
                    
                    ..::: Menu :::..
                    1 - Cadastrar conta
                    2 - Listar todas as contas
                    3 - Depositar em uma conta
                    4 - Sacar de uma conta
                    5 - Sair
                    """);
            entrada = Integer.valueOf(IO.readln("Entre com uma opção: "));
            app.menu(entrada);
        } while(entrada != 5);
    }

    //switch case da opção escolhida pelo usuario
    //processa o que foi escolhido pelo usuario
    private void menu(int e) {
        switch(e){
            case 1 -> this.cadastrar();

            case 2 -> this.listarTodas();

            case 3 -> this.depositar();

            case 4 -> this.sacar();

            case 5 -> {
                return;
            }

            default -> {
                System.out.println("Valor inválido");
                return;
            }

        }

    }


    // 1
    // função/método que é chamado quando usuário decide cadastrar uma conta, que é salva na arraylist
    private void cadastrar(){
        String titular = IO.readln("Nome do titular: ");
        double saldo = Double.valueOf(IO.readln("Saldo inicial: "));
        Conta novaConta = new Conta(titular, saldo);
        System.out.printf("O número da sua conta é %d, favor, lembrar", novaConta.getId());
        this.contas.add(novaConta);
    }

    //2

    private void listarTodas(){
        contas.forEach(elemento -> System.out.println(elemento.toString()));
    }

    //3
    private void depositar(){

        int numConta = Integer.parseInt(IO.readln("Qual o número da sua conta?"));
        contas.forEach(conta -> { //passar por cada conta e procurar uma conta com esse id
            if (conta.getId() == numConta){
                double qtd = Double.valueOf(IO.readln("Qual valor será depositado?"));
                var saldoAnterior = conta.getSaldo();
                conta.depositar(qtd);
                if (saldoAnterior == conta.getSaldo()) {
                    System.out.println("Não foi possível realizar o depósito. Somente valores positivos");
                }
                return;
            }
            System.out.println("Não há uma conta com esse cadastro");
        });
    }

    private void sacar() {
        int numConta = Integer.parseInt(IO.readln("Qual o número da sua conta?"));
        contas.forEach(conta -> { //passar por cada conta e procurar uma conta com esse id
            if (conta.getId() == numConta){
                double qtd = Double.valueOf(IO.readln("Qual valor será sacado?"));
                var saldoAnterior = conta.getSaldo();
                conta.sacar(qtd);
                if (saldoAnterior == conta.getSaldo()) {
                    System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
                }
                return;
            }
            System.out.println("Não há uma conta com esse cadastro");
        });
    }


}
