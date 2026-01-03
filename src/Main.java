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
    }
}

