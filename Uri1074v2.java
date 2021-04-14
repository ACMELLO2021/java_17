import java.util.Scanner;

public class Uri1074v2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt(); // li a quantidade de elementos;
        int X;

        for (int cont=1; cont<=N; cont++){
            X = teclado.nextInt();
            if (X == 0){
                System.out.println("NULL");
            }
            else{
                //System.out.print( ( ( X % 2 == 0)?"EVEN ":"ODD ")   );
                //System.out.println( ( ( X > 0     )?"POSITIVE":"NEGATIVE") );

                System.out.println( ( ( X % 2 == 0 )?"EVEN ":"ODD ")  + ( ( X > 0 )?"POSITIVE":"NEGATIVE") );
            }
            
        }

    }
}