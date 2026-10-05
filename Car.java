public class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        Car car3 = new Car("Ford", "Mustang", 2021);

        System.out.println(car1.brand + " - " + car1.model + " - " + car1.year);
        System.out.println(car2.brand + " - " + car2.model + " - " + car2.year);
        System.out.println(car3.brand + " - " + car3.model + " - " + car3.year);
    }
}
