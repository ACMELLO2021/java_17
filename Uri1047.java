import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaI, minuI, horaF, minuF, tempoI, tempoF, tempoT, horaT, minuT;
        // entrada
        horaI = teclado.nextInt();
        minuI = teclado.nextInt();
        horaF = teclado.nextInt();
        minuF = teclado.nextInt();

        // processamento
        // 1 - converter tudo para minuto
        tempoI = horaI * 60 + minuI;
        tempoF = horaF * 60 + minuF;

        // 2 - extrair o tempoI do tempoF e verificar se é <= 0. Se for soma 24h (em minutos)
        tempoT = tempoF - tempoI;
        if (tempoT <= 0){
            tempoT = tempoT + 1440; // 24*60
        }

        // 3 - voltar para a notação hora/minuto
        horaT = tempoT / 60;
        minuT = tempoT % 60;

        // saida
        System.out.println("O JOGO DUROU "+horaT+ " HORA(S) E "+minuT+" MINUTO(S)");
    }
}