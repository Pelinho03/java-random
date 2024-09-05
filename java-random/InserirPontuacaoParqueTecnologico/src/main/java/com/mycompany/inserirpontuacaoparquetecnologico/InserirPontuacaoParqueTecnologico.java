package com.mycompany.inserirpontuacaoparquetecnologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirPontuacaoParqueTecnologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configurações de conexão com o banco de dados PostgreSQL
        String url = "jdbc:postgresql://localhost:5432/parques_tecnologicos";
        String usuario = "postgres";
        String senha = "root";

        try {
            // Estabeleça a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Inserir um novo parque tecnológico:");

            System.out.print("Nome do parque: ");
            String nomeParque = scanner.nextLine();

            System.out.print("Pontuação para o critério A (0-10): ");
            int pontuacaoA = scanner.nextInt();

            System.out.print("Pontuação para o critério B (0-10): ");
            int pontuacaoB = scanner.nextInt();

            System.out.print("Pontuação para o critério C (0-10): ");
            int pontuacaoC = scanner.nextInt();

            // Query SQL para inserir os dados na tabela
            String sql = "INSERT INTO sua_tabela (nome, criterioA, criterioB, criterioC) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nomeParque);
            preparedStatement.setInt(2, pontuacaoA);
            preparedStatement.setInt(3, pontuacaoB);
            preparedStatement.setInt(4, pontuacaoC);

            // Execute a inserção
            int linhasAfetadas = preparedStatement.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Dados inseridos com sucesso!");
            } else {
                System.out.println("Falha ao inserir os dados.");
            }

            // Feche a conexão com o banco de dados
            preparedStatement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


