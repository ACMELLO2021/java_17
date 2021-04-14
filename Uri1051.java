import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        salario = teclado.nextDouble();

        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario <= 3000){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if (salario <= 4500){
            imposto = (salario - 3000) * 0.18 + 80.0; // os 80 correspondem à faixa entre 2000 e 3000
            System.out.printf("R$ %.2f\n", imposto);
        }
        else {
            imposto = (salario - 4500) * 0.28 + 270 + 80; // 270 da faixa de 3000 a 4500 + 80 da faixa entre 2000 e 3000
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}