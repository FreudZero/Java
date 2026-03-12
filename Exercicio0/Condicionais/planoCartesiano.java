import java.util.Scanner;

public class planoCartesiano{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        
        System.out.println("Digite um número para X:");
        x = sc.nextDouble();
        System.out.println("Digite um número para Y:");
        y = sc.nextDouble();
        
        if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        // Agora usamos && para os intervalos específicos
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }else{
            System.out.println("(0,0)");
        }

        sc.close();
    }
}