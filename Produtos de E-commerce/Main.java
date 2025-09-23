public class Main {
    public static void main(String[] args) {
        Produto p1 = new Eletronico("Notebook", 3000.0);
        Produto p2 = new Roupas("Camiseta", 100.0);
        Produto p3 = new Alimento("Arroz", 20.0);

        System.out.println("=== Produtos ===");
        p1.exibirProduto();
        System.out.println("----------------");
        p2.exibirProduto();
        System.out.println("----------------");
        p3.exibirProduto();
    }
}