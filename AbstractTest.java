abstract class Animal1{
    public abstract void sound1();
    public void sleep(){
        System.out.println("ZZZ");
    }
}
class Dog1 extends Animal1{
    public void sound1(){
        System.out.println("The Dog makes a sound.");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
     
    Dog1 myDog = new Dog1();
    myDog.sound1();   
    }
}
