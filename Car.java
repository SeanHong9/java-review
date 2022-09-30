public class Car {
    int modelYear;
    String modelName;
    public Car(int Year, String Name) {
        modelYear = Year;
        modelName = Name;
    }
    public static void main(String[] args) {
         Car car1 = new Car(1,"Toyota");
         System.out.println(car1.modelName + " is build at: " + car1.modelYear);
    }
    
}
