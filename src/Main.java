import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Wczytaj dane z pliku app.properties
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("app.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Pobierz dane z pliku
        String jdbcUrl = properties.getProperty("jdbcUrl");
        String dbUsername = properties.getProperty("dbUsername");
        String dbPassword = properties.getProperty("dbPassword");

        SwingUtilities.invokeLater(() -> new LoginWindow(jdbcUrl, dbUsername, dbPassword));

    }
}