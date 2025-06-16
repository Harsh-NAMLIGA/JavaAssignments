class Car {
    String model;
    double price;
    static int carCount = 0;

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Toyota";
        c1.price = 10000;
        carCount++;

        Car c2 = new Car();
        c2.model = "Honda";
        c2.price = 12000;
        carCount++;

        Car c3 = new Car();
        c3.model = "Tesla";
        c3.price = 50000;
        carCount++;

        c1.display();
        c2.display();
        c3.display();

        System.out.println("Total cars created: " + carCount);
    }
}