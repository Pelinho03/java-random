package com.mycompany.temperaturasexc;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TemperaturasExc {

    public static void main(String[] args) {
        double c = 0, k, re, ra, f;
        Scanner leia = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("Insira a temperatura em graus Celsius:");
        try {
            c = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            System.exit(1);
        }

        JOptionPane.showMessageDialog(null, "O valor escolhido em Celsius é de: " + c + "º");

        f = c * 1.8 + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;

        String resultMessage = "A temperatura em Kelvin é de: " + k + "º\n"
                + "A temperatura em Fahrenheit é de: " + f + "º\n"
                + "A temperatura em Reaumur é de:  " + re + "º\n"
                + "A temperatura em Rankine é de:  " + ra + "º\n"; 

        JOptionPane.showMessageDialog(null, resultMessage);

        if (c < 0) {
            JOptionPane.showMessageDialog(null, "Temperaturas negativas. \nPor favor, vestir bastante roupa.");
        } else if (c > 20 && c < 29) {
            JOptionPane.showMessageDialog(null, "Temperaturas quentes. \nUsar boné e protetor solar.");
        } else if (c > 29) {
            JOptionPane.showMessageDialog(null, "Cuidado. \nTemperaturas muito altas.");
        }
    }
}
