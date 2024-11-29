package com.mycompany.hash;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {
    public void registrarUsuario(String nombre, String email, String password) {
        String sql = "INSERT INTO usuarios (nombre, email, contraseña) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, email);
            stmt.setString(3, PasswordUtil.hashPassword(password)); // Hasheamos la contraseña
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   
    public boolean autenticarUsuario(String email, String password) {
        String sql = "SELECT contraseña FROM usuarios WHERE email = ?";
        String hashedPassword = null;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                hashedPassword = rs.getString("contraseña");
            }

            return hashedPassword != null && PasswordUtil.checkPassword(password, hashedPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}