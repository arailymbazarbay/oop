import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadAnimals {

    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM animals");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getString("type")
                );
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

