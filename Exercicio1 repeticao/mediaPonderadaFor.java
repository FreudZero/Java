import java.util.Scanner;

public class mediaPonderadaFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=0;
        double x=0, y=0, z=0, media=0;
        System.out.println("Escreva o número de elementos a digitar");
        N = sc.nextInt();
        System.out.println("==============================");


        for(int i = 0; i<N; i++){
            System.out.printf("\nEscreva um número %d/%d: ", i+1, N);
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = (x*2 + y*3 + z*5)/(10);
            System.out.printf("%.1f",media);
        }
        sc.close();
    }
}