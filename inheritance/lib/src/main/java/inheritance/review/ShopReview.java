package inheritance.review;

public class ShopReview extends Review{
    public ShopReview(String author, String text, int numOfStars){
        super.author = author;
        super.text = text;
        super.numOfStars = numOfStars;
    }

    @Override
    public String toString() {
        return "author: " + author + " "
                + "text: " + text + " "
                + "numOfStars: " + numOfStars;
    }
}
