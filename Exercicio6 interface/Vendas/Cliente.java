public class Cliente{
    private String nome;
    private Notificador notificador; //a ideia seria usar notificador como classe e chama-lo em uma composição

    public Cliente(String nome, Notificador notificador){
        this.nome = nome;
        this.notificador = notificador;
    }

    public Notificador getNotificador(){
        return this.notificador;
    }
    public String getNome(){
        return this.nome;
    }
}
