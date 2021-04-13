import java.util.Scanner;

public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a Nota 1");
        n1 = teclado.nextDouble();
        System.out.println("Digite a Nota 2");
        n2 = teclado.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("Sua media vale "+media);

        if (media >= 6.0) {
            System.out.println("Parabéns! Você está aprovado");
        }
        else {
            System.out.println("Oba, nos vemos no ano que vem!");
        }
    }
}