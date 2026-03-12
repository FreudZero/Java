import java.util.Scanner;
public class diaSemana
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String dia;
        int x;

        System.out.println("Digite um número para cada dia da semana: 1.Dom, 2.Seg, 3.Ter...");
        x = sc.nextInt();

        switch (x){
            case 1:
                dia = "dom";
                break;
            
            case 2:
                dia = "seg";
                break;
            
            case 3:
                dia = "ter";
                break;
            
            case 4:
                dia = "qua";
                break;
            
            case 5:
                dia = "qui";
                break;

            case 6:
                dia = "sex";
                break;

            case 7:
                dia = "sáb";
                break;

            default:
                dia =  "tente valores entre 1 a 7";
                break;
        }
        System.out.println("Dia da semana: " + dia);
    
        sc.close();
	}
}