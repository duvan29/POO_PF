package poo;

public class CostoRefrigerios {
    public static void main(String[] args) {
        double costoRefrigerioNinos = 12500;
        double costoRefrigerioAdultos = 15000;

        int numNinos = 15;
        int numAdultos = 10;

        double costoTotalRefrigerios = numNinos * costoRefrigerioNinos + numAdultos * costoRefrigerioAdultos;

        System.out.println("Costo total de refrigerios: $" + costoTotalRefrigerios);
    }
}
