import java.util.Scanner;
public class Uri1142v1{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();

        for (int numero = 1; numero <= linhas * 4 ; numero++){
            if (numero % 4 == 0){
                System.out.println("PUM");
            }
            else {
                System.out.print(numero + " ");
            }
        }
    }
}