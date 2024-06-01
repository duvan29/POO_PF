// DUVAN CAMILO SERRANO ROJAS
// NICOLAS CACIMANCHE

package poo;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MainUI {
    private final JFrame frame;
    private final JTextField txtNumNinos;
    private final JTextField txtNumNinas;
    private final JTextField txtNumBuffet;
    private final JTextField txtNumPlatoEspecial;
    private final JComboBox<String> cmbTipoSalon;
    private final JTextField txtHorasExtras;
    private final JTextField txtValorHorasExtras;
    private final JTextArea txtAreaResultado;
    private final JTextField txtValorHoraAdicional;
    private final JTextField txtHorasTotales;
    private final JComboBox<String> cmbRecordatorios;
    private final JTextField txtHorasMusica;
    private final JComboBox<String> cmbMusica;
    private final JTextField txtHorasRecreacionNinos;
    private final JComboBox<String> cmbRecreacionNinos;
    private final JTextField txtHorasRecreacionAdultos;
    private final JComboBox<String> cmbRecreacionAdultos;
    private final JComboBox<String> cmbMeseros;
    private final JComboBox<String> cmbDecoracion;

    public MainUI() {
        frame = new JFrame("El Murciélago Feliz - Cotización de Eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(25, 2));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel lblNumNinos = new JLabel("Número de niños:");
        txtNumNinos = new JTextField();
        panel.add(lblNumNinos);
        panel.add(txtNumNinos);

        JLabel lblNumNinas = new JLabel("Número de niñas:");
        txtNumNinas = new JTextField();
        panel.add(lblNumNinas);
        panel.add(txtNumNinas);

        JLabel lblNumBuffet = new JLabel("Número de personas que desean buffet:");
        txtNumBuffet = new JTextField();
        panel.add(lblNumBuffet);
        panel.add(txtNumBuffet);

        JLabel lblNumPlatoEspecial = new JLabel("Número de personas que desean plato especial:");
        txtNumPlatoEspecial = new JTextField();
        txtNumPlatoEspecial.setEditable(false);
        panel.add(lblNumPlatoEspecial);
        panel.add(txtNumPlatoEspecial);

        JLabel lblTipoSalon = new JLabel("Tipo de salón:");
        cmbTipoSalon = new JComboBox<>();
        cmbTipoSalon.addItem("Seleccione un salón");
        cmbTipoSalon.addItem("Tipo A");
        cmbTipoSalon.addItem("Tipo B");
        panel.add(lblTipoSalon);
        panel.add(cmbTipoSalon);

        JLabel lblValorSalon = new JLabel("Valor del salón:");
        JTextField txtValorSalon = new JTextField();
        txtValorSalon.setEditable(false);
        panel.add(lblValorSalon);
        panel.add(txtValorSalon);

        JLabel lblDecoracion = new JLabel("Agregar decoración:");
        String[] opcionesDecoracion = { "No", "Sí" };
        cmbDecoracion = new JComboBox<>(opcionesDecoracion); // Aquí inicializamos el campo cmbDecoracion
        panel.add(lblDecoracion);
        panel.add(cmbDecoracion);

        JLabel lblValorDecoracion = new JLabel("Valor de la decoración:");
        JTextField txtValorDecoracion = new JTextField();
        txtValorDecoracion.setEditable(false);
        panel.add(lblValorDecoracion);
        panel.add(txtValorDecoracion);

        JLabel lblMaxHorasAdicionales = new JLabel("Máximo de horas adicionales:");
        JTextField txtMaxHorasAdicionales = new JTextField();
        txtMaxHorasAdicionales.setEditable(false);
        panel.add(lblMaxHorasAdicionales);
        panel.add(txtMaxHorasAdicionales);

        JLabel lblValorHoraAdicional = new JLabel("Valor por hora adicional:");
        txtValorHoraAdicional = new JTextField();
        txtValorHoraAdicional.setEditable(false);
        panel.add(lblValorHoraAdicional);
        panel.add(txtValorHoraAdicional);

        JLabel lblHorasExtras = new JLabel("Horas extras:");
        txtHorasExtras = new JTextField();
        panel.add(lblHorasExtras);
        panel.add(txtHorasExtras);

        JLabel lblValorHorasExtras = new JLabel("Valor horas extras:");
        txtValorHorasExtras = new JTextField();
        txtValorHorasExtras.setEditable(false);
        panel.add(lblValorHorasExtras);
        panel.add(txtValorHorasExtras);

        JLabel lblHorasTotales = new JLabel("Horas totales:");
        txtHorasTotales = new JTextField();
        txtHorasTotales.setEditable(false);
        panel.add(lblHorasTotales);
        panel.add(txtHorasTotales);

        JLabel lblRecordatorios = new JLabel("Agregar recordatorios:");
        String[] opcionesRecordatorios = { "No", "Sí" };
        cmbRecordatorios = new JComboBox<>(opcionesRecordatorios);
        panel.add(lblRecordatorios);
        panel.add(cmbRecordatorios);

        cmbRecordatorios.addActionListener(e -> {
            String seleccion = (String) cmbRecordatorios.getSelectedItem();
            try {
                int Ninos = Integer.parseInt(txtNumNinos.getText());
                int Ninas = Integer.parseInt(txtNumNinas.getText());
                int costoRecordatorioNino = 2500 * Ninos;
                int costoRecordatorioNina = 3250 * Ninas;
                int costoRecordatorioAcompanante = 950 * (((Ninos + Ninas)));

                if ("Sí".equals(seleccion)) {
                    int totalRecordatorios = costoRecordatorioNino + costoRecordatorioNina
                            + costoRecordatorioAcompanante;

                    JOptionPane.showMessageDialog(frame,
                            """
                                    Valores cuando los recordatorios son seleccionados:
                                    Niño: $""" + String.format("%,d", costoRecordatorioNino) + "\n" +
                                    "Niña: $" + String.format("%,d", costoRecordatorioNina) + "\n" +
                                    "Acompañante: $" + String.format("%,d", costoRecordatorioAcompanante) + "\n" +
                                    "Total: $" + String.format("%,d", totalRecordatorios) + "\n",
                            "Valores de Recordatorios",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "No se agregarán recordatorios.",
                            "Valores de Recordatorios",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Por favor, ingrese valores numéricos válidos para los niños y niñas.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        JLabel lblRefrigerios = new JLabel("Agregar refrigerios y entre comidas:");
        String[] opcionesRefrigerios = { "No", "Sí" };
        JComboBox<String> cmbRefrigerios = new JComboBox<>(opcionesRefrigerios);
        panel.add(lblRefrigerios);
        panel.add(cmbRefrigerios);

        JLabel lblValorMusica = new JLabel("Valor de la música:");
        JTextField txtValorMusica = new JTextField();
        txtValorMusica.setEditable(false);
        panel.add(lblValorMusica);
        panel.add(txtValorMusica);

        cmbMusica = new JComboBox<>(new String[] { "No", "Sí" });
        JLabel lblMusica = new JLabel("¿Desea música?");
        panel.add(lblMusica);
        panel.add(cmbMusica);

        JLabel lblHorasMusica = new JLabel("Horas de música adicionales:");
        txtHorasMusica = new JTextField();
        panel.add(lblHorasMusica);
        panel.add(txtHorasMusica);

        cmbMusica.addActionListener(e -> {
            String seleccionMusica = (String) cmbMusica.getSelectedItem();
            if ("Sí".equals(seleccionMusica)) {
                txtHorasMusica.setEnabled(true);
            } else {
                txtHorasMusica.setEnabled(false);
                txtHorasMusica.setText("0");
            }
            // double costoTotal = calcularCostoTotal();
            // txtAreaResultado.setText("Costo total del evento: $" + costoTotal);
        });

        JLabel lblRecreacionNinos = new JLabel("¿Desea recreación para niños?");
        String[] opcionesRecreacion = { "No", "Sí" };
        cmbRecreacionNinos = new JComboBox<>(opcionesRecreacion);
        panel.add(lblRecreacionNinos);
        panel.add(cmbRecreacionNinos);

        JLabel lblHorasRecreacionNinos = new JLabel("Horas de recreación para niños:");
        txtHorasRecreacionNinos = new JTextField();
        txtHorasRecreacionNinos.setEnabled(false);
        panel.add(lblHorasRecreacionNinos);
        panel.add(txtHorasRecreacionNinos);

        cmbRecreacionNinos.addActionListener(e -> {
            if ("Sí".equals(cmbRecreacionNinos.getSelectedItem())) {
                txtHorasRecreacionNinos.setEnabled(true);
            } else {
                txtHorasRecreacionNinos.setEnabled(false);
                txtHorasRecreacionNinos.setText("0");
            }
        });

        JLabel lblRecreacionAdultos = new JLabel("¿Desea recreación para adultos?");
        cmbRecreacionAdultos = new JComboBox<>(opcionesRecreacion);
        panel.add(lblRecreacionAdultos);
        panel.add(cmbRecreacionAdultos);

        JLabel lblHorasRecreacionAdultos = new JLabel("Horas de recreación para adultos:");
        txtHorasRecreacionAdultos = new JTextField();
        txtHorasRecreacionAdultos.setEnabled(false);
        panel.add(lblHorasRecreacionAdultos);
        panel.add(txtHorasRecreacionAdultos);

        cmbRecreacionAdultos.addActionListener(e -> {
            if ("Sí".equals(cmbRecreacionAdultos.getSelectedItem())) {
                txtHorasRecreacionAdultos.setEnabled(true);
            } else {
                txtHorasRecreacionAdultos.setEnabled(false);
                txtHorasRecreacionAdultos.setText("0");
            }
        });

        JLabel lblMeseros = new JLabel("¿Desea meseros? (Horas totales)");
        String[] opcionesMeseros = { "No", "Sí" };
        cmbMeseros = new JComboBox<>(opcionesMeseros);
        panel.add(lblMeseros);
        panel.add(cmbMeseros);

        cmbTipoSalon.addActionListener(e -> actualizarValoresSalon(txtValorSalon, txtValorDecoracion, txtValorMusica,
                txtMaxHorasAdicionales, txtValorHoraAdicional));

        JButton btnCalcular = new JButton("Calcular Costo");
        panel.add(btnCalcular);

        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        panel.add(new JScrollPane(txtAreaResultado));

        btnCalcular.addActionListener(e -> calcularCostoEvento());

        txtNumBuffet.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarPlatoEspecial();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarPlatoEspecial();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarPlatoEspecial();
            }
        });

        txtHorasExtras.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarValorHorasExtras();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarValorHorasExtras();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarValorHorasExtras();
            }
        });

        frame.add(panel);
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void actualizarValoresSalon(JTextField txtValorSalon, JTextField txtValorDecoracion,
            JTextField txtValorMusica, JTextField txtMaxHorasAdicionales, JTextField txtValorHoraAdicional) {
        String tipoSalon = (String) cmbTipoSalon.getSelectedItem();

        switch (tipoSalon) {
            case "Tipo A" -> {
                txtValorSalon.setText("$1,500,000 por cinco horas");
                txtValorDecoracion.setText("$450,000");
                txtValorMusica.setText("$950,000 por cuatro horas, $250,000 por hora adicional");
                txtMaxHorasAdicionales.setText("3 horas");
                txtValorHoraAdicional.setText("$250,000");
            }
            case "Tipo B" -> {
                txtValorSalon.setText("$1,000,000 por tres horas");
                txtValorDecoracion.setText("$350,000");
                txtValorMusica.setText("$450,000 por dos horas, $150,000 por hora adicional");
                txtMaxHorasAdicionales.setText("4 horas");
                txtValorHoraAdicional.setText("$150,000");
            }
            default -> {
                txtValorSalon.setText("");
                txtValorDecoracion.setText("");
                txtValorMusica.setText("");
                txtMaxHorasAdicionales.setText("");
                txtValorHoraAdicional.setText("");
            }
        }

        actualizarValorHorasExtras();
    }

    private void actualizarPlatoEspecial() {
        try {
            int numBuffet = Integer.parseInt(txtNumBuffet.getText());
            int numTotal = (Integer.parseInt(txtNumNinos.getText()) + Integer.parseInt(txtNumNinas.getText())) * 2;
            int numPlatoEspecial = numTotal - numBuffet;
            txtNumPlatoEspecial.setText(Integer.toString(numPlatoEspecial));
        } catch (NumberFormatException ignored) {
        }
    }

    private void actualizarValorHorasExtras() {
        try {
            int horasExtras = Integer.parseInt(txtHorasExtras.getText());
            int valorHoraAdicional = Integer
                    .parseInt(txtValorHoraAdicional.getText().replace("$", "").replace(",", ""));
            int valorTotalHorasExtras = horasExtras * valorHoraAdicional;

            // Validación para horas adicionales
            String tipoSalon = (String) cmbTipoSalon.getSelectedItem();
            int horasIncluidas = 0;
            if ("Tipo A".equals(tipoSalon)) {
                horasIncluidas = 3;
            } else if ("Tipo B".equals(tipoSalon)) {
                horasIncluidas = 4;
            }

            if (horasExtras > horasIncluidas) {
                JOptionPane.showMessageDialog(frame,
                        "El número de horas extras no puede exceder el máximo permitido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                txtHorasExtras.setText(""); // Limpiar el campo de horas extras
                return;
            }

            txtValorHorasExtras.setText("$" + String.format("%,d", valorTotalHorasExtras));
        } catch (NumberFormatException ignored) {
            txtValorHorasExtras.setText("");
        }
        actualizarHorasTotales();
    }

    private void actualizarHorasTotales() {
        try {
            String tipoSalon = (String) cmbTipoSalon.getSelectedItem();
            int horasIncluidas = 0;
            if ("Tipo A".equals(tipoSalon)) {
                horasIncluidas = 5;
            } else if ("Tipo B".equals(tipoSalon)) {
                horasIncluidas = 3;
            }

            int horasExtras = 0;
            try {
                horasExtras = Integer.parseInt(txtHorasExtras.getText());
            } catch (NumberFormatException ignored) {
            }

            int horasTotales = horasIncluidas + horasExtras;
            txtHorasTotales.setText(String.valueOf(horasTotales));
        } catch (NumberFormatException ignored) {
            txtHorasTotales.setText("");
        }
    }

    private void mostrarFacturaModal() {
        StringBuilder factura = new StringBuilder();
        factura.append("================= Factura =================\n");

        // Detalles del evento
        factura.append("Detalles del evento:\n");
        factura.append("Número de niños: ").append(txtNumNinos.getText()).append("\n");
        factura.append("Número de niñas: ").append(txtNumNinas.getText()).append("\n");
        factura.append("Número de personas que desean buffet: ").append(txtNumBuffet.getText()).append("\n");
        factura.append("Número de personas que desean plato especial: ").append(txtNumPlatoEspecial.getText())
                .append("\n");
        factura.append("Tipo de salón: ").append(cmbTipoSalon.getSelectedItem()).append("\n");
        factura.append("Horas extras: ").append(txtHorasExtras.getText()).append("\n");
        factura.append("Horas totales: ").append(txtHorasTotales.getText()).append("\n");
        factura.append("\n");

        // Detalles de los costos
        factura.append("Costos:\n");
        factura.append("Costo del salón: $").append(String.format("%,d", (int) calcularCostoSalon())).append("\n");
        factura.append("Costo de la decoración: $").append(String.format("%,d", (int) calcularCostoDecoracion()))
                .append("\n");
        factura.append("Costo de la música: $").append(String.format("%,d", (int) calcularCostoMusica())).append("\n");
        factura.append("Costo de la recreación: $").append(String.format("%,d", (int) calcularCostoRecreacion()))
                .append("\n");
        factura.append("Costo de los refrigerios: $").append(String.format("%,d", (int) calcularCostoRefrigerios()))
                .append("\n");
        factura.append("Costo de los meseros: $").append(String.format("%,d", (int) calcularCostoMeseros()))
                .append("\n");
        factura.append("\n");

        // Costo total del evento
        factura.append("Costo total del evento: $").append(String.format("%,d", (int) calcularCostoTotal()))
                .append("\n");

        JTextArea textArea = new JTextArea(factura.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 350));

        JOptionPane.showMessageDialog(frame, scrollPane, "Factura del Evento", JOptionPane.PLAIN_MESSAGE);
    }

    private void calcularCostoEvento() {
        try {
            int totalNinos = Integer.parseInt(txtNumNinos.getText()) + Integer.parseInt(txtNumNinas.getText());

            // Validar si la empresa tiene la capacidad para hacer el evento
            if (totalNinos > 120) {
                JOptionPane.showMessageDialog(frame,
                        "La empresa no tiene capacidad para realizar el evento con más de 120 niños.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calcular el costo total del evento si la empresa tiene capacidad
            // double costoTotal = calcularCostoTotal();
            mostrarFacturaModal(); // Mostrar factura en un modal después de calcular el costo total
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, ingrese todos los valores numéricos correctamente.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double calcularCostoTotal() {
        double costoSalon = calcularCostoSalon();
        double costoDecoracion = calcularCostoDecoracion();
        double costoMusica = calcularCostoMusica();
        double costoRecreacion = calcularCostoRecreacion();
        double costoRefrigerios = calcularCostoRefrigerios();
        double costoMeseros = calcularCostoMeseros();

        return costoSalon + costoDecoracion + costoMusica + costoRecreacion + costoRefrigerios + costoMeseros;
    }

    private double calcularCostoSalon() {
        String tipoSalon = (String) cmbTipoSalon.getSelectedItem();
        return switch (tipoSalon) {
            case "Tipo A" -> 1500000;
            case "Tipo B" -> 1000000;
            default -> 0;
        };
    }

    private double calcularCostoDecoracion() {
        String seleccionDecoracion = (String) cmbDecoracion.getSelectedItem();
        if ("Sí".equals(seleccionDecoracion)) {
            // Agrega aquí el costo de la decoración si se selecciona "Sí"
            return 500000; // Ejemplo de costo de decoración
        } else {
            return 0; // No hay costo de decoración si se selecciona "No"
        }
    }

    private double calcularCostoMusica() {
        String tipoSalon = (String) cmbTipoSalon.getSelectedItem();
        boolean quiereMusica = "Sí".equals(cmbMusica.getSelectedItem());
        int horasMusica = 0;
        try {
            horasMusica = Integer.parseInt(txtHorasMusica.getText());
        } catch (NumberFormatException ignored) {
        }

        switch (tipoSalon) {
            case "Tipo A" -> {
                if (quiereMusica) {
                    return 950000 + 250000 * horasMusica;
                } else {
                    return 0;
                }
            }
            case "Tipo B" -> {
                if (quiereMusica) {
                    return 450000 + 150000 * horasMusica;
                } else {
                    return 0;
                }
            }
            default -> {
                return 0;
            }
        }
    }

    private double calcularCostoRecreacion() {
        int horasRecreacionNinos = Integer.parseInt(txtHorasRecreacionNinos.getText());
        int horasRecreacionAdultos = Integer.parseInt(txtHorasRecreacionAdultos.getText());

        double costoRecreacionNinos = 0;
        double costoRecreacionAdultos = 0;

        if ("Sí".equals(cmbRecreacionNinos.getSelectedItem())) {
            costoRecreacionNinos = horasRecreacionNinos * 20000; // Example cost per hour for kids
        }

        if ("Sí".equals(cmbRecreacionAdultos.getSelectedItem())) {
            costoRecreacionAdultos = horasRecreacionAdultos * 30000; // Example cost per hour for adults
        }

        return costoRecreacionNinos + costoRecreacionAdultos;
    }

    private double calcularCostoMeseros() {
        if ("Sí".equals(cmbMeseros.getSelectedItem())) {
            int numPersonas = Integer.parseInt(txtNumNinos.getText()) + Integer.parseInt(txtNumNinas.getText());
            int numMeseros = (int) Math.ceil(numPersonas / 20.0) * 5;
            int horasTotales = Integer.parseInt(txtHorasTotales.getText());
            return numMeseros * 25000 * horasTotales;
        }
        return 0;
    }

    private double calcularCostoRefrigerios() {
        int numBuffet = Integer.parseInt(txtNumBuffet.getText());
        int numPlatoEspecial = Integer.parseInt(txtNumPlatoEspecial.getText());
        return numBuffet * 25000 + numPlatoEspecial * 30000;
    }

    public static void main(String[] args) {
        MainUI mainUI = new MainUI();
    }
}
