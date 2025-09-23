class Roupas extends Produto {
    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * 0.15);
    }

}
