import java.util.Scanner;

public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A,B,C, aQua, aTri, aTra, aCir, aRet;

        // entrada 
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // processamentos
        aTri = A * C / 2;
        aCir = 3.14159 * C * C;
        aTra = (A + B) * C / 2;
        aQua = B * B;
        aRet = A * B;

        // saída
        System.out.printf("TRIANGULO: %.3f\n", aTri);
        System.out.printf("CIRCULO: %.3f\n", aCir);
        System.out.printf("TRAPEZIO: %.3f\n", aTra);
        System.out.printf("QUADRADO: %.3f\n", aQua);
        System.out.printf("RETANGULO: %.3f\n", aRet);
    }
}