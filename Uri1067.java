import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt();

        for (int num = 1; num<=limite; num+=2 ) {   // num += 2  equivale a num = num + 2
            System.out.println(num);
        }
    }
}