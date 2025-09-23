public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Carlos", 5000, 2000);
        Funcionario f2 = new Programador("Ana", 3000, 10);
        Funcionario f3 = new Estagiario("João", 2000);

        f1.exibirInformacoes();
        System.out.println("---------------------");
        f2.exibirInformacoes();
        System.out.println("---------------------");
        f3.exibirInformacoes();
    }
}