class Product {
    int id;
    String name;
    double price;

    void calculateDiscount(double discountPercent) {
        double discountAmount = (price * discountPercent) / 100;
        double discountedPrice = price - discountAmount;
        System.out.println("Discounted price is: " + discountedPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.id = 1;
        p.name = "Laptop";
        p.price = 50000;

        System.out.println("Product Name: " + p.name);
        System.out.println("Original Price: " + p.price);

        p.calculateDiscount(10);
    }
}