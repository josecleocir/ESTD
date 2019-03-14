package dados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite quantos dados serão jogados");
        int i = teclado.nextInt();
        Dado dados[] = new Dado[i];
        for (int j = 0; j < i; j++) {
            System.out.println("digite quantos lados tem  o " + (j + 1) + "º dado que será jogado");
            dados[j] = new Dado(teclado.nextInt());
        }
        System.out.println("Adicione o valor do modificador");
        int modificador = teclado.nextInt();
        System.out.println("Os dados serão lançados:\n");

        for (int j = 0; j < dados.length; j++) {
            System.out.println("Dado " + (j + 1) + " valor: " +""+ dados[j].jogarDado(modificador));
        }
    }

}
