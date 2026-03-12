public interface Notificador {
    void enviar(String mensagem);
}
class EmailNotificador implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado com sucesso!");
    }
}

class SMSNotificador implements Notificador{
    @Override
    public void enviar(String mensagem){
        System.out.println("SMS enviado com sucesso!");
    }
}