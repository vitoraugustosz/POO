package ads.poo;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    private ArrayList<Conta> contas;

    // função/método que é chamado quando usuário decide cadastrar uma conta, que é salva na arraylist
    private static void cadastrar(){
        Conta conta1 = new Conta();
    }

    public static void main(String[] args){
        App app = new App();
        System.out.printf("""
                    
                ..::: Menu :::..
                1 - Cadastrar conta
                2 - Listar todas as contas
                3 - Depositar em uma conta
                4 - Sacar de uma conta
                5 - Sair
                """);
        int entrada = IO.readln("Entre com uma opção: ");
        app.menu(entrada);
    }

    //switch case da opção escolhida pelo usuario
    private static void menu(int e) {
        switch(e){
            case 1 -> {
                IO.readln();
            }
        }

    }
}
