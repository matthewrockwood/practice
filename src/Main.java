public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(8,"red", 22, "Gas");
        Car car = new Car(4,"Green",22, "Gas", "Honda");

        vehicle.setColor("green");
        vehicle.setNumberOfWheels(4);
        vehicle.setFuelType("Diesel");
        vehicle.setEngineSize(4);

        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getEngineSize());
        System.out.println(vehicle.getFuelType());
        System.out.println(vehicle.getNumberOfWheels());

        car.honk();
        car.displayInfo();
    }

}