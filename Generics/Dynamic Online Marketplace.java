interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name; this.price = price;
    }
    public void display() {
        System.out.println(name + " - $" + price);
    }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price * (1 - percentage / 100);
        System.out.println("Discounted: " + product.name + " -> $" + product.price);
    }
}
