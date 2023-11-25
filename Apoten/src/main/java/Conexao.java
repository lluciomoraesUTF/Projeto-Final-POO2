import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Conexao instance;
    private static Connection con = null;

    private Conexao() {
        // Pode inicializar outras configurações aqui, se necessário
    }

    public static Conexao getInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Apoten");

        return con;
    }
}



