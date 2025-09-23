class PedidoDelivery extends Pedido {
    public PedidoDelivery(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return valor + (valor * 0.05); // 5% taxa de entrega
    }
}