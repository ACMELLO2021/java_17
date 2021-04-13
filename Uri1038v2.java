import java.util.Scanner;

public class Uri1038v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, qtde;
        double total;

        // entrada
        codigo = teclado.nextInt();
        qtde   = teclado.nextInt();

        if (codigo == 1){   // código vale 1?
            total = qtde * 4.0;
        }
        else if (codigo == 2){ // o código então é 2?
            total = qtde * 4.5;
        }
        else if (codigo == 3){ // o código então é 3?
            total = qtde * 5.0;
        }
        else if (codigo == 4){ // o código então é 4?
            total = qtde * 2.0;
        }
        else{ // se não for, NESTE PROBLEMA, só pode ser então 5
            total = qtde * 1.50;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}