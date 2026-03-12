import java.util.Scanner;

public class calcHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entra,saida, diferenca;
        System.out.println("Digite 2 número(s)");
        entra = sc.nextInt();
        saida = sc.nextInt();
        if(entra < saida){
            diferenca = saida - entra;
            System.out.println("O JOGO DUROU "+diferenca+" HORA(S) ");

        }else if(entra>saida){
            diferenca = (24-entra)+saida;
            System.out.println("O JOGO DUROU "+diferenca+" HORA(S) ");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
