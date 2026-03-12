import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número");
        x = sc.nextInt();
        String resultado = (x%2==0) ? "par" : "impar";
        System.out.println(x+" é "+resultado);

        sc.close();
    }
}
