public class formatacaoSplit {
    public static void main(String[] args){
        String s = "gosto de correr dormindo";
        
        String[] vetor = s.split(" ");
        String pal1 = vetor[0];
        String pal2 = vetor[1];
        String pal3 = vetor[2];
        String pal4 = vetor[3];

        System.out.println(pal1);
        System.out.println(pal2);
        System.out.println(pal3);
        System.out.println(pal4);

    }
}
