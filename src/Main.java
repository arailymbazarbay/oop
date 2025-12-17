public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Lion", 5);
        Animal animal2 = new Animal("Tiger", 3);

        Zookeeper keeper = new Zookeeper("Alex");
        Zoo zoo = new Zoo("City Zoo");

        zoo.showZoo();
        animal1.showInfo();
        animal2.showInfo();
        keeper.feedAnimal(animal1);
        keeper.feedAnimal(animal2);

        if (animal1.getAge() > animal2.getAge()) {
            System.out.println(animal1.getName() + " is older than " + animal2.getName());
        } else {
            System.out.println(animal2.getName() + " is older than " + animal1.getName());
        }
    }
}
