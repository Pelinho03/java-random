package com.mycompany.somadosvalores;

import java.util.HashMap;
import java.util.Map;

public class SomaDosValores {
    public static void main(String[] args) {
        // Especificações aleatórias para 4 parques tecnológicos
        Map<String, Double> parque1 = new HashMap<>();
        parque1.put("OpenSpace(com ligações RJ45)", 0.8);
        parque1.put("Sala de reuniões", 0.7);
        parque1.put("WC/Balneários", 0.6);
        parque1.put("Ar condicionado", 0.9);
        parque1.put("Espaço de escritórios e instalações", 0.8);
        parque1.put("Áreas sociais (cozinha)", 0.7);
        parque1.put("Estacionamento", 0.8);
        parque1.put("Rede de transportes e acessibilidade", 0.7);
        parque1.put("Localização", 0.9);
        parque1.put("Suporte Tecnológico", 0.8);
        parque1.put("Suporte de Cyber segurança", 0.7);
        parque1.put("Conformidade", 0.8);
        parque1.put("Poluição", 0.2);
        parque1.put("Sustentabilidade Ambiental", 0.7);

        Map<String, Double> parque2 = new HashMap<>();
        parque2.put("OpenSpace(com ligações RJ45)", 0.7);
        parque2.put("Sala de reuniões", 0.6);
        parque2.put("WC/Balneários", 0.8);
        parque2.put("Ar condicionado", 0.7);
        parque2.put("Espaço de escritórios e instalações", 0.9);
        parque2.put("Áreas sociais (cozinha)", 0.7);
        parque2.put("Estacionamento", 0.7);
        parque2.put("Rede de transportes e acessibilidade", 0.8);
        parque2.put("Localização", 0.8);
        parque2.put("Suporte Tecnológico", 0.7);
        parque2.put("Suporte de Cyber segurança", 0.8);
        parque2.put("Conformidade", 0.9);
        parque2.put("Poluição", 0.3);
        parque2.put("Sustentabilidade Ambiental", 0.6);

        Map<String, Double> parque3 = new HashMap<>();
        parque3.put("OpenSpace(com ligações RJ45)", 0.9);
        parque3.put("Sala de reuniões", 0.8);
        parque3.put("WC/Balneários", 0.7);
        parque3.put("Ar condicionado", 0.8);
        parque3.put("Espaço de escritórios e instalações", 0.8);
        parque3.put("Áreas sociais (cozinha)", 0.9);
        parque3.put("Estacionamento", 0.9);
        parque3.put("Rede de transportes e acessibilidade", 0.8);
        parque3.put("Localização", 0.7);
        parque3.put("Suporte Tecnológico", 0.9);
        parque3.put("Suporte de Cyber segurança", 0.9);
        parque3.put("Conformidade", 0.7);
        parque3.put("Poluição", 0.1);
        parque3.put("Sustentabilidade Ambiental", 0.8);

        Map<String, Double> parque4 = new HashMap<>();
        parque4.put("OpenSpace(com ligações RJ45)", 0.7);
        parque4.put("Sala de reuniões", 0.8);
        parque4.put("WC/Balneários", 0.9);
        parque4.put("Ar condicionado", 0.6);
        parque4.put("Espaço de escritórios e instalações", 0.7);
        parque4.put("Áreas sociais (cozinha)", 0.7);
        parque4.put("Estacionamento", 0.6);
        parque4.put("Rede de transportes e acessibilidade", 0.8);
        parque4.put("Localização", 0.7);
        parque4.put("Suporte Tecnológico", 0.6);
        parque4.put("Suporte de Cyber segurança", 0.7);
        parque4.put("Conformidade", 0.7);
        parque4.put("Poluição", 0.4);
        parque4.put("Sustentabilidade Ambiental", 0.6);

        // Calcula a soma dos valores dos requisitos para cada parque
        double somaParque1 = calcularSomaDosValores(parque1);
        double somaParque2 = calcularSomaDosValores(parque2);
        double somaParque3 = calcularSomaDosValores(parque3);
        double somaParque4 = calcularSomaDosValores(parque4);

        System.out.println("A soma dos valores dos requisitos do Parque 1 é: " + somaParque1);
        System.out.println("A soma dos valores dos requisitos do Parque 2 é: " + somaParque2);
        System.out.println("A soma dos valores dos requisitos do Parque 3 é: " + somaParque3);
        System.out.println("A soma dos valores dos requisitos do Parque 4 é: " + somaParque4);
    }

    public static double calcularSomaDosValores(Map<String, Double> requisitos) {
        double soma = 0.0;
        for (Double valor : requisitos.values()) {
            soma += valor;
        }
        return soma;
    }
}

