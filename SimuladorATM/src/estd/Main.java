package estd;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int numagencia;
        int numconta;
        int numsenha;
        int nummenu;
        float saldo = 1000;

        Scanner agencia = new Scanner(System.in);
        System.out.println("Insira aqui seu Agencia:");
        numagencia = agencia.nextInt();



        Scanner conta = new Scanner(System.in);
        System.out.println("Insira aqui sua Conta:");
        numconta = conta.nextInt();



        System.out.println("Insira aqui seu Senha:");
        Scanner senha = new Scanner(System.in);
        numsenha = senha.nextInt();

        System.out.println("Usuario logado com sucesso!");

        System.out.println("Selecione uma das opções a seguir:");

        do{
            System.out.println("(1)Saque");
            System.out.println("(2)Deposito");
            System.out.println("(3)Transferencia");
            System.out.println("(4)Extrato");
            Scanner menu = new Scanner(System.in);
            nummenu = menu.nextInt();

            if (nummenu >4) {
                System.out.println("Voce selecionou uma opcao invalida, tente novamente");
            }

            System.out.println("  ");
        }while(nummenu >4);


        if (nummenu==1){
            System.out.println("Voce selecionou a opção Saque");
            System.out.println("Digite o valor a ser sacado");


        }

        if (nummenu==2){
            System.out.println("Voce selecionou a opção Deposito");
        }
        if (nummenu==3){
            System.out.println("Voce selecionou a opção Transferencia");
        }
        if (nummenu==4){
            System.out.println("Voce selecionou a opção Extrato");
        }
    }
}
