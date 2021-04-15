import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int combustivel;
        int qtdAlc, qtdGas, qtdDie;

        qtdAlc = 0;
        qtdGas = 0;
        qtdDie = 0;

        do{
            combustivel = teclado.nextInt();
            switch(combustivel){
                case 1:
                    qtdAlc++;
                    break;
                case 2:
                    qtdGas++;
                    break;
                case 3:
                    qtdDie++;
                    break;
            }

        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "   + qtdAlc);
        System.out.println("Gasolina: " + qtdGas);
        System.out.println("Diesel: "   + qtdDie);
    }
}