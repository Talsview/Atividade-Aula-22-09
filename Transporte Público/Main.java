public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Onibus(4.0);
        Transporte t2 = new Trem(5.0);

        double distancia = 10.0;

        System.out.println("Ônibus");
        t1.exibirTarifa(distancia);

        System.out.println("\nTrem");
        t2.exibirTarifa(distancia);
    }
}