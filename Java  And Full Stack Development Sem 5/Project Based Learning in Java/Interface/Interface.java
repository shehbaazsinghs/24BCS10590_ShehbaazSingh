interface Drivable {
    void drive();
}

class Vehicle {
    String brandName = "Maruti";
    String topSpeed = "10001 kmph";

    public static void move() {
        System.out.println("brrr brrr brrr.");
    }
}

class Car extends Vehicle implements Drivable {
    int numberOfSeats = 5;

    Car(String carBrand) {
        System.out.println("This is a car of brand: " + carBrand);
    }

    @Override
    public void drive() {
        System.out.println("grrr grrr grrr.");
    }

    public static void display() {
        System.out.println("Dekh laaa.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car myCar = new Car("Maruti");
        myCar.move();
        myCar.drive();
        myCar.display();
    }
}