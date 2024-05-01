public class Car extends Vehicle{
    Car(String make) {
        this.make = make;
    }
    public void drive(){
        System.out.println("The " + make + " Drives!");
    }
}
