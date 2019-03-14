package estd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numAgencia;
        int numConta;
        int numSenha;
        int nummenu;
        float saldo = 1000;
        String conta;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Precisamos cadastrar a sua conta!\n");
        System.out.println("Insira aqui seu Agencia:");
        numAgencia = teclado.nextInt();

        System.out.println("Insira aqui sua Conta:");
        numConta = teclado.nextInt();

        System.out.println("Insira aqui seu Senha:");

        numSenha = teclado.nextInt();
        Conta minhaConta = new Conta(numAgencia, numConta, numSenha, saldo);
        boolean flag = true;

        System.out.println("\n\nMenu de login\n\n");

        do {
            System.out.println("insira a sua conta com o formato a seguir agencia-conta, exemplo: 15-2548\n");
            conta = teclado.next();
            if(conta.equals(minhaConta.getNumagencia()+"-"+minhaConta.getNumconta())) {
                System.out.println("insira a sua senha:\n");
                int senha = teclado.nextInt();
                if(senha == minhaConta.getNumsenha()) {
                    System.out.println("Usuario logado com sucesso!\n");
                    flag = false;
                }else {
                    System.out.println("Senha incorreta!\n");
                }
            }else {
                System.out.println("A conta não existe!\n");
            }
        }while(flag);



        System.out.println("Selecione uma das opções a seguir:");

        do {
            System.out.println("(1)Saque");
            System.out.println("(2)Deposito");
            System.out.println("(3)Transferencia");
            System.out.println("(4)Extrato");
            System.out.println("(5)Sair");

            nummenu = teclado.nextInt();

            if (nummenu > 5) {
                System.out.println("Voce selecionou uma opcao invalida, tente novamente");
            }

            System.out.println("  ");

            if (nummenu == 1) {
                System.out.println("Voce selecionou a opção Saque");
                System.out.println("Digite o valor a ser sacado");
                System.out.println(minhaConta.sacar(teclado.nextFloat()));
            }

            if (nummenu == 2) {
                System.out.println("Voce selecionou a opção Deposito");
                System.out.println(minhaConta.depositar(teclado.nextFloat()));
            }
            if (nummenu == 3) {
                System.out.println("Voce selecionou a opção Transferencia");
                System.out.println(
                        "Digite o numero da conta a receber o valor (nro da agencia-conta, exemplo: 2-1503)");
                conta = teclado.next();

                System.out.println("Digite o valor a ser transferido");
                System.out.println(minhaConta.transferir(teclado.nextFloat(), conta));
            }
            if (nummenu == 4) {
                System.out.println("Voce selecionou a opção Extrato");
                System.out.println(minhaConta.verExtrato());
            }
            if (nummenu == 5) {
                System.out.println("Voce selecionou a opção Sair");
            }
        } while (nummenu != 5);
    }
}
