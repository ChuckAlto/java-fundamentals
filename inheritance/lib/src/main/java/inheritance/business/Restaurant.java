package inheritance.business;

public class Restaurant extends Business{
    public Restaurant(String name, String price) {
        super.name = name;
        super.price = price;
    }
    @Override
    public String toString() {
        String response = name + " " + price + " " +numOfStars;
        return response;
    }
}

