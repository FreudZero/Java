import java.util.Scanner;

public class testeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0, senha=27;

        while(x != senha){
            System.out.println("Digite a senha");
            x = sc.nextInt();
            if(x == senha){
                System.out.println("Senha Correta!");
                break;
            }else{
                System.out.println("Senha Incorreta!");
            }
        }

    sc.close();
    }
}
