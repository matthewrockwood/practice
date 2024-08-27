public class Car extends Vehicle{
    private String brand;


    Car(int numberOfWheels, String color, float engineSize, String fuelType,String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    public void honk(){
        System.out.println("Honk Honk");
    }
    public void displayInfo(){
        System.out.println("numberOfWheels " + numberOfWheels + " color " + color  + " engineSize " + engineSize  + " fuelType " + fuelType  + " brand " + brand );
    }

}
