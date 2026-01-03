import java.util.ArrayList;
import java.util.Comparator;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void showAllAnimals() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
    public void findByName(String name) {
        for (Animal a : animals) {
            if (a.getName().equalsIgnoreCase(name)) {
                System.out.println(a);
            }
        }
    }
    public void sortByAge() {
        animals.sort(Comparator.comparingInt(Animal::getAge));
    }
}
