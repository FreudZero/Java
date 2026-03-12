public class Garcom {
    private Pedido pedido;

    public void receberPedido(Pedido pedido){
        this.pedido = pedido;
    }
    public void servir(){
        if(pedido != null){
            pedido.getPrato().servir();
        }else{System.out.println("pedido inválido");}
    }
}
