interface Animal3{
    public void sound();
    public void sleep();
}

class Pig implements Animal3{
    public void sound() {
        System.out.println("the pig says: no");
    }
    public void sleep() {
        System.out.println("the pig sleeps");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.sleep();
        myPig.sound();
    }
    
}
