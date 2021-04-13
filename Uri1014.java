import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int dist;
        double qtdLitros, consumoMedio;

        dist = teclado.nextInt();
        qtdLitros = teclado.nextDouble();

        consumoMedio = dist/qtdLitros;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}