import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, qtPar, qtImp, qtPos, qtNeg;

        qtPar = 0;
        qtImp = 0;
        qtPos = 0;
        qtNeg = 0;

        for (int cont =1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                qtPar++;
            }
            else{
                qtImp++;
            }

            if (numero > 0){
                qtPos++;
            }
            else if (numero < 0){
                qtNeg++;
            }
        }
        System.out.println(qtPar + " valor(es) par(es)");
        System.out.println(qtImp + " valor(es) impar(es)");
        System.out.println(qtPos + " valor(es) positivo(s)");
        System.out.println(qtNeg + " valor(es) negativo(s)");
    }
}