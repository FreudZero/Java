public class ProcessadorVenda{

    public void finalizar(Cliente cliente){
        System.out.println("Finalizando venda para: " + cliente.getNome());
    cliente.getNotificador().enviar("compra foi aprovada!");
    }
}