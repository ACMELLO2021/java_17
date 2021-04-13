import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario;
        double novoSalario, reajuste;
        int    percentual;

        salario = teclado.nextDouble();

        if (salario <= 400.0){
            percentual = 15;
        }
        else if (salario <= 800.0){
            percentual = 12;
        }
        else if (salario <= 1200.0){
            percentual = 10;
        }
        else if (salario <= 2000.0){
            percentual = 7;
        }
        else{
            percentual = 4;
        }

        reajuste = salario * percentual / 100.0;
        novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }
}