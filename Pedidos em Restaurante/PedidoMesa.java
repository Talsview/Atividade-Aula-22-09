class PedidoMesa extends Pedido {
    public PedidoMesa(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return valor + (valor * 0.10); // 10% taxa de serviço
    }
}