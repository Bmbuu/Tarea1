import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectToDatabase {

    
    public static Connection connectToDatabase() {
        // Información de la base de datos
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos"; // Cambia "tu_base_de_datos" al nombre de tu base de datos
        String user = "root";  // Tu usuario de la base de datos
        String password = "password";  // Tu contraseña de la base de datos

        try {
            
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
            return null;
        }
    }
}