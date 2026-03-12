import java.util.Scanner;

public class imparesFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Escreva um número para saber os impares até ele:");
        x = sc.nextInt();
        System.out.println("==============================");


        for(int i = 0; i<x; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }

        sc.close();
    }
    
}
