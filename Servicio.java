
package poo;

public class Servicio {
    private final double costo;
    private final int duracionHoras;

    public Servicio(double costo, int duracionHoras) {
        this.costo = costo;
        this.duracionHoras = duracionHoras;
    }

    public double calcularCosto() {
        return costo * duracionHoras;
    }
}
