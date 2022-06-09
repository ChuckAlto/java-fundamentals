package inheritance.business;

public class Shop extends Business{
    private String description;

    public Shop(String name, String price, String description) {
        super.name = name;
        super.price = price;
        this.description = description;
    }


    @Override
    public String toString() {
        return name + " " + price + " " + description;
    }
}