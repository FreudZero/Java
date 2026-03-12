import java.util.Scanner;

public class quadrantesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x=1.0, y=1.0;

        while(x != 0.00 || y != 0.00){
            System.out.println("\nDigite (x)");
            x = sc.nextDouble();
            System.out.println("Digite (y)");
            y = sc.nextDouble();
            if(x>0.00 && y>0.00){
                System.out.printf("(%.2f, %.2f) -> 1º Quadrante",x,y);
            }else if(x<0.00 && y>0.00){
                System.out.printf("(%.2f, %.2f) -> 2º Quadrante",x,y);
            }else if(x<0.00 && y<0.00){
                System.out.printf("(%.2f, %.2f) -> 3º Quadrante",x,y);
            }else if(x>0.00 && y<0.00){
                System.out.printf("(%.2f, %.2f) -> 4º Quadrante",x,y);    
            }else{
                System.out.println("Você usou a origem\nPrograma encerrado!");
                break;
            }
        }

    sc.close();
    }
}
