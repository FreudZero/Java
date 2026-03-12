import java.util.Scanner;
public class condiOpcional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double minutos, pagar;
        pagar = 50.00;
        System.out.println("Quantos minutos vc usou na ligação?");
        minutos = sc.nextDouble();

        if(minutos <= 100.00){
            System.out.println("Valor a pagar: R$" + pagar);
        }else{
            pagar = 2.00*(minutos-100)+50.00;
            System.out.println("Valor a pagar: R$"+pagar);
        }

    sc.close();
    }
}
