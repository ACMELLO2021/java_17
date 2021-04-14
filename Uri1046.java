import java.util.Scanner;

public class Uri1046{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int hI, hF, tempo;

        hI = teclado.nextInt();
        hF = teclado.nextInt();

        tempo = hF - hI;

        if (tempo <= 0){
            tempo = tempo + 24;  // se for negativo ou 0, significa que começou em um dia e terminou em outro
        }

        System.out.println("O JOGO DUROU "+tempo+" HORA(S)");

    }
}