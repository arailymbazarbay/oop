import java.util.Objects;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters (encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // method for polymorphism
    public String makeSound() {
        return "Animal sound";
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}




