package inheritance;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound(); // woof
        feed(rocky);

        // Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound(); // woof
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound(); // meow
        ((Cat)sasha).scratch(); // Type Casting (down casting)
        feed(sasha);
    }

    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("here is your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here is your cat food");
        }
    }
}
