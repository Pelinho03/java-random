package com.mycompany.quantidadecavalos2;

import javax.swing.JOptionPane;

public class QuantidadeCavalos2 {

    public static double calcCavalos(double m, double h, double t) {
        return ((m * h / t) / 745.6999);
    }

    public static void main(String[] args) {
        double m = 0, h = 0, t = 0, cavalos = 0;

        try {
            String mInput = JOptionPane.showInputDialog("Atribui um valor para quilogramas:");
            m = Double.parseDouble(mInput);

            String hInput = JOptionPane.showInputDialog("Atribui um valor para altura:");
            h = Double.parseDouble(hInput);

            String tInput = JOptionPane.showInputDialog("Atribui um valor para segundos:");
            t = Double.parseDouble(tInput);

            cavalos = calcCavalos(m, h, t);

            JOptionPane.showMessageDialog(null, String.format("A quantidade de cavalos necessarios e %.2f", cavalos));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Insira apenas valores numéricos válidos.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
