class Transporte {
    public double tarifaBase;

    public Transporte(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double calcularTarifa(double distancia) {
        return tarifaBase;
    }

    public void exibirTarifa(double distancia) {
        System.out.println("Tarifa final: R$ " + calcularTarifa(distancia));
    }

}
