import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class LoginEstudiante {
    private static Connection conn;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
       
        connectToDatabase();

        System.out.print("Ingrese su DNI: ");
        String dni = sc.nextLine();
        
        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();
        
        if (validateLogin(dni, password)) {
            System.out.println("¡Inicio de sesión exitoso!");
        } else {
            System.out.println("DNI o contraseña incorrectos.");
        }
        
        sc.close();
    }

    private static void connectToDatabase() {
        try {
            
            String url = "jdbc:mysql://localhost:3306/tu_base_de_datos"; // Cambia el nombre de la base de datos
            String user = "root"; // Tu usuario
            String password = "password"; // Tu contraseña
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean validateLogin(String dni, String password) {
        try {
            String query = "SELECT usuario_password FROM usuario u " +
                           "JOIN estudiante e ON u.estudiante_id = e.estudiante_id " +
                           "WHERE e.dni = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, dni);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("usuario_password");
                // Verificar si las contraseñas coinciden (asegurándose de que se hashee la contraseña proporcionada)
                return storedPassword.equals(hashPassword(password));
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b)); // Convertir cada byte en formato hexadecimal
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}