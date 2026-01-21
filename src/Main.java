import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);



        zoo.addAnimal(new Lion("Simba", 5));
        zoo.addAnimal(new Elephant("Dumbo", 10));

        System.out.println("All animals:");
        zoo.showAllAnimals();

        System.out.print("Enter animal name to search: ");
        String name = scanner.nextLine();
        zoo.findByName(name);

        zoo.sortByAge();
        System.out.println("Animals sorted by age:");
        zoo.showAllAnimals();

        try {
            Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(
                    "INSERT INTO animals ( name, age, type) VALUES ('Elephant', 10, 'Elephant')"
            );

            Statement stmt2 = conn.createStatement();

            stmt2.executeUpdate(
                    "UPDATE animals SET age = 11 WHERE name = 'Elephant'"
            );

            Statement stmt3 = conn.createStatement();

            stmt3.executeUpdate(
                   "DELETE FROM animals WHERE name = 'Elephant'"
            );


            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

