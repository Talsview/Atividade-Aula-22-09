class Pedido {
    protected double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public double calcularValorFinal() {
        return valor;
    }

    public void exibirPedido() {
        System.out.println("Valor final do pedido: R$ " + calcularValorFinal());
    }
}