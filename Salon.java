package poo;

public class Salon {
    private double costoBase;
    private double costoHoraAdicional;
    private int maxHorasAdicionales;
    private double costoDecoracion;

    public Salon(double costoBase, double costoHoraAdicional, int maxHorasAdicionales, double costoDecoracion) {
        this.costoBase = costoBase;
        this.costoHoraAdicional = costoHoraAdicional;
        this.maxHorasAdicionales = maxHorasAdicionales;
        this.costoDecoracion = costoDecoracion;
    }

    public double calcularCostoTotal(int horasExtra) {
        double costoTotal = costoBase + costoDecoracion;
        if (horasExtra > 0 && horasExtra <= maxHorasAdicionales) {
            costoTotal += horasExtra * costoHoraAdicional;
        }
        return costoTotal;
    }
}
