class Onibus extends Transporte {
    public Onibus(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifaBase + (distancia * 0.5);
    }
}