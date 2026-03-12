import java.util.Scanner;

public class impostoRenda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda, imposto;
        
        System.out.println("Digite a sua renda:");
        renda = sc.nextDouble();
        
        if (renda > 0.0 && renda <=2000.00) {
            System.out.println("Isento");
        
        }else if (renda > 2000.01 && renda <= 3000.00) {
            imposto = (renda-2000.0)*(8/100);
            System.out.printf("Imposto a pagar: R$ %.2f", imposto);
        
        }else if (renda > 3000.01 && renda <= 4500.00) {
            imposto = (1000.00 * 0.08) + (renda - 3000.00) * 0.18;
            System.out.printf("Imposto a pagar: R$ %.2f", imposto);
        
        }else if (renda > 4500.01) {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (renda - 4500.00) * 0.28;
            System.out.printf("Imposto a pagar: R$ %.2f",imposto);
        }

        sc.close();
    }
}