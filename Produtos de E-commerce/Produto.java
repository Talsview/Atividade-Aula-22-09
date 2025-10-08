class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        return preco;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }

}
