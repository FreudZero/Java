import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entrada;
        
        System.out.println("Digite um número:");
        entrada = sc.nextDouble();

        // Verificamos primeiro se está fora dos limites globais
        if (entrada < 0 || entrada > 100) {
            System.out.println("Fora de intervalo");
        }
        // Agora usamos && para os intervalos específicos
        else if (entrada >= 0 && entrada <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (entrada > 25 && entrada <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (entrada > 50 && entrada <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}