class Trem extends Transporte {
    public Trem(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return tarifaBase + (distancia * 0.8);
    }
}