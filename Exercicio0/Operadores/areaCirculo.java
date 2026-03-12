import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, aCirculo, PI;
        double pi =  3.14159;
        
        System.out.println("Digite o raio do círculo para calcular a área:");
        r = sc.nextInt();
        aCirculo = pi*(r*r);
        System.out.printf("A = %.4f", aCirculo);

        sc.close();
    }
}
