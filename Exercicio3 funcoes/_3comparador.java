import java.util.Scanner;

public class _3comparador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva 3 num para encontrar o maior deles:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int resultado = max(a,b,c);
        showResult(resultado);

        sc.close();
    }

    public static int max(int a, int b, int c){
        int aux = 0;
        if(a > b && a > c){
            aux = a;
        } else if(b > c){ // Se chegou aqui, b já é maior que a, então só falta checar c
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int valor){
        System.out.println("Higher: "+ valor);
    }
}
