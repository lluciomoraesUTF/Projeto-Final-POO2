import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private static Conexao instance;
    private static Connection con = null;

    private Conexao() {
    }

    public static Conexao getInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (con == null) {
            String user = JOptionPane.showInputDialog(null, "Digite o usuário:", "LOGIN", 0);
            String pass = JOptionPane.showInputDialog(null, "Digite a senha:", "LOGIN", 0);

            if (user == null || pass == null) {
                throw new SQLException("Usuário ou senha não fornecidos.");
            }

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Apoten", user, pass);
        }

        return con;
    }
}
