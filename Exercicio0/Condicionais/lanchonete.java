import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, qnt;
        double preco;
        System.out.println("Digite o pedido que você quer (1,2,3,4,5)?");
        entrada = sc.nextInt();
        System.out.println("Digite quantos você quer? ");
        qnt = sc.nextInt();

        if(entrada == 1){
            preco = qnt*4.0;
            System.out.printf("Total: R$ %.2f",preco);
        }else if(entrada == 2){
            preco = qnt*4.50;
            System.out.printf("Total: R$ %.2f",preco);
        }else if(entrada == 3){
            preco = qnt*5.0;
            System.out.printf("Total: R$ %.2f",preco);
        }else if(entrada == 4){
            preco = qnt*2.0;
            System.out.printf("Total: R$ %.2f",preco);
        }else if(entrada == 3){
            preco = qnt*1.5;
            System.out.printf("Total: R$ %.2f",preco);
        }

        sc.close();
    }
}
