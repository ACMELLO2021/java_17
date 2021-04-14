import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt(); // N será o meu limitante superior (o máximo a ser atingido)

        for (int num=2; num <= N; num += 2){
            System.out.println(num + "^2 = "+ (int)Math.pow(num, 2));
        }
    }
}