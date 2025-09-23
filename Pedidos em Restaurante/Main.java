public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoMesa(100.0);
        Pedido p2 = new PedidoDelivery(100.0);

        System.out.println("Pedido Mesa");
        p1.exibirPedido();

        System.out.println("\nPedido Delivery");
        p2.exibirPedido();
    }
}