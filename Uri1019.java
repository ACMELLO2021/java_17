import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, qtHor, qtMin, qtSeg, resto;

        tempo = teclado.nextInt();

        qtHor = tempo / 3600;
        resto = tempo % 3600; // ou  resto = tempo - qtdHoras * 3600

        qtMin = resto / 60;
        qtSeg = resto % 60;   // ou resto = resto - qtdMin * 60

        System.out.println(qtHor + ":" + qtMin + ":" + qtSeg);
    }
}