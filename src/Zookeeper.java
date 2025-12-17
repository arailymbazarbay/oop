public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " feeds " + animal.getName());
    }
}
