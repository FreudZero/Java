import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFuncionario;
        double horasTrabalhadas, salarioHora, salarioTotal;
        
        System.out.println("Digite o numero de funcionarios:");
        numFuncionario = sc.nextInt();
        System.out.println("Digite o valor de horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor do salário por hora:");
        salarioHora = sc.nextDouble();
        salarioTotal = salarioHora*horasTrabalhadas;
        System.out.println("Numero = " + numFuncionario);
        System.out.println("Salário = " + salarioTotal);

        sc.close();
    }
}