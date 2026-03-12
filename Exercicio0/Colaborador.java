public class Colaborador{
    private String nome;
    private double salario;

    //set
    public Colaborador(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    //get
    public String getNome(){return nome;}
    public double getSalario(){ return salario;}

}