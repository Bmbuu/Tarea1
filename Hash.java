
package com.mycompany.hash;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Hash {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:5432/base_datos";
        String user = "Sui";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa a MySQL.");

            String sql = "SELECT * FROM Usuarios";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Usuario: " + rs.getString("Nombre"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
