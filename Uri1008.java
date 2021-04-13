import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // variaveis
        int numero, numHoras;
        double valorHora, salario;

        // entrada
        numero    = teclado.nextInt();
        numHoras  = teclado.nextInt();
        valorHora = teclado.nextDouble();

        // processamento
        salario  = numHoras * valorHora;

        // saida
        System.out.println("NUMBER = " + numero);
        System.out.printf ("SALARY = U$ %.2f\n", salario);

        //System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, salario);
    }
}