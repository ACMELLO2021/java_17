import java.util.Scanner;

public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a, b, c;
        float per, area;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if ( a + b > c && a + c > b && b + c > a){
            per = a + b + c;
            System.out.printf("Perimetro = %.1f\n",per);
        }
        else{
            area = (a + b)*c / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}