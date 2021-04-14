import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtde = 0;
        float numero;

        for (int contador=1; contador <= 6; contador = contador + 1){
            numero = teclado.nextFloat();
            if (numero > 0){
                qtde = qtde + 1;
            }
        }

        System.out.println(qtde+ " valores positivos");
        
    }
}