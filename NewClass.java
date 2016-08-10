
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewClass {

    public String database = "ejemplo";
    public String URL_DB = "jdbc:mysql://localhost/" + database;
    public String USERNAME = "root";
    public String PASSWORD = "eddie1310";

    public NewClass() {
    }
    
    

    public Connection connectar() {
        Connection link=null;
        try{
         System.out.println("Conectando base de datos...");
         Class.forName("org.gjt.mm.mysql.Driver");
        link = DriverManager.getConnection(URL_DB, USERNAME, PASSWORD);
        System.out.println("Coneccion Exitosa");
   
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return link;
    }
}
