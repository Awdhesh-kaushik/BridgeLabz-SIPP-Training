package JavaConstructors;

public class ProductInventory {
    public static void main(String[] args) {
        //Creating object pen
        Product pen = new Product("Pen",5);
        //Creating object noteBook
        Product noteBook = new Product("NoteBook",10);
        //creating object Book
        Product book = new Product("Book",15);

        //Displaying details of object pen
        pen.displayProductDetails();
        //Displaying details of object notebook
        noteBook.displayProductDetails();
        //Displaying details of object pen
        book.displayProductDetails();

        //Displaying total product
        Product.displayTotalProducts();
    }
}
class Product{

    //Instance variables for storing name and price of product
    String productName;
    int price;

    //Static variable that will count the total number of products
    static int totalProduct = 0;

    void displayProductDetails(){
        System.out.println("Product Name: " + this.productName+" and Price: " + this.price);
    }
    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProduct);
    }

    //Constructor for initialising objects
    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProduct += 1;
    }
}


