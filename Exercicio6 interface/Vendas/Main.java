//teste de fogo
public class Main{
public static void main(String[] args){
    Notificador notificador1 = new EmailNotificador();

    Cliente cliente1 = new Cliente("João", notificador1);
    ProcessadorVenda processador = new ProcessadorVenda();
    processador.finalizar(cliente1);
    }
}