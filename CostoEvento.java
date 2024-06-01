package poo;

public class CostoEvento {
    public static void main(String[] args) {
        double costoSalonTipoA = 950000;
        double costoHoraAdicionalTipoA = 250000;

        double costoSalonTipoB = 450000;
        double costoHoraAdicionalTipoB = 150000;

        double costoRecreacionNinos = 250000;
        double costoRecreacionAdultos = 180000;

        double costoRefrigeriosNinos = 12500;
        double costoRefrigeriosAdultos = 15000;

        int numNinos = 10;
        int numAdultos = 5;


        double costoSalon = 0;
        double costoRecreacion = 0;
        double costoRefrigerios = 0;
        double costoMeseros = 0;

        String tipoSalon = "A"; // Cambiar a "B" si es Tipo B

        switch (tipoSalon) {
            case "A":
                costoSalon = costoSalonTipoA;
                break;
            case "B":
                costoSalon = costoSalonTipoB;
                break;
            default:
                System.out.println("Tipo de salón no válido.");
        }

        // Cálculo de horas adicionales y su costo
        int horasExtras = 0; // Ingresar aquí las horas extras necesarias
        double costoHorasExtras = 0;

        if (horasExtras > 0) {
            switch (tipoSalon) {
                case "A":
                    costoHorasExtras = costoHoraAdicionalTipoA * horasExtras;
                    break;
                case "B":
                    costoHorasExtras = costoHoraAdicionalTipoB * horasExtras;
                    break;
                default:
                    System.out.println("Tipo de salón no válido.");
            }
        }

        // Cálculo de la recreación
        costoRecreacion = numNinos * costoRecreacionNinos + numAdultos * costoRecreacionAdultos;

        // Cálculo de los refrigerios
        costoRefrigerios = numNinos * costoRefrigeriosNinos + numAdultos * costoRefrigeriosAdultos;

        // Cálculo de los meseros
        int totalPersonas = numNinos + numAdultos;
        int numMeseros = totalPersonas / 20 * 5;
        double costoMeseroPorHora = 25000;
        double horasEvento = 4; // Cambiar si el evento dura más de 4 horas
        costoMeseros = numMeseros * horasEvento * costoMeseroPorHora;

        // Cálculo del costo total del evento
        double costoTotal = costoSalon + costoHorasExtras + costoRecreacion + costoRefrigerios + costoMeseros;

        System.out.println("Costo total del evento: $" + costoTotal);
    }
}

