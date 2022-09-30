public class EnumTest {
    enum Level{
        LOW,MEDIUM,HIGH
    }
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        switch(myVar){
            case LOW:
                System.out.println("is Low");
                break;
            case MEDIUM:
                System.out.println("is Medium");
                break;
            case HIGH:
                System.out.println("is High");
                break;
            default:
                System.out.println("is Unknown");
        }

        for(Level myvar : Level.values()) {
            System.out.println(myvar);
        }
    }

}
