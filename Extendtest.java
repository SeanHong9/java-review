class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("tuuuut");
    }
}

class Car1 extends Vehicle{
    public String modelName = "Mustang";
}

class Extendtest{
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.honk();
        myCar.modelName = "IDK";
        System.out.println(myCar.brand + "  " + myCar.modelName);
        
    }
}
