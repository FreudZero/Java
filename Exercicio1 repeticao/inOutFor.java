import java.util.Scanner;

public class inOutFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=0, x, in=0, out=0;
        System.out.println("Escreva o número de elementos a digitar");
        N = sc.nextInt();
        System.out.println("==============================");


        for(int i = 0; i<N; i++){
            System.out.printf("Escreva um número %d/%d: ", i+1, N);
            x = sc.nextInt();
            if(x>=10 && x<=20){
                //System.out.println("in");
                in += 1;
            }else{
                //System.out.println("out");
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}