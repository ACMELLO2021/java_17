import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idadeEmDias, qtdAnos, qtdMeses, qtdDias;

        idadeEmDias = teclado.nextInt();

        qtdAnos = idadeEmDias / 365;
        qtdMeses = (idadeEmDias % 365) / 30;
        qtdDias  = ((idadeEmDias % 365) % 30);

        System.out.println(qtdAnos  + " ano(s)");
        System.out.println(qtdMeses + " mes(es)");
        System.out.println(qtdDias  + " dia(s)");

    
    }
}