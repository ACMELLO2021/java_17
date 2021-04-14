import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();

        // X é meu ponto de partida
        if (X % 2 == 0){  //se X for par, então meu ponto de partida é o próximo numero
            X++;
        }

        for (int cont=1; cont<=6; cont++){
            System.out.println(X);
            X+=2;
        }
    }
}