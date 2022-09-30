class Animal{
    public void Sound(){
        System.out.println("The Animal makes a sound.");
    }
}
class Dog extends Animal{
    public void Sound(){
        System.out.println("The Dog makes a sound.");
    }
}
class Cat extends Animal{
    public void Sound(){
        System.out.println("The Cat makes a sound.");
    }
}
public class Sound {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        myAnimal.Sound();
        dog1.Sound();
        cat1.Sound();
    }
}
