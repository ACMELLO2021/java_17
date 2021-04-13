import java.util.Scanner;

public class Exe2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        // entrada
        System.out.println("Informe a base do triangulo");
        base = teclado.nextDouble();
        System.out.println("Informe a altura do triangulo");
        altura = teclado.nextDouble();

        // processamento
        area = (base * altura) / 2.0;

        // saída
        System.out.printf("A area do triangulo de base %.2f e altura %.2f vale %.2f\n", base, altura, area);
    }
}