package com.mycompany.exemplosql;

public class ExemploSql {

    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql-jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "user", "password");
        } catch (ClassNotFoundException ex){
            System.out.println("Driver da base de dados nao localizado.");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar a base de dados: " + ex.getMessage());
        }
    }
}
