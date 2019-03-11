package ESTD;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;
        int d6[];
        d6 = new int [6];
        int contador;

        for(contador=0; contador <6; contador++) {
            d6[contador] = contador + 1;

            System.out.println("numeros:" + d6[contador]);
        }

        do{
            System.out.println("(1)Para enfrentar o vampiro: (2 d6)");
            System.out.println("(2)Para enfrentar o dragao: (1 d8)");
            System.out.println("(3)Para virar um bruxo: (2 d4)");
            System.out.println("(4)Para virar um rei: (1 d10)");
            System.out.println("(5)Para matar a rainha: (1 d12)");
            System.out.println("(6)Para derrotar o troll: (2 d16)");
            System.out.println("(7)Para sair correndo: (1 d8 + 2)");
            System.out.println("(8)Para deixar o jogo: (1 d6 + 1)");
            Scanner numopcao = new Scanner(System.in);
            opcao = numopcao.nextInt();



            if (opcao==1){
                System.out.println("Voce selecionou a opção de  enfrentar o vampiro: (2 d6)");
                System.out.println("Para sucesso deve se tirar 7");




            }
        }while(opcao <=7);




    }
}
