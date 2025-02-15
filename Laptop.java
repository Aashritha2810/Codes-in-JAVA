class Laptops{
    String brand;
    int price;
    String processor;
    String ram;

    Laptops(String laptopBrand, int laptopPrice, String laptopProcessor, String laptopRam){
        brand = laptopBrand;
        price = laptopPrice;
        processor = laptopProcessor;
        ram = laptopRam;
    }
    void displayDetails(){
        System.out.println("Brand: " + brand + " " + " Price: " + price + " " + "Processor: " + processor+ " Ram: " + ram);
    }
}

public class Laptop {
    public static void main(String[] args) {
        Laptops laptop = new Laptops("HP", 90000, "i7", "1TB");
        laptop.displayDetails();

        Laptops laptop2 = new Laptops("DELL", 50000, "i7", "32GB");
        laptop2.displayDetails();
    }
}
