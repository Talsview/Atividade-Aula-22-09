public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Davi", 5000, 2000);
        Funcionario f2 = new Programador("Ana", 3000, 10);
        Funcionario f3 = new Estagiario("Caio", 2000);

        f1.exibirInformacoes();
        System.out.println();
        f2.exibirInformacoes();
        System.out.println();
        f3.exibirInformacoes();
    }

}
