import java.util.Scanner;

public class multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Digite um número");
        a = sc.nextInt();
        b = sc.nextInt();
        String resultado =  (a%b==0 || b%a==0) ? "são multiplos" : "não são multiplo";
        System.out.println(a +" e "+b+" "+ resultado);

        sc.close();
    }
}
