
public class formatacaoString {
    public static void main(String[] args){
        String original = "   abc DEF ghf IJK abc  ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(6);
        String s05 = original.substring(4,10);
        String s06 = original.replace("a","x");

        System.out.println("Original: " + original);
        System.out.println("Minusculo: " + s01);
        System.out.println("Maiusculo: "+s02);
        System.out.println("Corte de espaços finais e iniciais: " + s03);
        System.out.println("Comece a partir da posição(6): "+s04);
        System.out.println("Comece a partir da posição(4 a 10): "+s05);
        System.out.println("Troque ('a' por 'x'): "+s06);

    }
}
