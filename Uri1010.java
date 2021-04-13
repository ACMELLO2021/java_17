import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codP1, qtdP1, codP2, qtdP2;
        double vlP1, vlP2, total;

        // entrada
        codP1 = teclado.nextInt();
        qtdP1 = teclado.nextInt();
        vlP1  = teclado.nextDouble();

        codP2 = teclado.nextInt();
        qtdP2 = teclado.nextInt();
        vlP2  = teclado.nextDouble();

        // processamento
        total = (qtdP1 * vlP1) + (qtdP2 * vlP2);

        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);



    }
}