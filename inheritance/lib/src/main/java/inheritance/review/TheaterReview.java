package inheritance.review;

public class TheaterReview extends Review{

    protected String movieName = "N/A";

    public TheaterReview(String author, String movieName, String text, int numOfStars){
        super.author = author;
        this.movieName = movieName;
        super.text = text;
        super.numOfStars = numOfStars;
    }

    public TheaterReview(String author, String text, int numOfStars){
        super.author = author;
        super.text = text;
        super.numOfStars = numOfStars;
    }

    public String getMovieName() {
        return movieName;
    }
    @Override
    public String toString() {
        return "author: " + author + " "
                + "movie: " + movieName + " "
                + "text: " + text + " "
                + "numOfStars: " + numOfStars;
    }
}
