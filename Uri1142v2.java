import java.util.Scanner;
public class Uri1142v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();
        int numero = 1;

        for (int numLinha = 1; numLinha <= linhas; numLinha++){
            System.out.println( numero + " " + (numero+1) + " " + (numero+2) + " PUM");
            numero = numero + 4;
        }
    }
}