import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y, soma;
        
        System.out.println("Digite 2 números para soma:");
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x+y;
        System.out.println("A soma é: "+ soma);

        sc.close();
    }
}
